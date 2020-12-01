package week05d04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StoreTest {


    @Test
    public void addProductTest(){
        List<Product> testList =new ArrayList<>();
        Store store =new Store();

        assertFalse(store.addProduct(new Product("milk",2020,11,20)));
        assertTrue(store.addProduct(new Product("milk",2020,12,6)));

    }

    @Test
    public void getNumberOfExpired() {
        List<Product> testList = new ArrayList<>();
        testList.add(new Product("milk", 22020, 11,11));
        Store store = new Store();

        assertEquals(1,store.getNumberOfExpired());
    }
}
