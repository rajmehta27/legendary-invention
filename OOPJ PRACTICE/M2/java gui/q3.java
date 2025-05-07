import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Allow the user to input array elements
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            array[i] = scanner.nextInt();
        }

        boolean validIndex = false;

        // Loop to allow retrying for valid index input
        while (!validIndex) {
            try {
                System.out.print("Enter an index to access (0 to " + (size - 1) + "): ");
                int index = scanner.nextInt();
                System.out.println("Value at index " + index + ": " + array[index]);
                validIndex = true; // Exit the loop if the index is valid
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Invalid index. Please enter a number between 0 and " + (size - 1) + ".");
            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        System.out.println("Array access process is complete.");
        scanner.close();
    }
}
