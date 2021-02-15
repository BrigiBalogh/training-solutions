package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Histogram {

    public String createHistogram(BufferedReader reader) throws IOException {
        String line;
        String  star = "";
        while ((line = reader.readLine())  != null)
        {
           Integer convert = Integer.parseInt(line);
            star = "";
           for (int i = 1; i <= convert;i++)
           {
               star += "*";
           }
            System.out.println(star);
            return star;

        }
        return null;
    }

    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("histogram.txt"))) {
            new Histogram().createHistogram(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
