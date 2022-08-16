import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Company company = new Company();

        ArrayList<Employee> employeesList = company.getEmployeesList();

        for (int i = 0; i < 5; i++) {
            Employee newEmployee = InputFromUser.employeeInputFromUser();
            company.addToEmployeesList(newEmployee);
        }

        int actionPointFromUser = InputFromUser.startMenu();

        while (actionPointFromUser != 4) {
            switch (actionPointFromUser) {
                case 1 -> System.out.println(Employee.addAllSalaries(employeesList));
                case 2 -> Employee.printEmployeeData(employeesList);
                case 3 -> company.addToEmployeesList(InputFromUser.employeeInputFromUser());
                default -> System.out.println("Please enter an integer from 1 to 4");
            }
            actionPointFromUser = InputFromUser.startMenu();
        }
        System.exit(0);

        System.out.println("The value you've entered is not correct. Please try again.");
        InputFromUser.startMenu();
    }
}
