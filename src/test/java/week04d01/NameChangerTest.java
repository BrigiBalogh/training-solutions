package week04d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameChangerTest {

    @Test
    void TestChangeFirstName() {
        NameChanger nameChanger = new NameChanger("Doe John");

        nameChanger.changeFirstName("Jack");
        assertEquals("Jack Doe",nameChanger.getFullName());

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()  -> new NameChanger(""));
        assertEquals("Invalid name :", iae.getMessage());
    }

    @Test
    void testNameChanger() {
        NameChanger nameChanger = new NameChanger("Doe John");
        assertEquals("Doe john",nameChanger.getFullName());
    }
}