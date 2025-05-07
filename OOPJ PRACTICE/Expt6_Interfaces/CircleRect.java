import java.util.Scanner;

public class CircleRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius, length, width;
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        circle.display();
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.print("Enter the length of the rectangle: ");
        length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = sc.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        rectangle.display();
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        sc.close();
    }
}

interface Shape {
    double getArea();

    double getPerimeter();
}

abstract class Abstractshape implements Shape {
    String name;

    Abstractshape(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Shape: " + name);
    }
}

class Circle extends Abstractshape {
    double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Abstractshape {
    double length, width;

    Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}