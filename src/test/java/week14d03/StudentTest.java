package week14d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


    @Test
    public void createStudentTest(){
        Student s = new Student("John");

        assertEquals("john", s.getStudentName());
        assertEquals(0, s.getDiary().size());
    }

    @Test
    public void markAddToSubjectTest() {
        Student s = new Student("John");

        s.markAddToSubject("math", 4);
        assertEquals(1,s.getDiary().size());

        s.markAddToSubject("math", 5);
        assertEquals(1,s.getDiary().size());

        s.markAddToSubject("biology", 3);
        assertEquals(2,s.getDiary().size());

        assertEquals(5, s.getDiary().get("math").get(1));
        assertEquals(3, s.getDiary().get("biology").get(0));
    }
}