package week02d03;

public class Product {

    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public boolean areTheyEqual(Product p){
        return p.name.equals( name )&& Math.max(p.code.length(),code.length())-Math.min(p.code.length(),
                code.length()) < 2 ? true : false;

    }

    public boolean areTheyEqual2(Product p) {
        if (!p.name.equals(name)) {
            return false;
        }
        if (p.code.length() > code.length()) {
            return p.code.length() - code.length() <= 1;
        } else {
            return code.length() - p.code.length() <= 1;
        }
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
 /*  Írj egy Product oszályt String name és String code attribútumokkal! Legyen egy konstruktora
 a két attribútummal! Legyen egy areTheyEqual() metódusa, mely kap egy másik Product példányt,
 és eldönti, hogy azonos-e az adott példánnyal. Két termék akkor egyezik, ha a nevük megegyezik.

        Bónusz: szigorúbb egyelőség a feltételre: a két termék kódjának hosszának különbsége
         maximum egy karakter lehet. */