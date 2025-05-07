public class two_to_one_class {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();

        c.drive();
        c.drive_car();
        b.drive();
        b.drive_bike();
    }
}

class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle {
    void drive_car() {
        System.out.println("Driving a car");
    }
}

class Bike extends Vehicle {
    void drive_bike() {
        System.out.println("Driving a bike");
    }
}