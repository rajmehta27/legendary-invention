public class delete {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello Java Programming World");
        System.out.println("Original string: " + sb);

        // Delete "Java " (index 6 to 11)
        sb.delete(6, 11);
        System.out.println("After first delete: " + sb);

        // Delete "Programming " (index 6 to 18)
        sb.delete(6, 18);
        System.out.println("After second delete: " + sb);

        // Delete last word (index 6 to end)
        sb.delete(6, sb.length());
        System.out.println("After third delete: " + sb);

        // Chaining multiple delete operations
        StringBuffer sb2 = new StringBuffer("This is a test message");
        sb2.delete(4, 7) // delete " is"
                .delete(5, 7); // delete " a"
        System.out.println("Chained delete result: " + sb2);
    }
}
