import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number : ");
        String accNumber = sc.nextLine();
        System.out.println("Enter account balance : ");
        int balance = sc.nextInt();
        Account a = new Account(accNumber, balance);
        a.displayDetails();
        sc.close();
    }
}

public class Account {
    String accNumber;
    int balance;

    Account(String accNumber, int balance) {
        if (accNumber == null || accNumber.isEmpty()) {
            System.out.println("Account number cannot be null or empty");
            return;
        }
        if (balance < 0) {
            System.out.println("Blanace cannot be negative");
            return;
        }
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Balance: " + balance);
    }
}
