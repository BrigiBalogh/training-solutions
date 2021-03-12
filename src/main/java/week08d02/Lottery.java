package week08d02;

import java.util.*;

public class Lottery {


    public List<Integer> getNumbersOneLoop(int interval, int numbers,int seed) {
        List<Integer> result = new ArrayList<>();
        Random random = new Random(seed);

        while (result.size() < numbers) {
            int number = random.nextInt(interval) + 1;
            if ( !result.contains(number)){
                result.add(number);
            }
        }
        return result;
    }

    public Set<Integer> getNumbersOneLoopSet(int interval, int numbers,int seed) {
        Set<Integer> result = new TreeSet<>();
        Random random = new Random(seed);

        while (result.size() < numbers) {
            int number = random.nextInt(interval) + 1;
            result.add(number);
        }
        return result;
    }
}
/*   Készíts a week08d02 csomagban egy Lottery osztályt, melynek legyen egy getNumbers() metódusa,
 ami visszaad egy listát amiben 5 véletlen szám van 1-90 között,
 tehát kvázi készíts egy lottósorsoló programot. A sorrendre nem kell figyelni, a lényeg,
  hogy a számok különbözők legyenek!*/