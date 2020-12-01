package week05d04;

import java.util.ArrayList;
import java.util.List;

public class Store {


    private List<Product> products = new ArrayList<>();



    public boolean addProduct(Product product) {
        if (isValid(product)) {
            products.add(product);
            return true;
        }
        return false;
    }

    public int getNumberOfExpired() {
        int count = 0;
        for ( Product v : products) {
            if (v.isExpired()) {
                count++;
            }
        }
        return count;
    }

    private boolean isValid( Product product) {
        if(containsByProductName(product) || product.isExpired()) {
            return false;
        }
        return true;
    }

    private boolean containsByProductName(Product product) {
        for (Product v : products){
            if(v.getProductName().equals(product.getProductName())) {
                return true;
            }
        }
        return false;
    }
}
