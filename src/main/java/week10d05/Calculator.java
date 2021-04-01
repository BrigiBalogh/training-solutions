package week10d05;

import java.util.Arrays;

public class Calculator {
    private int mathMin(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public void findMinSum(int[] arr) {

        if (arr == null) {
            throw new IllegalArgumentException( "Nincs tömb megadva !");
        }

        if (arr.length < 1) {
            throw new IllegalArgumentException(" Üres tömb !");
        }

        Arrays.sort(arr);

        int arrLength = Math.min(arr.length, 4);
        int sum = 0;

        for ( int i = 0; i < arrLength; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
/*   Készítsünk egy Calculator nevű osztályt, melynek van egy findMinSum(int[] arr) metódusa.
 A metódus feladata, hogy kiírja a legkisebb összegeket 4 számból,
 amiket lehetséges összerakni az arr tömb elemeiből. Példa: ha az arr tartalma [1, 3, 5, 7, 9],
  akkor a minimum összeg 1+3+5+7=16.      */