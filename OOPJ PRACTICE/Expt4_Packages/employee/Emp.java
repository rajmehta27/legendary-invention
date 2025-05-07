package employee;

public class Emp {
    private String name;
    private String emp_id;
    private String category;
    private double basic_pay;
    private double gross_pay;
    private double income_tax;
    private double hra;
    private double da;
    private double allowance;
    private double PF;
    private double net_pay;

    public Emp(String name, String emp_id, String category, double basic_pay) {
        this.name = name;
        this.emp_id = emp_id;
        this.category = category;
        this.basic_pay = basic_pay;
        calculateAllowance();
    }

    private void calculateAllowance() {
        this.hra = 0.30 * basic_pay;
        this.da = 0.20 * basic_pay;
        this.allowance = 0.10 * basic_pay;
        calculateGrossPay();
    }

    private void calculateGrossPay() {
        this.gross_pay = basic_pay + hra + da + allowance;
        calculateDeductions();
    }

    private void calculateDeductions() {
        this.PF = 0.12 * basic_pay;
        this.income_tax = 0.10 * gross_pay;
        calculateNetPay();
    }

    private void calculateNetPay() {
        this.net_pay = gross_pay - (income_tax + PF);
    }

    public void displayPaySlip() {
        System.out.println("\n-------- EMPLOYEE PAY SLIP --------");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Category: " + category);
        System.out.println("\n-------- EARNINGS --------");
        System.out.println("Basic Pay: Rs. " + basic_pay);
        System.out.println("HRA: Rs. " + hra);
        System.out.println("DA: Rs. " + da);
        System.out.println("Allowance: Rs. " + allowance);
        System.out.println("Gross Pay: Rs. " + gross_pay);
        System.out.println("\n-------- DEDUCTIONS --------");
        System.out.println("PF: Rs. " + PF);
        System.out.println("Income Tax: Rs. " + income_tax);
        System.out.println("\n-------- NET PAY --------");
        System.out.println("Net Pay: Rs. " + net_pay);
        System.out.println("--------------------------------");
    }
}