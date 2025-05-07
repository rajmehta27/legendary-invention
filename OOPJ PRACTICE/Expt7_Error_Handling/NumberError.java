import java.util.*;

public class NumberError{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		try{
			String number;
			System.out.println("Enter a number : ");
			number = sc.nextLine();
			int a = Integer.parseInt(number);
			System.out.println("Number entered is : " + a);

		}catch(NumberFormatException e){
			
			System.out.println("Enter a valid integer number");
		
		}
		finally{
			System.out.println("Input is processed");
		}
	}
}