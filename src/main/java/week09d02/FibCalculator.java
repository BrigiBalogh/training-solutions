package week09d02;

public class FibCalculator {

    private static int[] FIB_NUMS = new int[1000];

    public static long sumEvens(int bound) {

        int sum = 0;
        int fibN = 0;

        while (fib(fibN) < bound ) {
            if (FIB_NUMS[fibN] % 2 == 0) {
                sum += FIB_NUMS[fibN];
            }
            fibN++;
        }
        return sum;
    }

   public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        }else {
            return fib(n-1) +fib(n-2);
        }

    }
}
