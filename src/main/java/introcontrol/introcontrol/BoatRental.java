package introcontrol.introcontrol;

import java.util.Scanner;

public class BoatRental {

    public static void main(String[] args) {
        int boat1Capacity=5;
        int boat2Capacity=2;
        int boat3Capacity=3;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Hány főre szeretnék kibérelni a csónakot");
        int numberOfPeople= scanner.nextInt();

        int freePlaces=10;
        int freeBoats=3;

        if (numberOfPeople>3) {
            System.out.println("5 személyes csónak");
            numberOfPeople=numberOfPeople-5;
            freeBoats--;
            freePlaces=freePlaces-5;
        }
        if (numberOfPeople>2) {
            System.out.println("3 személyes csónak");
            numberOfPeople=numberOfPeople-3;
            freeBoats--;
            freePlaces=freePlaces-3;
        }
        if (numberOfPeople>0) {
            System.out.println("2 személyes csónak");
            numberOfPeople=numberOfPeople-2;
            freeBoats--;
            freePlaces=freePlaces-2;
        }
        if (numberOfPeople>0) {
            System.out.println("Nincs elég szabad hely.");
        }else {
            System.out.println("Szabad helyek száma:"+freePlaces);
            System.out.println("Szabad csónakok száma:"+freeBoats);
        }
    }
}
