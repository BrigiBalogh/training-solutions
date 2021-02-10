package week14d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class HachikoWordCounter {

    public Map<String, Integer> countWords(BufferedReader reader, String ...words){
        String line;
        try{
            while ((line = reader.readLine()) != null)  {

            }
        }catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file !");
        }

    }

    public static void main(String[] args) {
        try(BufferedReader reader = Files.newBufferedReader(Path.of("hachiko.srt"))) {
            System.out.println(new HachikoWordCounter().countWords(reader,
                    "Hachiko", "haza", "pályudvar", "jó"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file !", ioe);
        }
    }
}
