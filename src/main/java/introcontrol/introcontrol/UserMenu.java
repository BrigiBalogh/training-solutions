package introcontrol.introcontrol;

import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {
        System.out.println("1.Felhasználok listázása");
        System.out.println("2.Felhasználó felvétele");
        System.out.println("többi:kilépés");

        Scanner scanner= new Scanner(System.in);
        int selected= scanner.nextInt();

        if (selected==1) {
            System.out.println("Felhasználok listázása");
        }
        if (selected==2){
            System.out.println("Felhasználó felvétele");
        }

    }
}
