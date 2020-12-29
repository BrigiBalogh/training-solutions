package week07d04;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingListTest {

    @Test
    void TestSum8() throws IOException {
        System.out.println(Path.of(".").toRealPath());

        ShoppingList shoppingList = new ShoppingList();
        long result = shoppingList.calculateSum("src/test/resources/week07d04/list.csv");
        assertEquals(70,result);
    }
}
