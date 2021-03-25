package week11d01;

import java.util.ArrayList;
import java.util.List;

public class PairFinder {

    public int findPairs(int[] arr) {
        if (arr == null) {
            throw new NullPointerException(" Array is null.");
        }
        int count = 0;
        List<Integer> singles = new ArrayList<>();

        for (int number : arr) {
            if (singles.contains(number)) {
                count++;
            }else{
                singles.add(number);
            }
        }
        return count;
    }
}
