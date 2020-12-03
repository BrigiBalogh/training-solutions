package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static sun.util.locale.LocaleUtils.isEmpty;

public class ClassRecords {

    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public boolean addStudent(Student student) {
        if(getStudentByNameOrNull(student.getName()) !=null) {
            return false;
        }
        return students.add(student);

    }

    public double calculateClassAverage(){
        if(students.isEmpty()) {
            throw new ArithmeticException("No student in the class !");
        }
        double classAverage = 0;
        int countStudent= 0;
        for (Student student : students) {
            double studentAverage = student.calculateAverage();
            if( studentAverage != 0){
                classAverage += studentAverage;
                countStudent++;
            }
        }
        if (countStudent==0) {
            throw new ArithmeticException(" No marks !");
        }
        return Math.round(100 * classAverage/ countStudent)/100;

    }

    public double calculateClassAverageBySubject(Subject subject){

    }

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public Student findStudentByName(String name){
        if(students.isEmpty()) {
            throw new IllegalStateException(" Nincs találat!");
        }
        if (isEmpty(name)){
            throw new IllegalArgumentException(" A név kötelező !");
        }
        Student student =getStudentByNameOrNull(name);
        if (student==null) {
            throw new IllegalArgumentException(" Nem találja ezt a nevet !");
        }
        return student;
    }

    private Student getStudentByNameOrNull(String name) {
        for (Student student : students){
            if (student.getName().equals(name)) {
                return student;
            }
        }
    }

    public String getClassName() {
        return className;
    }

    private boolean isEmpty(String className) {

    }

    public String listStudentNames() {
        StringBuilder sb =new StringBuilder();
        for (Student s : students) {
            sb.append(s.getName()).append (",")
        }

    }

    public List<StudyResultByName>  listStudyResults() {

        List<StudyResultByName> resultList = new ArrayList<>();
        for (Student student : students) {
            resultList.add(new StudyResultByName(student.calculateAverage(),student.getName()));
        }
        return resultList;


    }

    public boolean removeStudent(Student student) {


    }

    public Student repetition()  {
        if (students.isEmpty()){
            throw new IllegalStateException(" Nincs tanuló kiválasztva !");
        }
        return students.get(this.rnd.nextInt(students.size()));
    }
}
