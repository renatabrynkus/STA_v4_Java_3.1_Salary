public class Main {

    public static void main(String[] args) {

        Company company = new Company();

        for (int i = 0; i < 5; i++) {
            company.addEmployee(UserInputHandler.getEmployeeFromUser());
        }
        int selectedOption = UserInputHandler.startMenu();

        while (selectedOption != 4) {
            switch (selectedOption) {
                case 1 -> System.out.println(company.getSumOfSalaries());
                case 2 -> company.printEmployeeData();
                case 3 -> company.addEmployee(UserInputHandler.getEmployeeFromUser());
                default -> System.out.println("Please enter an integer from 1 to 4");
            }
            selectedOption = UserInputHandler.startMenu();
        }
        System.exit(0);
    }
}