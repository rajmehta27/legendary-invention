
public class function_overload2 {
    public static void main(String[] args) {
        Flight flight = new Flight();
        flight.fly();

        PassengerFlight passengerFlight = new PassengerFlight();
        passengerFlight.fly();

        CargoFlight cargoFlight = new CargoFlight();
        cargoFlight.fly();
    }
}

class Flight {
    void fly() {
        System.out.println("The flight is flying.");
    }
}

class PassengerFlight extends Flight {
    @Override
    void fly() {
        System.out.println("The passenger flight is flying with passengers.");
    }
}

class CargoFlight extends Flight {
    @Override
    void fly() {
        System.out.println("The cargo flight is flying with cargo.");
    }
}
