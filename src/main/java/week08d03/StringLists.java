package week08d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringLists {

    public List<String> stringListsUnion(List<String>first, List<String>second) {
        List<String> result = new ArrayList<>(first);

        for (String s : second) {
            if (!result.contains(s)) {
                result.add(s);
            }
        }
        Collections.sort(result);
        return result;

    }

    public List<String> shortestWords(List<String> words) {
        List<String> result = new ArrayList<>();

        int minLength = words.get(0).length();
        for (String s : words) {
            if (s.length() < minLength) {
                result.clear();
                minLength = s.length();
            }
            if (s.length() == minLength) {
                result.add(s);
            }
        }
        return result;
    }
}
