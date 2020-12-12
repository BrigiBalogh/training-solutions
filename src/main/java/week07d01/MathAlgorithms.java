package week07d01;

public class MathAlgorithms {

    public static boolean isPrime(int x) {
        if (x < 1) {
            throw new IllegalArgumentException("Parameter is wrong !");
        }
        int divisors = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                divisors++;
            }
        }
        if (divisors == 2) {
            return true;
        }
        return false;
    }

    public static boolean isPrimeOtherWay(int x) {
        if (x< 1) {
            throw new IllegalArgumentException(" Parameter is wrong !");
        }
        if(x==1) {
            return false;
        }
        if(x==2) {
            return true;
        }
        for (int i = 2; i<=Math.sqrt(x); i++) {
            if (x % i== 0) {
                return false;
            }
        }
        return true;
    }
}
