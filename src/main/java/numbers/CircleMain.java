package numbers;

import java.util.Scanner;

public class CircleMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A kőr1 átmérője");
        int diameter1 = scanner.nextInt();
        Circle circle1 = new Circle(diameter1);

        System.out.println("A kör2 átmérője");
        int diameter2 = scanner.nextInt();
        Circle circle2 = new Circle(diameter2);

        System.out.println("kör1 kerülete:" + circle1.perimeter());
        System.out.println("kör1 területe:" + circle1.area());
        System.out.println("kör2 kerülete:" + circle2.perimeter());
        System.out.println("kör1 területe:" + circle2.area());
    }
}
