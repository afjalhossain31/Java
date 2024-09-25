
package projectshope;

import java.util.Scanner;

class Employee {
    protected String name;
    protected int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

class Programmer extends Employee {
    private String programmingLanguage;

    public Programmer(String name, int employeeId, String programmingLanguage) {
        super(name, employeeId);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class AssistantEngineer extends Employee {
    private String department;

    public AssistantEngineer(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

class SystemAnalyst extends Employee {
    private int yearsOfExperience;

    public SystemAnalyst(String name, int employeeId, int yearsOfExperience) {
        super(name, employeeId);
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Years of Experience: " + yearsOfExperience);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Select employee type:");
        System.out.println("1. Programmer");
        System.out.println("2. Assistant Engineer");
        System.out.println("3. System Analyst");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                System.out.print("Enter programming language: ");
                String programmingLanguage = scanner.nextLine();
                Programmer programmer = new Programmer(name, employeeId, programmingLanguage);
                programmer.displayInfo();
                break;
            case 2:
                System.out.print("Enter department: ");
                String department = scanner.nextLine();
                AssistantEngineer assistantEngineer = new AssistantEngineer(name, employeeId, department);
                assistantEngineer.displayInfo();
                break;
            case 3:
                System.out.print("Enter years of experience: ");
                int yearsOfExperience = scanner.nextInt();
                SystemAnalyst systemAnalyst = new SystemAnalyst(name, employeeId, yearsOfExperience);
                systemAnalyst.displayInfo();
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
