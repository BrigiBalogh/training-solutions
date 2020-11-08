package statements;

import java.util.Scanner;

public class InvestmentMain {

    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Befektetés összege");
        int amount=scanner.nextInt();
        System.out.println("kamatláb:");
        int interesRate= scanner.nextInt();

        Investment invesment= new Investment(amount,interesRate);

        System.out.println("Tőke:"+invesment.getFund());
        System.out.println("Hozam 50 napra:"+invesment.getYield(50));
        System.out.println("Ki vett összeg 80 nap után :"+invesment.close(80));
        System.out.println("Ki vett összeg 90 nap után:"+invesment.close(90));
    }
}