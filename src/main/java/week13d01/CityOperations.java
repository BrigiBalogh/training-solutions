package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CityOperations {

    public String findCityWithMaxLength(BufferedReader reader) {

        try{
            return findCity(reader);
        }
        catch( IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }

    }

    public String findCity(BufferedReader reader) throws IOException {
        String maxCityName = " ";
        int number = 0;
        skipHeader(reader);
        number++;
        String line;
        while((line = reader.readLine()) != null) {
            number++;
            String name = getNameFromLine(line, number);
            if (name.length() > maxCityName.length() ) {
                maxCityName = name;
            }
        }
        if (maxCityName.equals(" ")) {
            throw new IllegalArgumentException("No city found");
        }
        return maxCityName;
    }

    private void skipHeader(BufferedReader reader){
        reader.lines();
    }

    private String getNameFromLine(String line, int number) {
        String[] parts = line.split(";");
        if (parts.length <= 1) {
            throw new IllegalArgumentException("Illegal line" + number + ":" + line);
        }
        String name = parts[1];
        return name;
    }

    public static void main(String[] args) {
        try (BufferedReader bufferedReader =
                     Files.newBufferedReader(Path.of("iranyitoszamok-varosok-2021.csv"))){
            String city = new CityOperations().findCityWithMaxLength(bufferedReader);
        }
        catch(IOException ioe) {
            throw new IllegalStateException("Can not read file");
        }

    }

}
