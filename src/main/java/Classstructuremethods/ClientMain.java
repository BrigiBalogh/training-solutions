package Classstructuremethods;

import java.util.Scanner;

public class ClientMain
{
    public static void main(String[] args)
    {
        String name="John Doe";
        String address="Budapest Arany u. 2";
        int year= 1999;
        Scanner scanner= new Scanner(System.in);
        Client client= new Client();
        client.setName(name);
        client.setYear(year);
        client.setAddress(address);

        System.out.println("Név: " + client.getName());
        System.out.println("Születési év: " + client.getYear());
        System.out.println("Lakcím: " + client.getAddress());

        client.migrate("1234 Pest, Lajos u. 10.");

        System.out.println("Új lakcím: " + client.getAddress());


    }
}
