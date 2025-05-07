// WAP to create an abstract class called Payment with
// attributes as cardnumber,cardholder,amount and abstract methods as processPayment() and 
// displayPaymentDetails(). Create concrete classes as creditCardPayment and 
// DebitCardPayment acquiring the properties of the Payment class.The creditCardPayment class consist the attribute as expiryDate and implement processPayment() that displays the “credit Card Payment Processed” and displayPaymentDetails() prints details includes the cardNumber,cardholder,expiryDate and Amount. The DebitCardPayment class consist the attribute as pin and implement processPayment() that displays the “Debit Card Payment Processed” and displayPaymentDetails() prints details includes the cardNumber,cardholder,pin and Amount. Further create the objects for the both the 
// concrete classes and invoke the processPayment() and displayPaymentDetails.  
// [Hint: use the abstract class, constructor and super and this keyword] 

public class Credit_Debit {
    public static void main(String[] args) {
        // Create Credit Card Payment instance
        CreditCardPayment creditCard = new CreditCardPayment(
                "4532-7845-9632-1234",
                "John Doe",
                5000.0,
                "12/25");

        // Create Debit Card Payment instance
        DebitCardPayment debitCard = new DebitCardPayment(
                "6589-7412-3698-7412",
                "Jane Smith",
                3000.0,
                "1234");

        // Process and display Credit Card Payment
        creditCard.processPayment();
        creditCard.displayPaymentDetails();

        // Process and display Debit Card Payment
        debitCard.processPayment();
        debitCard.displayPaymentDetails();
    }
}

abstract class Payment {
    String cardNumber;
    String cardHolder;
    double amount;

    public Payment(String cardNumber, String cardHolder, double amount) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.amount = amount;
    }

    abstract void processPayment();

    abstract void displayPaymentDetails();
}

class CreditCardPayment extends Payment {
    String expiryDate;

    public CreditCardPayment(String cardNumber, String cardHolder, double amount, String expiryDate) {
        super(cardNumber, cardHolder, amount);
        this.expiryDate = expiryDate;
    }

    @Override
    void processPayment() {
        System.out.println("\nCredit Card Payment Processed");
    }

    @Override
    void displayPaymentDetails() {
        System.out.println("Credit Card Payment Details:");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder: " + cardHolder);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Amount: $" + amount);
    }
}

class DebitCardPayment extends Payment {
    String pin;

    public DebitCardPayment(String cardNumber, String cardHolder, double amount, String pin) {
        super(cardNumber, cardHolder, amount);
        this.pin = pin;
    }

    @Override
    void processPayment() {
        System.out.println("\nDebit Card Payment Processed");
    }

    @Override
    void displayPaymentDetails() {
        System.out.println("Debit Card Payment Details:");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder: " + cardHolder);
        System.out.println("PIN: " + pin);
        System.out.println("Amount: $" + amount);
    }
}