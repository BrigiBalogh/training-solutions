package week14d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClassNotebookTest {

    @Test
    void sortNotebook() {

        ClassNotebook cn =new ClassNotebook(new ArrayList<>(List.of(new Student("John"), new Student("Jane"), new Student("Bill"), new Student("Jack;"))));

        List<Student> result = cn.sortNotebook();

        assertEquals("john", cn.getStudents().get(0).getStudentName());

        assertEquals("Bill", result.get(0).getStudentName());
        assertEquals("John", result.get(3).getStudentName());
    }
}