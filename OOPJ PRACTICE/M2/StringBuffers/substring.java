public class substring {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello World Java Programming");
        System.out.println("Original string: " + sb);

        // Using substring(beginIndex)
        String sub1 = sb.substring(6);
        System.out.println("substring(6): " + sub1);

        // Using substring(beginIndex, endIndex)
        String sub2 = sb.substring(6, 11);
        System.out.println("substring(6, 11): " + sub2);

        // More examples with different ranges
        System.out.println("\nMore substring examples:");
        System.out.println("First word: " + sb.substring(0, 5));
        System.out.println("Last word: " + sb.substring(16));
        System.out.println("Middle words: " + sb.substring(6, 15));
    }
}
