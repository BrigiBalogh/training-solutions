package week08d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {

    private List<Country> countries = new ArrayList<>();

    public void readFromFile(String path) {

        try (BufferedReader br = Files.newBufferedReader(Path.of(path))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                countries.add(createCountryFromLine(line));
            }

        } catch (IOException e) {
            throw new IllegalArgumentException("Something went wrong !");
        }
    }

    public Country mostPopulation() {
        Country most = countries.get(0);

        for (Country c : countries) {
            if (c.getPopulation() > most.getPopulation()) {
                most = c;
            }
        }
        return most;
    }

    private Country createCountryFromLine(String line) {
        String[] temp = line.split("");
        return new Country(temp[0], Integer.parseInt(temp[1]),
                Integer.parseInt(temp[2]), Integer.parseInt(temp[3]));
    }

    public List<Country> getCountries() {
        return  new ArrayList<> (countries);
    }
}
