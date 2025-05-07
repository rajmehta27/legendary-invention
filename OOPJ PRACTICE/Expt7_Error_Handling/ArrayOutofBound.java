import java.util.*;

public class ArrayOutofBound{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size = sc.nextInt();

		int[] array = new int[size];
		//int[] array = {10,20,30,40,50};

		for(int i = 0; i < size; i++){
			System.out.println("Enter element : ");
			array[i] = sc.nextInt();
		}
		
		try{
			System.out.println("Enter index :  ");
			int index = sc.nextInt();
			System.out.println("Value at index " + index + " : " + array[index]);

		}catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Invalid Index");

		}catch(Exception e){

			System.out.println("Enter valid integer");			

		}
		finally{

			System.out.println("Indexing Process Complete");

		}
	}
}