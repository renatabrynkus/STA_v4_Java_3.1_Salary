import java.util.Locale;
import java.util.Scanner;

public class UserInputHandler {

    static int startMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(menuText());
        isInputNotInt(scanner);

        int selectedOption = scanner.nextInt();

        return selectedOption;
    }

    private static void isInputNotInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println(menuText());
        }
    }

    private static void isInputNotDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println("Please enter a valid number");
        }
    }

    private static String menuText() {
        return """
                Please choose an action:
                1 - Print sum of all employees' salary.
                2 - Display all employees data.
                3 - Add a new employee.
                4 - End the program""";
    }

    public static Employee getEmployeeFromUser() {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("Enter employee's first name");
        String employeeFirstName = scanner.nextLine();
        System.out.println("Enter employee's last name");
        String employeeLastName = scanner.nextLine();

        System.out.println("Enter employee's salary");
        isInputNotDouble(scanner);

        double employeeSalary = scanner.nextDouble();

        return new Employee(employeeFirstName, employeeLastName, employeeSalary);
    }
}
