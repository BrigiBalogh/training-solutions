package week04d03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int number = random.nextInt(100) + 1;

        int guess = 0;
        int numberOfGuesses = 0;
        while (guess != number && numberOfGuesses < 6) {
            System.out.println("Kérlek írj be egy számot !");
            guess = Integer.parseInt(scanner.nextLine());
            numberOfGuesses ++;
            System.out.println(numberOfGuesses + ". Tipp .");
            if (guess < number) {
                System.out.println("Kisebb !");
            }
            if (guess > number) {
                System.out.println("Nagyobb !");
            }
            if (guess == number) {
                System.out.println("Eltaláltad ! ");
            }
        }
        if ( guess != 0);
        System.out.println(" Nem találtad el !");
    }
}
