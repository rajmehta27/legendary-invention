import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = { 10, 20, 30, 40, 50 };

        try {
            // Input number
            System.out.print("Enter a number: ");
            String inputNumber = scanner.nextLine();
            int number = Integer.parseInt(inputNumber); // May throw NumberFormatException

            // Input index
            System.out.print("Enter an index (0 to 4): ");
            int index = scanner.nextInt();
            int value = array[index]; // May throw ArrayIndexOutOfBoundsException

            // Division operation
            System.out.println("Result of division: " + (value / number)); // May throw ArithmeticException
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please enter a valid integer.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. Please enter an index between 0 and 4.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Program execution completed.");
            scanner.close();
        }
    }
}
