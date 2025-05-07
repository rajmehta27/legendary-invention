import java.util.*;

public class MainQuestion4{
	public static void main(String[] args){
		LandMammal l = new LandMammal();
		l.move();
		l.makesound();

		AquaticMammal a = new AquaticMammal();
		a.swim();
		a.makesound();

		HybridMammal h = new HybridMammal();
		h.swim();
		h.move();
		h.makesound();
	}
}

interface LandAnimal{
	void move();
}
interface AquaticAnimal{
	void swim();
}

class Animal{
	void makesound(){
		System.out.println("Animal is making a sound");
	}
}

class LandMammal extends Animal implements LandAnimal{
	public void move(){
		System.out.println("Animal is moving");
	}	
}

class AquaticMammal extends Animal implements AquaticAnimal{
	public void swim(){
		System.out.println("Aquatic Animal is swimming");
	}	
}

class HybridMammal extends LandMammal implements AquaticAnimal{
	public void swim(){
		System.out.println("Hybrid Animal is swimming");
	}
	
}