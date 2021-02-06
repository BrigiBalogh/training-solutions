package collectionsLinkedList;

import java.util.*;

public class Draw {

    private List<Integer> lotteryMachine(int maxNumber){
        List<Integer>  numbers= new LinkedList<>();
        for (int i = 1; i <= maxNumber; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        return numbers;
    }

     public Set<Integer> drawNumbers(int drawCount, int maxNumber) throws IllegalArgumentException {
        if (maxNumber <= drawCount) {
            throw new IllegalArgumentException("Drawcount must be less then " + maxNumber + "!");
        }
        return new TreeSet<>(lotteryMachine(maxNumber));
     }
}
