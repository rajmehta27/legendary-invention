import java.util.*;

public class abstract_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the sphere: ");
        double radius = sc.nextDouble();
        Shape3D sphere = new Sphere(radius);
        System.out.println("Volume of Sphere: " + sphere.calculateVolume());
        System.out.println("Surface Area of Sphere: " + sphere.calculatesurfaceArea());

        System.out.println("Enter the side of the cube: ");
        double side = sc.nextDouble();
        Shape3D cube = new Cube(side);
        System.out.println("Volume of Cube: " + cube.calculateVolume());
        System.out.println("Surface Area of Cube: " + cube.calculatesurfaceArea());

        sc.close();
    }
}

abstract class Shape3D {
    abstract double calculateVolume();

    abstract double calculatesurfaceArea();
}

class Sphere extends Shape3D {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    double calculatesurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

class Cube extends Shape3D {
    double side;

    Cube(double side) {
        this.side = side;
    }

    double calculateVolume() {
        return Math.pow(side, 3);
    }

    double calculatesurfaceArea() {
        return 6 * Math.pow(side, 2);
    }
}