public class replace {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello Java Programming");
        System.out.println("Original string: " + sb);

        // Replace "Java" with "Python" (index 6 to 10)
        sb.replace(6, 10, "Python");
        System.out.println("After first replace: " + sb);

        // Replace "Programming" with "Development" (index 11 to end)
        sb.replace(11, sb.length(), "Development");
        System.out.println("After second replace: " + sb);

        // Replace first word (index 0 to 5)
        sb.replace(0, 5, "Hi");
        System.out.println("After third replace: " + sb);

        // Chaining multiple replace operations
        StringBuffer sb2 = new StringBuffer("I love programming");
        sb2.replace(0, 1, "We")
                .replace(7, 18, "coding");
        System.out.println("Chained replace result: " + sb2);
    }
}
