package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MathAlgorithmsTest {


    @Test
    public void isPrimeTest(){
        assertFalse(MathAlgorithms.isPrime(1));
        assertFalse(MathAlgorithms.isPrime(4));
        assertTrue(MathAlgorithms.isPrime(2));
        assertTrue(MathAlgorithms.isPrime(17));
    }
}
