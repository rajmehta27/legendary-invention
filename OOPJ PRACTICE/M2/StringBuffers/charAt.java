public class charAt {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println("Original string: " + sb);

        // Get character at different positions
        char firstChar = sb.charAt(0);
        System.out.println("Character at index 0: " + firstChar);

        char fifthChar = sb.charAt(4);
        System.out.println("Character at index 4: " + fifthChar);

        char spaceChar = sb.charAt(5);
        System.out.println("Character at index 5: " + spaceChar);

        // Print all characters using charAt
        System.out.println("\nPrinting all characters:");
        for (int i = 0; i < sb.length(); i++) {
            System.out.println("Character at index " + i + ": " + sb.charAt(i));
        }
    }
}