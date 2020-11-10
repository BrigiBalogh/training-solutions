package introdate;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee =new Employee(1980,11,11,"Kiss Aranka");
        System.out.println(employee.getDateOfBirth());
        System.out.println(employee.getBeginEmployment());
    }
}
