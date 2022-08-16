import java.util.ArrayList;

public class Employee {

    private String employeeFirstName;
    private String employeeLastName;
    private double employeeSalary;

    public Employee(String employeeFirstName, String employeeLastName, double employeeSalary) {
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeSalary = employeeSalary;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public static double addAllSalaries(ArrayList<Employee> employeesList) {
        double salarySum = 0;
        for (Employee employee : employeesList
        ) {
            salarySum += employee.getEmployeeSalary();
        }
        return salarySum;
    }

    public static void printEmployeeData(ArrayList<Employee> employeesList) {
        for (Employee employee : employeesList
        ) {
            System.out.println(employee.toString());

        }
    }

    @Override
    public String toString() {
        return "Salary for " + employeeFirstName + " " + employeeLastName + " is " + employeeSalary;
    }


}

