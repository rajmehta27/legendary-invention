public class insert {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println("Original string: " + sb);

        // Insert a string at position 5
        sb.insert(5, " Beautiful");
        System.out.println("After first insert: " + sb);

        // Insert at beginning (position 0)
        sb.insert(0, "Hey! ");
        System.out.println("After inserting at beginning: " + sb);

        // Insert at end (can use length() to get last position)
        sb.insert(sb.length(), "!");
        System.out.println("After inserting at end: " + sb);

        // Multiple inserts at different positions
        StringBuffer sb2 = new StringBuffer("Java Programming");
        sb2.insert(4, " Core")
                .insert(9, " and")
                .insert(13, " Advanced");
        System.out.println("Multiple inserts: " + sb2);
    }
}
