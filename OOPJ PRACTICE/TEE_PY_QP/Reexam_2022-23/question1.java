import java.util.*;

public class question1{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		int count = 0;
		int sum = 0;
		int product = 1;
		int digit;
		int temp = number;
		while(temp != 0){
			count++;
			temp = temp/10;
		}

		if(count == 3){
			temp = number;
			while(temp != 0){
				digit = temp % 10;
				sum = sum + digit;
				temp = temp / 10;
			}
			System.out.println(sum);
		}

		if(count == 2){
			temp = number;
			while(temp != 0){
				digit = temp % 10;
				product = product * digit;
				temp = temp / 10;
			}
			System.out.println(product);
		}

		if(count == 1){
			System.out.println(number);
		}
	

	}
}