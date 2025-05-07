import java.util.*;

public class MainQuestion4{
	public static void main(String[] args){
		
		Car c = new Car();
		c.startPetrolEngine();
		c.stopPetrolEngine();
		c.drive();
		
		Bicycle b = new Bicycle();
		b.drive();
		b.startElectricMotor();
		b.stopElectricMotor();		

		HybridCar h = new HybridCar();
		h.drive();
		h.startElectricMotor();
		h.stopElectricMotor();
		h.startPetrolEngine();
		h.stopPetrolEngine();	
	
	}
}

interface PetrolVehicle{
	void startPetrolEngine();
	void stopPetrolEngine();
}


interface ElectricVehicle{
	void startElectricMotor();
	void stopElectricMotor();
}


class Vehicle{

	void drive(){
		System.out.println("Vehicle is being Driven");
	}

}


class Car extends Vehicle implements PetrolVehicle{

	public void startPetrolEngine(){
		System.out.println("Petrol Car is Started");
	}

	public void stopPetrolEngine(){
		System.out.println("Petrol Car is Stopped");
	}
}


class Bicycle extends Vehicle implements ElectricVehicle{

	public void startElectricMotor(){
		System.out.println("Electric Bicycle is Started");
	}

	public void stopElectricMotor(){
		System.out.println("Electric Bicycle is Stopped");
	}
}


class HybridCar extends Car implements ElectricVehicle{

	public void startElectricMotor(){
		System.out.println("Hybrid Car (electric) is Started");
	}

	public void stopElectricMotor(){
		System.out.println("Hybrid Car (electric) is Stopped");
	}

}