import java.util.ArrayList;

public class Company {

    ArrayList<Employee> employeesList;

    Company () {
        employeesList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeesList.add(employee);
    }

    public double getSumOfSalaries() {
        double salarySum = 0;
        for (Employee employee : employeesList
        ) {
            salarySum += employee.getSalary();
        }
        return salarySum;
    }

    public void printEmployeeData() {
        for (Employee employee : employeesList) {
            System.out.println(employee.toString());
        }
    }

    public ArrayList<Employee> getEmployeesList() {
        return employeesList;
    }
}
