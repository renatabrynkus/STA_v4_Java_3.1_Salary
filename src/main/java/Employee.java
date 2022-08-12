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

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public static double addSalaries(ArrayList<Employee> employeesList) {
        double salarySum = 0;
        for (Employee employee : employeesList
        ) {
            salarySum += employee.getEmployeeSalary();
        }
        return salarySum;
    }

    @Override
    public String toString() {
        return "Salary for " + employeeFirstName + " " + employeeLastName + " is " + employeeSalary;
    }


}
