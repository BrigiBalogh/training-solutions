package week06d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {


    @Test
    public void getProductsByCategoryNameTest() {
        Store store = new Store(Arrays.asList(
                new Product("kenyér",Category.BAKEDGOODS, 500),
                new Product("kifli",Category.BAKEDGOODS, 150),
                new Product("tej",Category.DAIRY, 300),
                new Product("liszt",Category.OTHER, 300),
                new Product("sült krumpli",Category.FROZEN, 1000)
        ));



        assertEquals(2,store.getProductByCategoryName(Category.BAKEDGOODS));
        assertEquals(1,store.getProductByCategoryName(Category.FROZEN));
    }

}
