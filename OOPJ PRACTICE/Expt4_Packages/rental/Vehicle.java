package rental;

public class Vehicle {
    private String vehicleNumber;
    private String model;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String model, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.rentalRate = rentalRate;
    }

    // Protected method as required
    protected double calculateRental(int days) {
        return rentalRate * days;
    }

    // Public method for customers to access rental cost
    public double getRentalAmount(int days) {
        return calculateRental(days);
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getModel() {
        return model;
    }
}
