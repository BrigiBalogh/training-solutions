package week07d02;

public class DigitSum {

    public static int sumOFDigits(int mum) {
        int result = 0;
        String digits = String.valueOf(mum);
        for(int i =0; i< digits.length();i++) {
            result += digits.charAt(i) - '0';
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

    public static void main(String[] args) {
        int sum = sumOFDigits(123);
        System.out.println(sum);
    }
}

/*       Készíts egy DigitSum osztályt és benne sumOfDigits(int x) metódus mely visszaadja
       a paraméterül kapott szám számjegyeinek összegét! pl.: 123 esetén a visszatérési érték 6.          */
