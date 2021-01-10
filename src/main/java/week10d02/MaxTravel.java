package week10d02;

import java.util.List;

public class MaxTravel {

    public int getMaxIndex(List<Integer> stops) {
        int[] counters = count(stops);
        return max(counters);
    }

    private int[] count(List<Integer>numbers) {
        int[] counters = new int[30];
        for(int i : numbers) {
            counters[i]++;
        }
        return counters;
    }


    private int max(int[] counters) {
        int index = 0;
        for (int i = 1; i < counters.length; i++) {
            if ( counters[index] < counters[i]) {
                index = i;
            }
        }
        return index;
    }
}
