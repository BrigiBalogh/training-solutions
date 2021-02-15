package week16d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class VowelFilter {

    public static final String VOWELS = "aeiouáéóüúíő";

    public List<String> filterVowels(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine())  != null) {
            String s = line;
            for (char c: s.toCharArray()) {
                if ()
            }


        }
    }

    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("data.csv"))) {
            new VowelFilter().filterVowels(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

}
