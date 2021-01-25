package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    public List<String> wordsWithChar(List<String> words, char c) {

        List<String> filteredWords = new ArrayList<>();
        String s = String.valueOf(c);
        for (String word : words) {
            if (word.contains(s));
            filteredWords.add(word);
        }
        return filteredWords;
    }
}
