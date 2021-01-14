package week02d03;

import java.util.Scanner;

public class Phone {

    private String type;
    private int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public int getMem() {
        return mem;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }


    public static void main(String[] args) {
        Phone phone = new Phone("huewei sy 7",64);
        Phone phoneOld = new Phone("huewei p 40",64);
        System.out.println("Ez egy "+phone.type+ "telefon ,"+ phone.mem + "GB memoriával.");
        System.out.println("Ez egy "+phoneOld.type+ "telefon ,"+ phoneOld.mem + "GB memoriával.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a telefon típusát");
        String type = scanner.nextLine();
        System.out.println("Adja meg a telefon memória méretét.");
        int mem =Integer.parseInt(scanner.nextLine());
    }
}
