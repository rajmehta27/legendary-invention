package packages_practice_M2.mainapp;

import java.util.Scanner;

import packages_practice_M2.payroll.Employee;

public class mainapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an Employee object
        Employee employee = new Employee();

        // Take employee details as input
        System.out.print("Enter Employee ID: ");
        int employeeID = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter Tax Percentage: ");
        double taxPercentage = scanner.nextDouble();

        // Set employee details
        employee.setEmployeeDetails(employeeID, employeeName, basicSalary, taxPercentage);

        // Display employee details with net salary
        System.out.println("\nEmployee Details:");
        employee.displayEmployeeDetails();

        scanner.close();
    }
}