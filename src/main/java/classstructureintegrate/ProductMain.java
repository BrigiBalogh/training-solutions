package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem,adja meg a termék nevét:");
        String name = scanner.nextLine();

        System.out.println("Kérem,adja meg a termék árát:");
        int price = scanner.nextInt();

        Product product = new Product(name, price);
        System.out.println(product.getName() + ":" + product.getPrice()+"Ft");

        product.increasePrice(50);
        System.out.println(product.getName() + ":" + product.getPrice()+"Ft");

        product.decreasePrice(40);
        System.out.println(product.getName() + ":" + product.getPrice()+"Ft");
    }
}
