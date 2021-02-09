package week13d05;

import java.util.HashSet;
import java.util.Set;

public class Letters {

    public int countCharacter(String word) {
        Set<Character> result = new HashSet<>();

        for (char c : word.toLowerCase().toCharArray()) {
            if (isCharEnglish(c)) {
                result.add(c);
            }
        }
        return result.size();
    }

    private boolean isCharEnglish( char c) {
        return c >= 'a' && c <= 'z';

    }
}
