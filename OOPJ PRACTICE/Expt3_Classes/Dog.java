import java.util.Scanner;

class Dog {
    String name;
    String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void printDetails() {
        System.out.println("\nDog Name: " + name);
        System.out.println("Dog Color: " + color);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dog's name: ");
        String dogName = scanner.nextLine();
        System.out.print("Enter dog's color: ");
        String dogColor = scanner.nextLine();
        Dog myDog = new Dog(dogName, dogColor);
        myDog.printDetails();
        scanner.close();
    }
}