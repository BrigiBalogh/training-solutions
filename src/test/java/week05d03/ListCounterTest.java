package week05d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListCounterTest {


    @Test
    void startsWithATest() {
        ListCounter listCounter = new ListCounter();
        List<String> testList = Arrays.asList("alma", "banán", "ananász", "narancs", "mangó");


        assertEquals(2, listCounter.countALetters(testList));
    }

    @Test
    void startsWithAEmtyListTest() {
        ListCounter listCounter = new ListCounter();
        List<String> testlist = new ArrayList<>();

        assertEquals(0, listCounter.countALetters(testlist));
    }


    @Test
    void startsWithANonAListTest() {
        ListCounter listcounter = new ListCounter();
        List<String> testlist = Arrays.asList("banán", "narancs", "mangó");

        assertEquals(0, listcounter.countALetters(testlist));
    }

}

