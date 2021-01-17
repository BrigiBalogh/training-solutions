package week02;

import java.util.Scanner;

public class Controller {

    private Office office = new Office();

    public void readOffice() {
        System.out.println("Hány darab tárgyalóra van szüksége ?");
        Scanner scanner = new Scanner(System.in);
        int numberOfMeetingRooms = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i <numberOfMeetingRooms; i++ ) {
            System.out.println("Kérem, adja meg a tárgyaló nevét !");
            String name = scanner.nextLine();

            System.out.println("Kérem adja meg, a szélességét a tárgyalónak ! ");
            int width = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Kérem adja meg, a hosszát is !");
            int length = scanner.nextInt();
            scanner.nextLine();

            MeetingRoom meetingRoom = new MeetingRoom(name, width, length);
            office.addMeetingRoom(meetingRoom);
        }

        System.out.println(office.getMeetingRooms());

    }

    public void printMenu() {
        System.out.println(" 1. Tárgyalók sorrendben\n"+
        "2. Tárgyalók visszafele sorrendben\n"+
        "3. Minden második tárgyaló\n"+
        "4. Területek\n"+
        "5. Keresés pontos név alapján\n"+
        "6. Keresés névtöredék alapján\n"+
        "7. Keresés terület alapján");
    }

    public void runMenu() {
        System.out.println(" Kérem , válasszon menűpontot !");
        Scanner scanner = new Scanner(System.in);
        int menuItem = scanner.nextInt();
        scanner.nextLine();

        if (menuItem == 1) {
            office.printNames();
        }

        if (menuItem == 2) {
            office.printNamesReverse();
        }

        if (menuItem == 3) {
            office.printEventNames();
        }
        if (menuItem == 4) {
            office.printAreas();
        }
        if (menuItem == 5) {
            office.printMeetingRoomsWithNames(String name);
        }
        if (menuItem == 6) {
            office.printMeetingRoomsContains(String part);
        }
        if (menuItem == 7) {
            office.printMeetingRoomsContains(String part);
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.readOffice();
        controller.printMenu();
        controller.runMenu();
    }
}
