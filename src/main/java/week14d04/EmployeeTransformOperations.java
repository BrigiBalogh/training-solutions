package week14d04;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTransformOperations {

    public List<Employee> transformToUppercased(List<Employee> employees) {
    /*   List<Employee> upperCasedEmployees = new ArrayList<>();
      for ( Employee employee : employees) {
     // Employee e = new Employee(employee.getName().toUpperCase());
      upperCasedEmployees.add(employee.toUppercase());
      }
      return upperCasedEmployees;*/
        return employees.stream()
                .map(Employee::toUppercase)
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("John Doe"),
                new Employee("Jack Doe"),
                new Employee("Jane Doe")
        );
        List<Employee> result = new EmployeeTransformOperations().transformToUppercased(employees);

        System.out.println(employees);
        System.out.println(result);
    }
}

