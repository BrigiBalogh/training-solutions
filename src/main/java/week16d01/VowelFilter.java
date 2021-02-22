package week16d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class VowelFilter {

    public static final String VOWELS = "aáeéiíoóöőuúüű";

    public String filterVowels(BufferedReader reader) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine())  != null) {
            String s = line.toLowerCase();
            for (char c: s.toCharArray()) {
                //if (VOWELS.indexOf(c) == -1) {
                if (!VOWELS.contains(c+"")) {
                    sb.append(c);
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("data.csv"))) {
            new VowelFilter().filterVowels(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

}
