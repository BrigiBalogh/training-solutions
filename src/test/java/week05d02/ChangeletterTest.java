package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeletterTest {


    @Test
    void testChangeLetters() {
        assertEquals("*rv*zt*r*",new Changeletter().changeVowels("arvizturo"));
    }
}
