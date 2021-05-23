package week14d05;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class WordCounter {

    public static final String NAME_OF_THE_DOG = "Hach";
    public static final String FILE_ENCODING = "Windows-1250";

    private static boolean contantsTheName(String line) {
        return line.contains(NAME_OF_THE_DOG);
    }

    private static Stream<? extends String> lineToWords(String line) {
        return Arrays.stream(line.split(" "));
    }

    public long countName(String file) {
        Path path = Path.of(file);
        try {
            Files
                .lines(path, Charset.forName(FILE_ENCODING))
                    .filter(WordCounter::contantsTheName)
                    .flatMap(WordCounter::lineToWords)
                    .filter(WordCounter::contantsTheName)
//                    .peek(s -> System.out.println(s))
                    .count()
            ;

        }catch (IOException ioe) {
            throw new IllegalStateException(" Cannot read file.",ioe);
        }
        return 0;
    }

    public long countName(String file, String name) {
        Path path = Path.of(file);
        try(Stream<String> lines = Files
          .lines(path, Charset.forName(FILE_ENCODING))) {
            return lines
                    .filter(WordCounter::contantsTheName)
                    .mapToInt(s -> CountNames(s,name))
                    .sum();
        }catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }

    private int CountNames(String s, String name) {
        String[] words = s.split(" ");
        int count = 0;
        for (String word : words) {
            if (word.contains(name)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        long count = new WordCounter().countName("hachiko.srt");
    }
}
