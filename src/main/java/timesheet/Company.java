package timesheet;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {

    private List<Employee> employees = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();
    private List<TimeSheetItem> timeSheetItems = new ArrayList<>();

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
        TimeSheetItem timeSheetItem = new TimeSheetItem(employee, project, beginDate, endDate);
        timeSheetItems.add(timeSheetItem);
    }


    public List<ReportLine> calculateProjectByNameYearMonth(String employeeName,int year, int month) {
        Map<Project,ReportLine> reportLinesByProjects = new HashMap<>();
        for (Project project : projects) {
            reportLinesByProjects.put(project, new ReportLine(project,0));
        }
        for (TimeSheetItem item : timeSheetItems) {
            if(item.employeeNameis(employeeName) && item.isAt(year,month)) {
                reportLinesByProjects.get(item.getProject()).addTime(item.hoursBetweenDates());
            }
        }
        return new ArrayList<>(reportLinesByProjects.values());
    }

    public void printToFile(String employeeName, int year, int month, Path file) {
        if (notInEmployeesList(employees,employeeName)) {
            throw new IllegalArgumentException("The name is invalid.");
        }
        List<ReportLine> lines = calculateProjectByNameYearMonth(employeeName,year, month);
        long sum = sumHours(lines);

        try ( BufferedWriter writer = Files.newBufferedWriter(file)) {
            printHeader(writer,employeeName ,year, month, sum);
            printLines(writer, lines);
        }catch (IOException ioe) {
            throw new RuntimeException("Cannot write report.", ioe);
        }
    }

    private boolean notInEmployeesList(List<Employee>employees, String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return false;
            }
        }
    }

    private void printHeader(BufferedWriter writer, String name, int year, int month, long sum) throws IOException {
        String header = String.format("%s\t%d-%02d\t%d\n", name, year, month, sum);
        writer.write(header);

    }

    private void printLines(BufferedWriter writer, List<ReportLine> lines)throws IOException {
        for(ReportLine reportLine : lines) {
            if(reportLine.getTime() > 0) {
                writer.write(String.format("%s\t%d\n", reportLine.getProject().getName(), reportLine.getTime()));
            }
        }
    }


}
