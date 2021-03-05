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

        for (int j = 0; j < arrayOfNames.length; j++) {
            System.out.println((j+1) + ".name :"+arrayOfNames[j] + "\n");
        }
    }
}
  /*  Hozz létre egy InputNames Java osztályt, melynek van egy main metódusa. Ciklusban kérj be öt nevet!
   A neveket tárold el egy tömbben! Írd ki a tömb tartalmát, sortöréssel elválasztva
    (írd bele, hogy hanyadik elem - 1-től sorszámozva)! */