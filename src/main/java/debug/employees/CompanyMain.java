package debug.employees;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {

    public static void main(String[] args) {
      Employee employee1 = new Employee("John Doe",2000 );
      Employee employee2 = new Employee("Jack Doe", 1990 );
      Employee employee3 = new Employee("Kiss Katinka",1991);

      Company company = new Company(new ArrayList<>());

      company.addEmployee(employee1);
      company.addEmployee(employee2);
      company.addEmployee(employee3);

      Employee katinka = company.findEmployeeByName("Kiss Katinka");
        System.out.println(katinka.getName()+""+katinka.getYearOfBirth());

        List<String> names = company.listEmployeeName();
        System.out.println(names);
    }
}
