import java.util.ArrayList;

public class Company {

    ArrayList<Employee> employeesList = new ArrayList<>();

    public void addToEmployeesList(Employee employee) {
        employeesList.add(employee);
    }

    public void setList(ArrayList<Employee> employeesList) {
        this.employeesList = employeesList;
    }

    public ArrayList<Employee> getList() {
        return employeesList;
    }
}
