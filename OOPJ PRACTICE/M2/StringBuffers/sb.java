public class sb {
    public static void main(String[] args) {
        // 1. Demonstrating append()
        System.out.println("1. Demonstrating append():");
        StringBuffer sb1 = new StringBuffer("Hello ");
        sb1.append("World");
        System.out.println("After first append: " + sb1);
        sb1.append("! ").append("Welcome to ").append("Java Programming");
        System.out.println("Final string: " + sb1);
        System.out.println();

        // 2. Demonstrating insert()
        System.out.println("2. Demonstrating insert():");
        StringBuffer sb2 = new StringBuffer("Hello World");
        sb2.insert(5, " Beautiful");
        System.out.println("After first insert: " + sb2);
        sb2.insert(0, "Hey! ");
        System.out.println("After inserting at beginning: " + sb2);
        sb2.insert(sb2.length(), "!");
        System.out.println("After inserting at end: " + sb2);
        System.out.println();

        // 3. Demonstrating replace()
        System.out.println("3. Demonstrating replace():");
        StringBuffer sb3 = new StringBuffer("Hello Java Programming");
        sb3.replace(6, 10, "Python");
        System.out.println("After first replace: " + sb3);
        sb3.replace(11, sb3.length(), "Development");
        System.out.println("After second replace: " + sb3);
        System.out.println();

        // 4. Demonstrating delete()
        System.out.println("4. Demonstrating delete():");
        StringBuffer sb4 = new StringBuffer("Hello Java Programming World");
        sb4.delete(6, 11);
        System.out.println("After first delete: " + sb4);
        sb4.delete(6, sb4.length());
        System.out.println("After deleting remaining: " + sb4);
        System.out.println();

        // 5. Demonstrating reverse() and capacity()
        System.out.println("5. Demonstrating reverse() and capacity():");
        StringBuffer sb5 = new StringBuffer("Hello World");
        System.out.println("Original string: " + sb5);
        System.out.println("Initial capacity: " + sb5.capacity());
        sb5.reverse();
        System.out.println("After reverse: " + sb5);
        StringBuffer sb6 = new StringBuffer(50);
        System.out.println("New buffer capacity: " + sb6.capacity());
        System.out.println();

        // 6. Demonstrating ensureCapacity()
        System.out.println("6. Demonstrating ensureCapacity():");
        StringBuffer sb7 = new StringBuffer();
        System.out.println("Initial capacity: " + sb7.capacity());
        sb7.ensureCapacity(50);
        System.out.println("Capacity after ensuring 50: " + sb7.capacity());
        System.out.println();

        // 7. Demonstrating charAt()
        System.out.println("7. Demonstrating charAt():");
        StringBuffer sb8 = new StringBuffer("Hello World");
        System.out.println("Character at index 0: " + sb8.charAt(0));
        System.out.println("Character at index 4: " + sb8.charAt(4));
        System.out.println("Character at index 5: " + sb8.charAt(5));
        System.out.println("Printing all characters:");
        for (int i = 0; i < sb8.length(); i++) {
            System.out.println("Character at index " + i + ": " + sb8.charAt(i));
        }
        System.out.println();

        // 8. Demonstrating substring()
        System.out.println("8. Demonstrating substring():");
        StringBuffer sb9 = new StringBuffer("Hello World Java Programming");
        System.out.println("substring(6): " + sb9.substring(6));
        System.out.println("substring(6, 11): " + sb9.substring(6, 11));
        System.out.println("First word: " + sb9.substring(0, 5));
        System.out.println("Last word: " + sb9.substring(16));
        System.out.println("Middle words: " + sb9.substring(6, 15));
    }
}
