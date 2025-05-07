public class constructor_overloading {
    public static void main(String[] args) {
        Room r1 = new Room(50);
        Room r2 = new Room(5, 50);
        System.out.println("Area of square room : " + r1.area());
        System.out.println("Area of rectangular room : " + r2.area());
    }
}

class Room {
    double length, breadth;

    Room(double side) {
        this.length = side;
        this.breadth = side;
    }

    Room(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
}