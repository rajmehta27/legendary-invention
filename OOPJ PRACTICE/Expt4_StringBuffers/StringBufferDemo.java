import java.util.Scanner;

/*SYNTAX
    a. append(String s)
    b. insert(int offset, String s)
    c. replace(int startIndex, int endIndex, String str)
    d. delete(int startIndex, int endIndex)
    e. reverse()
    f. capacity()
    g. ensureCapacity(int minimumCapacity)
    h. charAt(int index)
    i. length()
    j. substring(int beginIndex)
    k. substring(int beginIndex, int endIndex)
 */

public class StringBufferDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * StringBuffer is a mutable sequence of characters
         * Unlike String, StringBuffer can be modified without creating new objects
         * It is thread-safe and synchronized
         */

        // Get initial string from user
        System.out.print("Enter a string to perform StringBuffer operations: ");
        String initialString = scanner.nextLine();

        // Creating StringBuffer with user input
        StringBuffer sb = new StringBuffer(initialString);
        System.out.println("\nOriginal StringBuffer: " + sb);

        /*
         * Method 1: append()
         * Adds the string at the end of existing StringBuffer
         * Returns the same StringBuffer object for method chaining
         * Time Complexity: O(n) where n is length of string to append
         */
        System.out.print("\nEnter string to append: ");
        String appendString = scanner.nextLine();
        sb.append(appendString);
        System.out.println("1. After append(): " + sb);

        /*
         * Method 2: insert()
         * Inserts the string at specified position
         * Shifts existing characters to the right
         * Time Complexity: O(n) where n is length of StringBuffer
         */
        System.out.print("\nEnter position to insert: ");
        int insertPos = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        System.out.print("Enter string to insert: ");
        String insertString = scanner.nextLine();
        sb.insert(insertPos, insertString);
        System.out.println("2. After insert(): " + sb);

        /*
         * Method 3: replace()
         * Replaces characters from startIndex to endIndex-1 with given string
         * If replacement string is longer/shorter, other characters are shifted
         * accordingly
         * Time Complexity: O(n) where n is length of StringBuffer
         */
        System.out.print("\nEnter start index for replace: ");
        int replaceStart = scanner.nextInt();
        System.out.print("Enter end index for replace: ");
        int replaceEnd = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        System.out.print("Enter string to replace with: ");
        String replaceString = scanner.nextLine();
        sb.replace(replaceStart, replaceEnd, replaceString);
        System.out.println("3. After replace(): " + sb);

        /*
         * Method 4: delete()
         * Removes characters from startIndex to endIndex-1
         * Shifts remaining characters to the left
         * Time Complexity: O(n) where n is length of StringBuffer
         */
        System.out.print("\nEnter start index for delete: ");
        int deleteStart = scanner.nextInt();
        System.out.print("Enter end index for delete: ");
        int deleteEnd = scanner.nextInt();
        sb.delete(deleteStart, deleteEnd);
        System.out.println("4. After delete(): " + sb);

        /*
         * Method 5: reverse()
         * Reverses all characters in the StringBuffer
         * Useful for palindrome checks and string manipulation
         * Time Complexity: O(n/2) where n is length of StringBuffer
         */
        System.out.println("\n5. After reverse(): " + sb.reverse());
        sb.reverse(); // Reversing back for further operations

        /*
         * Method 6: capacity()
         * Returns current capacity of StringBuffer
         * Capacity is the total allocated memory space
         * Default capacity is 16 characters plus string length
         */
        System.out.println("\n6. Current capacity: " + sb.capacity());

        /*
         * Method 7: ensureCapacity()
         * Ensures StringBuffer has at least the specified minimum capacity
         * Useful for performance optimization when size is known
         * Calculated as: (current capacity * 2) + 2
         * Time Complexity: O(n) if reallocation needed
         */
        System.out.print("\nEnter minimum capacity to ensure: ");
        int minCapacity = scanner.nextInt();
        sb.ensureCapacity(minCapacity);
        System.out.println("7. After ensureCapacity(" + minCapacity + "): " + sb.capacity());

        /*
         * Method 8: charAt()
         * Returns character at specified index
         * Throws StringIndexOutOfBoundsException if index is invalid
         * Time Complexity: O(1)
         */
        System.out.print("\nEnter index to get character from: ");
        int charIndex = scanner.nextInt();
        System.out.println("8. Character at index " + charIndex + ": " + sb.charAt(charIndex));

        /*
         * Method 9: length()
         * Returns current length (number of characters) in StringBuffer
         * Different from capacity which is allocated memory
         * Time Complexity: O(1)
         */
        System.out.println("\n9. Length of StringBuffer: " + sb.length());

        /*
         * Method 10: substring(beginIndex)
         * Returns new String from beginIndex to end
         * Original StringBuffer remains unchanged
         * Time Complexity: O(n) where n is length of substring
         */
        System.out.print("\nEnter begin index for substring: ");
        int beginIndex = scanner.nextInt();
        System.out.println("10. Substring from index " + beginIndex + ": " + sb.substring(beginIndex));

        /*
         * Method 11: substring(beginIndex, endIndex)
         * Returns new String from beginIndex to endIndex-1
         * Original StringBuffer remains unchanged
         * Time Complexity: O(n) where n is length of substring
         */
        System.out.print("\nEnter end index for substring: ");
        int endIndex = scanner.nextInt();
        System.out.println("11. Substring from index " + beginIndex + " to " + endIndex + ": "
                + sb.substring(beginIndex, endIndex));

        scanner.close();
    }
}