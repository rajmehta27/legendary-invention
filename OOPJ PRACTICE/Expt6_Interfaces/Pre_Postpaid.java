// WAP to create an abstract class called MobileRechargePlan with attributes like planName,planAmount,
// and validityDays alongside abstract methods displayPlanDetails() and calculateRechargeAmount(double talkTime). Further, 
// create two concrete classes as prepaidRecharge and PostpaidRecharge extending the  MobileRechargePlan class, provide methods for display the plan details, and calculate the recharge amount methods. Instantiate both the classes and display their respective plan details along with calculate recharge amounts. [Hint: use the abstract class, constructor, super and this keyword]

public class Pre_Postpaid {
    public static void main(String[] args) {
        // Create instances of both recharge types
        PrepaidRecharge prepaid = new PrepaidRecharge("Prepaid Plus", 499.0, 28,
                1.0);
        PostpaidRecharge postpaid = new PostpaidRecharge("Postpaid Premium",
                999.0, 30, 249.0);

        // Display plan details and calculate recharge amounts
        prepaid.displayPlanDetails();
        double prepaidAmount = prepaid.calculateRechargeAmount(100);
        System.out.println("Total Recharge Amount for 100 minutes: $" +
                prepaidAmount);

        postpaid.displayPlanDetails();
        double postpaidAmount = postpaid.calculateRechargeAmount(100);
        System.out.println("Total Recharge Amount for 100 minutes: $" +
                postpaidAmount);
    }
}

abstract class MobileRechargePlan {
    String planName;
    double planAmount;
    int validityDays;

    public MobileRechargePlan(String planName, double planAmount, int validityDays) {
        this.planName = planName;
        this.planAmount = planAmount;
        this.validityDays = validityDays;
    }

    abstract void displayPlanDetails();

    abstract double calculateRechargeAmount(double talkTime);
}

class PrepaidRecharge extends MobileRechargePlan {
    double perMinuteRate;

    public PrepaidRecharge(String planName, double planAmount, int validityDays,
            double perMinuteRate) {
        super(planName, planAmount, validityDays);
        this.perMinuteRate = perMinuteRate;
    }

    @Override
    void displayPlanDetails() {
        System.out.println("\nPrepaid Plan Details:");
        System.out.println("Plan Name: " + planName);
        System.out.println("Base Plan Amount: $" + planAmount);
        System.out.println("Validity: " + validityDays + " days");
        System.out.println("Per Minute Rate: $" + perMinuteRate);
    }

    @Override
    double calculateRechargeAmount(double talkTime) {
        return planAmount + (talkTime * perMinuteRate);
    }
}

class PostpaidRecharge extends MobileRechargePlan {
    double monthlyRental;

    public PostpaidRecharge(String planName, double planAmount, int validityDays,
            double monthlyRental) {
        super(planName, planAmount, validityDays);
        this.monthlyRental = monthlyRental;
    }

    @Override
    void displayPlanDetails() {
        System.out.println("\nPostpaid Plan Details:");
        System.out.println("Plan Name: " + planName);
        System.out.println("Base Plan Amount: $" + planAmount);
        System.out.println("Validity: " + validityDays + " days");
        System.out.println("Monthly Rental: $" + monthlyRental);

    }

    @Override
    double calculateRechargeAmount(double talkTime) {
        return planAmount + monthlyRental + (talkTime * 0.5);
    }
}
