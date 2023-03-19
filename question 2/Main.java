public class Main {
    public static void main(String[] args) {
        // Creating an object of Employee class
        Employee employee = new Employee();
        employee.name = "Bharath";
        employee.age = 25;
        employee.phoneNumber = "9384572907";
        employee.address = "23,street,chennai.";
        employee.salary = 20000.0;
        employee.specialization = "data scientist";

        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        employee.printSalary();
        System.out.println("Specialization: " + employee.specialization);

        System.out.println();

        // Creating an object of Manager class
        Manager manager = new Manager();
        manager.name = "sarankumar";
        manager.age = 45;
        manager.phoneNumber = "0987654321";
        manager.address = "no18318 jgfajbcjahsli";
        manager.salary = 50000.0;
        manager.department = "software engineer";

        System.out.println("Manager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
        System.out.println("Department: " + manager.department);
    }
}