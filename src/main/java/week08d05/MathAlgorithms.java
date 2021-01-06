package week08d05;

import java.util.ArrayList;
import java.util.List;

public class MathAlgorithms {

    public int greatestCommonDivisor(int a, int b) {
        List<Integer>divisors = getCommonDivisors(a,b);
        int max = divisors.get(0);

        for (int i = 1; i< divisors.size(); i++) {
            if ( divisors.get(i) > max) {
                max = divisors.get(i);
            }
        }
        return max;
    }


    private List<Integer> getCommonDivisors(int a, int b) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i== 0 ) {
                result.add(i);
            }
        }
        return result;
    }

    public int greatestCommonDivisor1(int a, int b) {
        int result = 1;
        for( int i = 2; i<= a && i<= b; i++) {
            if (a % i == 0 && b % i == 0 ) {
                i = result;
            }
        }
        return result;
    }


    public int greatestCommonDivisor2(int a, int b) {
        int min = a;
        if( b <min) {
            min = b;
        }

        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 1;
    }
}
