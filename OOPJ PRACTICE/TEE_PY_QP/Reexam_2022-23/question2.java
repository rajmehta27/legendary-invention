import java.util.*;

public class question2{
	public static void main(String[] args){
		
		voting v = new voting();
		v.input();
		v.eligibility();
		
	}
}

class voting{
	String name;
	int age;

	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter age : ");
		age = sc.nextInt();
	}
	void eligibility(){
		if(age >= 18){
			System.out.println("Eligible to case the vote");	
		}
		else{
			System.out.println("Not eligible to case the vote");
		}
	}
}