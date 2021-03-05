package timesheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> employees = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();

    public Company(InputStream employeeFile, InputStream projectFile) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(employeeFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String firstName = parts[0];
                String lastName = parts[1];
                Employee e = new Employee(firstName, lastName);
                employees.add(e);
            }
        } catch (IOException ex) {
            System.out.println("Probléma");
        }
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(projectFile))) {
            String line1;
            while ((line1 = reader.readLine()) != null) {
                String projectName = line1;
                Project p = new Project(projectName);
                projects.add(p);
            }
        } catch (IOException ex) {

        }
    }





    public List<Project> getProjects() {
        return projects;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addTimeSheetItem(Employee employee, Project project, LocalDateTime beginDate, LocalDateTime endDate) {
    }

    public List<ReportLine> calculateProjectByNameYearMonth(String employeeName,int year, int month) {
        return new ArrayList<>();
    }

    public void printToFile(String EmployeeName, int year, int month, Path file) {
    }


}
