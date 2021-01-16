package week02d04;

import java.util.Scanner;

public class InputNames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayOfNames = new String[5];

        for (int i = 0; i < 5; i++ ) {
            System.out.println(" Kérem adja meg a nevét !");
            arrayOfNames[i] = scanner.nextLine();
        }

        for (int j; j < arrayOfNames.length; j++) {
            System.out.println((j+1) + ".name :"+arrayOfNames[j]);
        }
    }
}
