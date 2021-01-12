package week10d05;

import java.util.Arrays;

public class Calculator {


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
