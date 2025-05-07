import java.util.*;

public class AccessModifierExample{
	public static void main(String[] args){
		
		A a = new A();
		System.out.println("Public Variable: " + a.publicVar);
		//System.out.println("Private Variable: " + a.privateVar);
		System.out.println("Protected Variable: " + a.protectedVar);
		
		a.display();
	
	}
}


class A{
	public int publicVar = 10;
	private int privateVar = 20;
	protected int protectedVar = 30;

	public void display(){
		System.out.println("Inside display() method: ");
		System.out.println("Public Variable: " + publicVar);
		System.out.println("Private Variable: " + privateVar);
		System.out.println("Protected Variable: " + protectedVar);
	}

}