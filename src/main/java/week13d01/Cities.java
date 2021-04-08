package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Cities {

    public static final String LINE_SEPARATOR = ";";
    public static final int INDEX_OF_CITY = 1;
    public static final int INDEX_OF_POSTCODE = 0;
    public static final int INDEX_OF_PART = 2;


    public City findFirstCity (BufferedReader reader) {
        List<City> cities = citiesReader(reader);
        return getFirstCity(cities);
    }

    private City getFirstCity(List<City> cities) {
        if (cities.size() == 0) {
            throw new IllegalArgumentException("Lista is empty !");
        }
        cities.sort(new NameComparator());
        return cities.get(0);
    }

    private List<City> citiesReader(BufferedReader reader) {
        List<City> cities = new ArrayList<>();
        String line;
        try {
            skipHeader(reader);
            while ((line = reader.readLine()) != null) {
                if (!line.isEmpty()) {
                    City city = parseCity(line);
                    cities.add(city);
                }
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file",ioe);
        }
        return cities;
    }

    private City parseCity(String line) {
        String[] parts = line.split(LINE_SEPARATOR);
        City city;
        if (parts.length > 2) {
            String part = parts[INDEX_OF_PART];
            city = new City(parts[INDEX_OF_POSTCODE], parts[INDEX_OF_CITY], part);
        } else {
            city = new City(parts[INDEX_OF_POSTCODE], parts[INDEX_OF_CITY]);
        }
        return city;
    }

    public void skipHeader(BufferedReader reader) throws IOException {
        reader.readLine();
    }

    public static void main(String[] args) {
        Cities cities = new Cities();
        try(BufferedReader reader = Files.newBufferedReader(Path.of("iranyitoszamok-varosok-2021.csv"))){
           City first = cities.findFirstCity(reader);
            System.out.println(first);

        }catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file !",ioe);
        }
    }
}
