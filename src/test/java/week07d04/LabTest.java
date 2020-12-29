package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LabTest {

    @Test
    void testConstructor() {
        Lab lab = new Lab("Metódus túlterhelés");

        assertEquals("Metódus túlterhelés", lab.getTitle());
        assertFalse( lab.isCompleted());
        assertEquals(null, lab.getCompletedAt());
    }

    @Test
    void testConstructorWithParameter() {
        Lab lab = new Lab("Metódus túlterhelés", LocalDate.of(2020, 12, 10));

        assertEquals("Metódus túlterhelés", lab.getTitle());
        assertTrue( lab.isCompleted());
        assertEquals(LocalDate.of(2020, 12, 10),lab.getCompletedAt());
    }


    @Test
    void testComplete() {
        Lab lab = new Lab("Metódus túlterhelés");
        lab.complete();

        assertTrue(lab.isCompleted());
        assertEquals(LocalDate.now(), lab.getCompletedAt());
    }


    @Test
    void testCompleteWithParameter() {
        Lab lab = new Lab("Metódus túlterhelés");
        lab.complete(LocalDate.of(2020,12,10));


        assertTrue(lab.isCompleted());
        assertEquals(LocalDate.of(2020,12, 10), lab.getCompletedAt());
    }



}
