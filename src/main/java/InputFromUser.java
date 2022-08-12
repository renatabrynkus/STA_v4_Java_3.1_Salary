import java.util.Locale;
import java.util.Scanner;

public class InputFromUser {
    int startMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(menuText());
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println(menuText());
        }
        int actionPointFromUser = scanner.nextInt();

        return actionPointFromUser;
    }

    private String menuText() {
        return "1 - Print sum of all employees' salary.\n2 - Display all employees data.\n" +
                "3 - Add a new employee.\n4 - End program";
    }

    Employee employeeInputFromUser() {

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
