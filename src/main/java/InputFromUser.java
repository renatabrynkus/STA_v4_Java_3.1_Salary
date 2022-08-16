import java.util.Locale;
import java.util.Scanner;

public class InputFromUser {
    static int startMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(menuText());
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println(menuText());
        }
        int actionPointFromUser = scanner.nextInt();

        return actionPointFromUser;
    }

    private static String menuText() {
        return """
                Please choose an action:
                1 - Print sum of all employees' salary.
                2 - Display all employees data.
                3 - Add a new employee.
                4 - End the program""";
    }

    public static Employee employeeInputFromUser() {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("Enter employee's first name");
        String employeeFirstName = scanner.nextLine();
        System.out.println("Enter employee's last name");
        String employeeLastName = scanner.nextLine();

        System.out.println("Enter employee's salary");
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println("Please enter a valid number");
        }
        double employeeSalary = scanner.nextDouble();

        return new Employee(employeeFirstName, employeeLastName, employeeSalary);
    }
}
