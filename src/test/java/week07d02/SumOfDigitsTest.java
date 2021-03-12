package week07d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfDigitsTest {
    @Test
    public void normal() {
        assertEquals(6, DigitSum.sumOfDigits(123));
    }

    @Test
    public void zero() {
        assertEquals(0, DigitSum.sumOfDigits(0));
    }

    @Test
    public void bigNumber() {
        assertEquals(45, DigitSum.sumOfDigits(1234567890));
    }
}
