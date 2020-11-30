package week05d03;

import java.util.List;

public class ListCounter {

    public int countALetters(List<String> list) {
        int count = 0;
        for (String b: list ) {
            if (b.toLowerCase().startsWith("a")) {
                count ++;
            }
        }
        return count;
    }


}
