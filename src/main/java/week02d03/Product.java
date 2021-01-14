package week02d03;

public class Product {

    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public boolean areTheyEqual(Product p){
        return p.name == name && Math.max(p.code.length(),code.length())-Math.min(p.code.length(),code.length()) < 2 ? true : false;

    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }


    public static void main(String[] args) {

        Product tej = new Product("tej","12345");
        Product frissTej = new Product("tej","12345");
        Product tartósTej = new Product("tej","123456");

        System.out.println(tej.areTheyEqual(frissTej));
        System.out.println(frissTej.areTheyEqual(tartósTej));

    }
}
