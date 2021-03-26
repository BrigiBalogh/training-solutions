package week11d01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairFinder {

    public int findPairs(int[] arr) {
        if (arr == null) {
            throw new NullPointerException(" Array is null.");
        }
        int count = 0;
        List<Integer> singles = new ArrayList<>();
        Set<Integer> singlesSet = new HashSet<>();
        for (int number : arr) {
            if (singles.contains(number)) {
                count++;
                Integer i = number;
                singles.remove(i);
            }else{
                singles.add(number);
            }
        }
        return count;
    }
}
