package introcontrol.introcontrol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        System.out.println("Kérlek adj meg öt számot!");
        Scanner scanner= new Scanner(System.in);
        int sum=0;
        for ( int i=0;i<5;i++) {
            System.out.println("Kérlek add meg a"+(i+1)+". számot!");
            int number = scanner.nextInt();
            sum +=number;
        }
        System.out.println("az összeg"+sum);
    }
}
