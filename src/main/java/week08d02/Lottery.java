package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {


    public List<Integer> getNumbersOneLoop(int interval, int numbers,int seed) {
        List<Integer> result = new ArrayList<>();
        Random random = new Random();

        while (result.size() < numbers) {
            int number = random.nextInt(interval) + 1;
            if ( !result.contains(number)){
                result.add(number);
            }
        }
        return result;
    }
}
