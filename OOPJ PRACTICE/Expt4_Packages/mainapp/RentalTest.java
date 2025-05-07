package mainapp;

import rental.Car;
import rental.Bike;
import customer.Customer;

public class RentalTest {
    public static void main(String[] args) {
        Car car = new Car("CAR123", "Toyota Corolla", 50.0);
        Bike bike = new Bike("BIKE456", "Yamaha MT-15", 20.0);

        Customer customer = new Customer("Alice");

        customer.rentVehicle(car, 5); // Car rental
        customer.rentVehicle(bike, 3); // Bike rental
    }
}
