package packages_practice_M2.mainapp;

import packages_practice_M2.bank.Loan;

public class MainAppp {
    public static void main(String[] args) {
        // Create a Loan object
        Loan loan = new Loan();

        // Set loan details
        loan.setLoanDetails();

        // Display loan details with EMI
        loan.displayLoanDetails();
    }
}