public class ensurecapacity {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer();
        System.out.println("Initial capacity: " + sb.capacity()); // Default 16

        // Ensure minimum capacity of 50
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensuring 50: " + sb.capacity());

        // Create another StringBuffer with initial content
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println("\nInitial capacity of sb2: " + sb2.capacity()); // 16 + 5 = 21

        // Ensure larger capacity
        sb2.ensureCapacity(100);
        System.out.println("Capacity after ensuring 100: " + sb2.capacity());

        // Ensuring smaller capacity has no effect
        sb2.ensureCapacity(50);
        System.out.println("Capacity after ensuring 50: " + sb2.capacity()); // No change
    }
}
