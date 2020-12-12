package week07d01;

public class Fibonacci {


    public static long fib(int n) {
        if( n < 0) {
            throw new IllegalArgumentException("Nem lehet az érték kevesebb, mint 0 !");
        }
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        if(RESULTS[n]==null) {
            RESULTS[n] = fib(n - 1) + fib(n - 2);
        }
        return RESULTS[n];
    }

    private static final Long[] RESULTS = new Long [Integer.MAX_VALUE];

}
