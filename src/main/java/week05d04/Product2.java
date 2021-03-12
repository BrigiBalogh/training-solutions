package week05d04;

public class Product2 {

    private static final double CURRENT_RATE_HUF = 300;

    private long price;
    private Currency currency;

    public Product2(long price, Currency currency) {
        this.price = price;
       this.currency = currency;
       if (currency != Currency.USD && currency != Currency.HUF) {
           throw new IllegalArgumentException("Invalid currency !");
       }
    }


        public double convertPrice(Currency currency) {
            if (currency == this.currency) {
                return price;
            } else if (this.currency == Currency.HUF && currency == Currency.USD) {
                return price / CURRENT_RATE_HUF;
            } else if (this.currency == Currency.USD && currency == Currency.HUF){
                return price * CURRENT_RATE_HUF;
            } else {
                throw new IllegalArgumentException("unsupported currency: " + currency);
            }
        }


    public static void main(String[] args) {
        Product2 product2 = new Product2(1000,Currency.USD);
        System.out.println(product2.convertPrice(Currency.HUF));

        Product2 product3 = new Product2(1000,Currency.HUF);
        System.out.println(product3.convertPrice(Currency.USD));

        try {
            Product2 product4 = new Product2(1000, Currency.EUR);
            System.out.println(product4.convertPrice(Currency.HUF));
        } catch (IllegalArgumentException ex) {
            System.out.println("Invalid currency!");
        }

    }
}
