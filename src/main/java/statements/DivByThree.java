package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Kérlek,írj be egy egész számot !");
        int x= scanner.nextInt();
        System.out.println(x % 3==0 ?"osztható":"nem osztható");
    }
}
