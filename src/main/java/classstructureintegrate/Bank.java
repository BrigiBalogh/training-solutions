package classstructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adja meg a számlaszámát !");
        String accountNumber = scanner.nextLine();

        System.out.println("Kérem,adja meg a számla tulajdonosát!");
        String owner = scanner.nextLine();

        System.out.println("Kérem,adja meg a nyitóösszeget");
        int amount = scanner.nextInt();
        scanner.nextLine();

        BankAccount account1 = new BankAccount(accountNumber, owner, amount);

        System.out.println("Kérem, adja meg a számlaszámát !");
        String accountNumber2 = scanner.nextLine();

        System.out.println("Kérem,adja meg a számla tulajdonosát !");
        String owner2 = scanner.nextLine();

        System.out.println("Kérem,adja meg a nyitóösszeget !");
        int amount2 = scanner.nextInt();

        BankAccount account2 = new BankAccount(accountNumber, owner, amount);

        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());

        System.out.println("Mennyit szeretne befizetni az egyes számlára?");
        int depositAmount = scanner.nextInt();
        account1.deposit(depositAmount);

        System.out.println(account1.getInfo());

        System.out.println("Mennyit szeretne felvenni a második számláról ? ");
        int withdrawAmount = scanner.nextInt();
        account2.withdraw(withdrawAmount);

        System.out.println(account2.getInfo());

        System.out.println("Mennyit szeretne utalni a második számlára ?");
        int transferAmount = scanner.nextInt();
        account1.transfer(account2, transferAmount);

        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());
    }
}




