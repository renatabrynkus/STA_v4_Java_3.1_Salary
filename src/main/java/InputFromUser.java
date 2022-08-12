import java.util.Scanner;

public class InputFromUser {
    int startMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Print sum of all employees' salary.\n2 - Display all employees data.\n" +
                "3 - Add a new employee.\n4 - End program");
        int actionPointFromUser = scanner.nextInt();

        return actionPointFromUser;
    }

    Employee employeeInputFromUser() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter employee's first name");
        String employeeFirstName = scan.nextLine();
        System.out.println("Enter employee's last name");
        String employeeLastName = scan.nextLine();
        System.out.println("Enter employee's salary");
        double employeeSalary = scan.nextDouble();

        return new Employee(employeeFirstName, employeeLastName, employeeSalary);
    }
}
