package customer;

import rental.Vehicle;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void rentVehicle(Vehicle vehicle, int days) {
        double amount = vehicle.getRentalAmount(days);
        System.out.println(name + " rented " + vehicle.getModel() + " for " + days + " days. Total: $" + amount);
    }
}
