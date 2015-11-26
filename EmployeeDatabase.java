import java.util.Scanner;

 

 class EmployeeDatabase{

    public static void main(String[] args) {

 

        Employee[] employees = {new Employee("Mario Nintendo", 41, "Actor", 220000.0), new Employee("Peach Nintendo", 21, "Actor", 210000.0), new Employee("Pacman Pacman", 20, "Actor", 230000.0), new Employee("Minecraft Minecraft", 10, "Gamer", 280000.0)};

 

        boolean stillRunning = true;

        int choice;

 

        while (stillRunning == true) {

 

            choice = menuChoice();

 

            switch (choice) {

                case 1:

                    printAllEmployees(employees);

                    break;

                case 2:

                    System.out.println(printEmployeeOfName(employees));

                    enterToContinue();

                    break;

                case 3:

                    increaseSalary(employees);

                    break;

                case 9:

                    stillRunning = false;

                    break;

                default:

                    System.out.println("This number is invalid");

            }

 

        }

 

        quitProgram();

    }

 

 

 

   

    private static int menuChoice(){

        Scanner input = new Scanner(System.in);

 

        System.out.println("\n\n\nChoose a number and press Enter: \n");

        System.out.println("********************************************************\n");

        System.out.println("[1] Print all employees \t\t   [2] Print employee: enter name ");

        System.out.println("[3] Print employee: enter age \t\t [4] Print employee: enter designation ");

        System.out.println("[5] Print Employee: enter salary range \t\t [6] Increase employee salary" );

        System.out.println("[9] Quit");

        System.out.println("\n********************************************************");

 

        return input.nextInt();

    }

 

    private static void printAllEmployees(Employee[] emps){

        System.out.println("Here is a list of all employees: \n");

        for (int i = 0; i<emps.length; i++){

            System.out.println(emps[i]);

        }

 

        enterToContinue();

    }

 

    private static String printEmployeeOfName(Employee[] emps){

 

 

        String name;

 

        boolean found = false;

        Scanner input = new Scanner(System.in);

 

        System.out.println("Enter the name of the employee that you would like to find:");

        name = input.nextLine();

 

 

        for (int i=0;i<emps.length;i++){

            if ((emps[i].getName()).equals(name)) {

                return emps[i].toString();

            }

 

        }

        return "Employee not found";

 

    }

 

    private static String printEmployeeOfAge(Employee[] emps){

 

        int age;

        boolean found = false;

        Scanner input = new Scanner(System.in);

       

           System.out.println("Enter the age of the employee that you would like to find:");

                age = input.nextInt();

 

        for (int i=0;i<emps.length;i++){

            if ((emps[i].getAge()) == age) {

                return emps[i].toString();

            }

 

        }

        return "Employee not found";

 

    }

 

   

    private static void increaseSalary(Employee[] emps){

        Scanner input = new Scanner(System.in);

        String  name;

        int percentage;

        boolean employeeExists = false;

        double currentSalary, newSalary;

 

        System.out.println("Enter the name of the employee that will receive a salary increase:");

        name = input.nextLine();

 

        for(int i = 0;i<emps.length;i++){

            if (emps[i].getName().equals(name)){

                employeeExists = true;

                System.out.println(name + "'s current salary is: " + emps[i].getSalary());

                System.out.println("Enter the percentage increase as am integer:");

                percentage = input.nextInt();

 

                currentSalary = emps[i].getSalary();

                newSalary = currentSalary + ((percentage * currentSalary)/100);

                emps[i].setSalary(newSalary);

 

                System.out.println("Current salary: " + currentSalary);

                System.out.println("New salary: " + newSalary);

                System.out.println("Salary increase: " + (newSalary - currentSalary));

 

            }

        }

        if (!employeeExists){

            System.out.println("The employee you entered doesn't exist here.");

        }

        enterToContinue();

 

    }

 

    private static void enterToContinue(){

        Scanner getEnter = new Scanner(System.in);

        System.out.println("Press enter to continue");

        getEnter.nextLine();

    }

 

    private static void quitProgram(){

        System.out.println("Thank you and goodbye!");

    }

 

 

}
