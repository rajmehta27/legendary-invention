
public class three_diff_constructors {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        Bird b2 = new Bird("Parrot");
        Bird b3 = new Bird("Sparrow", 2);
        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
    }
}

public class Bird {
    String name;
    int age;

    public Bird() {
        this.name = "Rocky";
    }

    public Bird(String name) {
        this.name = name;
    }

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("This is the bird named " + name);
        if (age != 0) {
            System.out.println("Bird's age is  : " + age);
        }
    }
}