import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } finally {
            System.out.println("Input process is complete.");
            scanner.close();
        }
    }
}
