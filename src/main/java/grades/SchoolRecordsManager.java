package grades;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SchoolRecordsManager {

    private List<Student> students = new ArrayList<>();

    public void readGradesFromFile(String fileName){
        Path file = Path.of("src/main/resources/" + fileName);

        try(BufferedReader br= Files.newBufferedReader(file)) {
            String line;
            while((line = br.readLine()) != null ) {
                String[] temp = line.split("");
                List<Integer> grades = new ArrayList<>();
                for (int i = 1; i < temp.length; i++) {
                    grades.add(Integer.parseInt(temp[i]));
                }
                Student s = new Student(temp[0],grades );
                students.add(s);
            }
        } catch (IIOException e) {
            throw new IllegalStateException("Cannot read file !", e);
        }
    }

    public double ClassAverage() {
        double sum = 0;
        for (Student s : students) {
            sum += s.average();
        }
        return sum /students.size();
    }

    public List<Student> getStudents() {
        return students;
    }
}
