import java.util.ArrayList;

public class Company {

    ArrayList<Employee> employeesList = new ArrayList<>();

    public void addToEmployeesList(Employee employee) {
        employeesList.add(employee);
    }

    public ArrayList<Employee> getEmployeesList() {
        return employeesList;
    }
}
