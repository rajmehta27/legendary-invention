package rental;

public class Car extends Vehicle {
    public Car(String vehicleNumber, String model, double rentalRate) {
        super(vehicleNumber, model, rentalRate);
    }

    @Override
    protected double calculateRental(int days) {
        // 10% surcharge for cars
        return super.calculateRental(days) * 1.10;
    }
}
