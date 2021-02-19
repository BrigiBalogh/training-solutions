package week16d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class VowelFilter {

    public static final String VOWELS = "aáeéiíoóöőuúüű";

    public List<String> filterVowels(BufferedReader reader) throws IOException {
        List<String> ret = new ArrayList<>();
        String line;
        while ((line = reader.readLine())  != null) {
            String s = line.toLowerCase();
            String t = "";
            for (char c: s.toCharArray()) {
                //if (VOWELS.indexOf(c) == -1) {
                if (!VOWELS.contains(c+"")) {
                    t += c;
                }
            }
            ret.add(t);
        }
        return ret;
    }

    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("data.csv"))) {
            new VowelFilter().filterVowels(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

}
