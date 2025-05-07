import java.util.*;

public class MainQuestion2{
	public static void main(String[] args){
		More_Electricity c1 = new More_Electricity(350);
		c1.Bill();

		More_Electricity c2 = new More_Electricity(250);
		c2.Bill();

		More_Electricity c3 = new More_Electricity(100);
		c3.Bill();
	}
}

class Electricity{

	int unit;
	double cost;
	Electricity(int units){
		this.unit = units;
		this.cost = 0.0;
	}
	void Bill(){
		if(unit <= 100){
			cost = unit * 0.50;
		}
		else if(unit <= 300){
			cost = (100 * 0.50) + ((unit - 100) * 0.50);
		}
		else{
			cost = (100 * 0.50) + (200 * 0.50) + ((unit - 300) * 0.60);
		}
		System.out.println("Total cost without surcharge : Rs. " + cost);
	}
}

class More_Electricity extends Electricity{

	More_Electricity(int units){
		super(units);
	}
	void Bill(){
		super.Bill();
		if (cost > 250){
			double surcharge = 0.15 * (cost - 250);
			cost = cost + surcharge;
			System.out.println("Total 15% surcharge amount : Rs. " + surcharge);
		}

		System.out.println("Total cost with surcharge if any : Rs. " + cost);
	}
	
}