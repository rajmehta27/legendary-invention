import java.util.*;

public class ArithmeticError{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter number 1 : ");
			int a = sc.nextInt();
			System.out.println("Enter number 2 : ");
			int b = sc.nextInt();
			
			int result = a / b;
			System.out.println("Result : " + result);

		}catch(ArithmeticException e){
		
			System.out.println("Error : Cannot divide by zero");	
		
		}catch(Exception e){
			System.out.println("Enter a valid number");
		}
		finally{
			System.out.println("Process is complete");
		}
		
	}
}