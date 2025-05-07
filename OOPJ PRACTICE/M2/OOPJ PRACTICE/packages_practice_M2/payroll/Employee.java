package packages_practice_M2.payroll;

public class Employee {
    private int employeeID;
    private String employeeName;
    private double basicSalary;
    private double taxPercentage;

    // Method to set employee details
    public void setEmployeeDetails(int employeeID, String employeeName, double basicSalary, double taxPercentage) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.taxPercentage = taxPercentage;
    }

    // Method to calculate net salary after tax deduction
    public double calculateNetSalary() {
        double taxAmount = (basicSalary * taxPercentage) / 100;
        return basicSalary - taxAmount;
    }

    // Method to display employee details with salary
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Tax Percentage: " + taxPercentage + "%");
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}
