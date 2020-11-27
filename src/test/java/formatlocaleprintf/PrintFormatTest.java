package formatlocaleprintf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PrintFormatTest {

    @Test
    public void lessParameterThenInformatStringShouldThrowException() throws IllegalArgumentException {

        int i = 6;
        int j = 7;

        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new PrintFormat().checkException("%d %d %d", i, j);
        });
        assertEquals("Less objects then expected in format String !", ex.getMessage());
    }

    @Test
    public void testPrintFormattedTextWDouble() {
        Double d = 55120.134;

        assertEquals("Total is:55120,13 Ft ", new PrintFormat().printFormattedText(d));
    }


    @Test
    public void testPrintFormattedTextWintString() {

        String fruit = "APPLES";
        int count = 6;

        assertEquals("We counted 6 APPLES in the basket", new PrintFormat().printFormattedText(count, fruit));
    }

    @Test
    public void testPrintFormattedTextWIntegerRightEdge() {
        int i = 7;
        int j = 77;
        int k = 777777;

        assertEquals("Right edge of numbers set at 4 spaces from text: " + i, new PrintFormat().printFormattedText(i));
        assertEquals("Right edge of numbers set at 4 spaces from text: " + j, new PrintFormat().printFormattedText(j));
        assertEquals("Right edge of numbers set at 4 spaces from text: " + k, new PrintFormat().printFormattedText(k));
    }

    @Test
    public void testPrintFormattedTextWMultipleObject() {
        int i = 5;
        int j = 6;
        int k = 7;

        assertEquals("Multiple objects containing text:" + i + "\t" + j + "\t" + k, new PrintFormat().printFormattedText(i, j, k));
    }
}
