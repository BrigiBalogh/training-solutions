package introcontrol.introcontrol;

import java.util.Scanner;

public class Qualifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number <= 100) {
            System.out.println("száz vagy kisebb");
        } else {
            System.out.println("nagyobb,mint száz");
        }
    }
}
