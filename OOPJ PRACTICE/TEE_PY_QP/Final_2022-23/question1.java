import java.util.*;

public class question1{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int goal = sc.nextInt();
		int result;
		a ab = new a();
		result = ab.enough(goal);

		System.out.println("Answer is : " + result);
		sc.close();
		
	}
}

class a{
	int enough(int goal){
		int result = 0;
		int answer = 0;
		for(int i = 1; i <= goal; i++){
			if(result >= goal){
				break;
			}
			result = result + i;
			answer = i;
		}

		return answer;		
	}	
}