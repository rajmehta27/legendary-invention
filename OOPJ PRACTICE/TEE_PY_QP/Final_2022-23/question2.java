import java.util.*;

public class question2{
	public static void main(String[] args){

		Eligible e = new Eligible();
		e.input();
		e.compute();
	}
}

class Eligible{
	
	Scanner sc = new Scanner(System.in);
	int classes_held;
	int classes_attended;
	double percentage;

	void input(){
		System.out.println("Enter the number of classes held : ");
		classes_held = sc.nextInt();
		System.out.println("Enter the number of classes attended : ");
		classes_attended = sc.nextInt();
	}	
	
	void compute(){
		percentage = ((double)classes_attended / (double)classes_held) * 100;
		System.out.println("Attendance : " + percentage);
		
		if(percentage >= 80){
			System.out.println("Student permitted to appear in the exam");
		}
		else{
			System.out.println("Student not allowed to appear in the exam");
		}
	}

}