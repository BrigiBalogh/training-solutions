package intromethods;

public class EmployeeMain {


    public static void main(String[] args) {
        Employee employee = new Employee("Kiss Virág",2018,450000);

        System.out.println(employee);

        employee.raiseSalary(10000);

        System.out.println(employee);

        employee.setName("Kiss Anna");
        System.out.println("Name:"+employee.getName());
        System.out.println("Hiring year:"+employee.getHiringYear());
        System.out.println("Salary"+employee.getSalary());
    }
}
