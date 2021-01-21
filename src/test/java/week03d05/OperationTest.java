package week03d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
    void testGetResult() {

        Operation operation = new Operation("16 + 32");

        int result = operation.getResult();
        assertEquals(48, result);
    }
}