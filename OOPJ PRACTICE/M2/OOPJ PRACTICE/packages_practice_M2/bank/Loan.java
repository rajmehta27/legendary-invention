package packages_practice_M2.bank;

import java.util.Scanner;

public class Loan {
    private String customerName;
    private double loanAmount;
    private double interestRate;
    private int tenureYears;

    // Method to set loan details
    public void setLoanDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        customerName = scanner.nextLine();

        System.out.print("Enter Loan Amount: ");
        loanAmount = scanner.nextDouble();

        System.out.print("Enter Interest Rate (in %): ");
        interestRate = scanner.nextDouble();

        System.out.print("Enter Tenure (in years): ");
        tenureYears = scanner.nextInt();

        scanner.close();
    }

    // Method to calculate Equated Monthly Installment (EMI)
    public double calculateEMI() {
        double monthlyRate = interestRate / (12 * 100); // Convert annual rate to monthly
        int tenureMonths = tenureYears * 12; // Convert years to months
        return (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, tenureMonths)) /
                (Math.pow(1 + monthlyRate, tenureMonths) - 1);
    }

    // Method to display loan details with EMI
    public void displayLoanDetails() {
        System.out.println("\nLoan Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Tenure: " + tenureYears + " years");
        System.out.println("Monthly EMI: " + calculateEMI());
    }
}
