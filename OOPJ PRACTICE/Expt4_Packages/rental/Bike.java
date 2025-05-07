package rental;

public class Bike extends Vehicle {
    public Bike(String vehicleNumber, String model, double rentalRate) {
        super(vehicleNumber, model, rentalRate);
    }

    @Override
    protected double calculateRental(int days) {
        // 5% discount for bikes
        return super.calculateRental(days) * 0.95;
    }
}
