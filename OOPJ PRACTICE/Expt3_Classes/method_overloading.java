public class method_overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition (int): " + calc.add(10, 5));
        System.out.println("Addition (double): " + calc.add(10.5, 5.5));
        System.out.println("Subtraction (int): " + calc.subtract(10, 5));
        System.out.println("Subtraction (double): " + calc.subtract(10.5, 5.5));
        System.out.println("Multiplication (int): " + calc.multiply(10, 5));
        System.out.println("Multiplication (double): " + calc.multiply(10.5, 5.5));
        System.out.println("Division (int): " + calc.divide(10, 5));
        System.out.println("Division (double): " + calc.divide(10.5, 5.5));
    }
}

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(int a, int b) {
        return (double) a / b;

    }

    public double divide(double a, double b) {
        return a / b;

    }
}