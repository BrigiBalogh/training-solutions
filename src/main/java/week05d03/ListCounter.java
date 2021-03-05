package week05d03;

import java.util.List;

public class ListCounter {

    public int countALetters(List<String> words) {
        int count = 0;

        for (String s: words ) {
            if (s.toLowerCase().startsWith("a")) {
                count ++;
            }
        }
        return count;
    }


}
