package week13d04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Map;

public class TemplateEngine {

    public void merge(BufferedReader reader, Map<String, Object> values, BufferedWriter writer) {
        String line;
        try{
            while ((line = reader.readLine()) != null);

            writer.write(line);
            writer.write("\n");

        }catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file !", ioe);
        }
    }

    public static void main(String[] args) {
        Path template = Path.of("template.txt");
        Map<String, Object> values =
                Map.of("nev", "John Doe",
                        "datum", LocalDate.of(2021,1,1),
                        "osszeg",456.12,
                        "hatarido",LocalDate.of(2021,2,1));

        StringWriter sw = new StringWriter();
        try {
            BufferedWriter writer = new BufferedWriter(sw);
            BufferedReader reader = Files.newBufferedReader(template);
            new TemplateEngine().merge(reader,values, writer);

        }catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file !", ioe);
        }

        System.out.println(sw.toString());

    }
}
