package week05d04;

import java.time.LocalDate;

public class Product {


    private String productName;
    private LocalDate expireDate;


    public String getProductName() {
        return productName;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public Product(String productName, int year, int month, int day) {
        this.productName = productName;
        expireDate =LocalDate.of( year, month, day);
    }

    public boolean isExpired() {
        if(expireDate.isBefore(LocalDate.now())) {
            return true;
        }
        return false;
    }
}
