package week12d05;

import java.util.ArrayList;
import java.util.List;

public class EmployeeFilter {

    public List<Employee> countSeniorDevs(List<Employee> employees) {

        List<Employee> developers = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSkills().contains("programming") && employee.getSkillLevel() >= 3) {
                developers.add(employee);
            }
        }
        return developers;
    }
}
