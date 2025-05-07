public class reverse_and_capacity {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println("Original string: " + sb);

        // Get initial capacity
        System.out.println("Initial capacity: " + sb.capacity());

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Create new StringBuffer with specific capacity
        StringBuffer sb2 = new StringBuffer(50);
        System.out.println("\nNew buffer capacity: " + sb2.capacity());

        // Add content and check capacity
        sb2.append("Java Programming");
        System.out.println("After adding content: " + sb2);
        System.out.println("Capacity after append: " + sb2.capacity());

        // Creating StringBuffer with small initial capacity
        StringBuffer sb3 = new StringBuffer(10);
        System.out.println("\nInitial capacity of sb3: " + sb3.capacity());

        // Adding content beyond initial capacity
        sb3.append("This will exceed initial capacity");
        System.out.println("Capacity after exceeding: " + sb3.capacity());
        System.out.println("Content: " + sb3);
    }
}
