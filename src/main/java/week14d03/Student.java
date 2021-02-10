package week14d03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student  implements Comparable<Student> {

    private Map<String, List<Integer>> diary = new HashMap<>();
    private String studentName;

    public Student( String studentName) {
        this.studentName = studentName;
    }

    public void markAddToSubject(String subject, int mark) {
        if (!diary.containsKey(subject)) {
            diary.put(subject, new ArrayList<>());
        }
        diary.get(subject).add(mark);
    }

    @Override
    public int compareTo(Student o) {
        return studentName.compareTo(o.studentName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                '}';
    }

    public Map<String, List<Integer>> getDiary() {
        return diary;
    }

    public String getStudentName() {
        return studentName;
    }
}
