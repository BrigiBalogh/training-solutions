package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Index {

    public int wordCounter(String word, BufferedReader reader) {

        try  {
            String line;
            int counter = 0;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains(word)) {
                    counter ++;
                }
            }
            return counter;
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }
    }

    public static void main(String[] args) {
     try {
        BufferedReader reader=Files.newBufferedReader(Path.of("index.html"));
        Index index = new Index();
        System.out.println(index.wordCounter("koronavírus", reader));
    }catch (IOException ioe){
         throw new IllegalStateException("Can not read",ioe);
     }
    }
}
