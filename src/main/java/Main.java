import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Company company = new Company();
        InputFromUser inputFromUser = new InputFromUser();

        ArrayList<Employee> employeesList = company.getList();

        for (int i = 0; i < 5; i++) {
            Employee newEmployee = inputFromUser.employeeInputFromUser();
            company.addToEmployeesList(newEmployee);
        }

        int actionPointFromUser = inputFromUser.startMenu();

        while (actionPointFromUser != 4) {
            switch (actionPointFromUser) {
                case 1: {
                    System.out.println(Employee.addSalaries(employeesList));
                    break;
                }
                case 2: {
                    for (Employee employee : employeesList
                    ) {
                        System.out.println(employee.toString());
                    }
                    break;
                }
                case 3: {
                    company.addToEmployeesList(inputFromUser.employeeInputFromUser());
                    break;
                }
                case 4: {
                    System.exit(0);
                }
                default:
                    System.out.println("Sorry, the input was not valid.");
            }
            actionPointFromUser = inputFromUser.startMenu();
        }
    }
}
