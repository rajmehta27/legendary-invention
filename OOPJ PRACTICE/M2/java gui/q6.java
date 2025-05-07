import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        String input = reader.readLine(); // May throw IOException

        try {
            int number = Integer.parseInt(input); // May throw NumberFormatException
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}
