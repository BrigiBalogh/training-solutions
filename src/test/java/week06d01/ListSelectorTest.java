package week06d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListSelectorTest {

    ListSelector fruits = new ListSelector();


    @Test
    public void getEvenElementsTest() {
        assertEquals(" [almabarack]", fruits.getEvenElements(Arrays.asList("alma","körte","barack")));
    }

    @Test
    public void getEvenElementsWithNull() {
        assertThrows(IllegalArgumentException.class, () -> fruits.getEvenElements(null));
    }

    @Test
    public void getEvenElementsWithEmptyList() {
        assertEquals(" ",fruits.getEvenElements(new ArrayList<>()));
    }
}
