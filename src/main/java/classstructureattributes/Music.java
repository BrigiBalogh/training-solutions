package classstructureattributes;

import java.util.Scanner;

public class Music {


    public static void main(String[] args) {
        song song= new song();
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ki a kedvenc előadód ?");
        song.band =scanner.nextLine();
        System.out.println("Mi a kedvenc dalod címe?");
        song.title =scanner.nextLine();
        System.out.println("Hány perc hosszú?");
        song.lenght=scanner. nextInt();

        System.out.println(song.band+"-"+song.title+"("+song.lenght+"perc)");

    }
}
