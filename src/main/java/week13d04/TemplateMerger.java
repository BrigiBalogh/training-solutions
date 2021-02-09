package week13d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TemplateMerger {

    private List<Employee> employees;

    public String merge(Path file, List<Employee> employees) {
        try
        {
            StringBuilder sb = new StringBuilder();
            String line = Files.readString(file);
            for (Employee employee : employees) {
                String replaced =line.replace("{name}",employee.getName());
                replaced = replaced.replace("{ev}",Integer.toString(employee.getYearOfBirth()));
                sb.append(replaced).append("\n");
            }
            return sb.toString();
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file !", e);
        }
    }

    public static void main(String[] args) {
        Path path = Path.of("employee-template.txt");
    }
}
