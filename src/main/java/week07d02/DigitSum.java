package week07d02;

public class DigitSum {

    public int sumOFDigits(int mum) {
        int result = 0;
        String digits = String.valueOf(mum);
        for(int i =0; i< digits.length();i++) {
            digits.charAt(i);
        }
        return result;
    }

    public static int sumOfDigits(int x) {
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x =x / 10;
        }
        return sum;
    }
}

