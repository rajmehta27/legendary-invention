public class append {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello ");

        // Using append() to add strings
        sb.append("World");
        System.out.println("After first append: " + sb);

        // Appending multiple strings
        sb.append("! ");
        sb.append("Welcome to ");
        sb.append("Java Programming");

        // Display final result
        System.out.println("Final string: " + sb);

        // You can also chain append operations
        StringBuffer sb2 = new StringBuffer("Chain ");
        sb2.append("multiple ").append("append ").append("calls");
        System.out.println("Chained append result: " + sb2);
    }
}