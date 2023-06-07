package ch17;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeObj1 = new Employee();
        employeeObj1.setEmployeeName("employeeObj1");
        System.out.println(employeeObj1.toString());

        Employee employeeObj2 = new Employee();
        employeeObj2.setEmployeeName("employeeObj2");
        System.out.println(employeeObj2.toString());
    }
}
