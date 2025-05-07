import java.util.*;

public class MainQuestion3{
	public static void main(String[] args){

		Member b = new Member("Raj", 21, "1234567890", "Kandivali", 50000.00);
		b.printSalary();

		Employee e = new Employee("Raj", 21, "1234567890", "Kandivali", 50000.00, "Employee", "Computer");
		e.printSalary();
		Manager m = new Manager("Raj", 21, "1234567890", "Kandivali", 50000.00, "Manager", "Computer");
		m.printSalary();
		
	}
}

class Member{
	String Name;
	int Age;
	String phone_number;
	String Address;
	double Salary;

	Member(String Name, int Age, String phone_number, String Address, double Salary){
		this.Name = Name;
		this.Age  = Age;
		this.phone_number = phone_number;
		this.Address  = Address;
		this.Salary  = Salary;
	}

	void printSalary(){
		System.out.println("Name : " + Name);
		System.out.println("Age : " + Age);
		System.out.println("Phone number : " + phone_number);
		System.out.println("Address : " + Address);
		System.out.println("Salary : " + Salary);
	}
}

class Employee extends Member{
	String specialization;
	String department;
	Employee(String Name, int Age, String phone_number, String Address, double Salary, String specialization, String department){
		super(Name, Age, phone_number, Address, Salary);
		this.specialization = specialization;
		this.department = department;
		
	}

	void printSalary(){
		super.printSalary();
		System.out.println("Specialization : " + specialization);
		System.out.println("Deparment : " + department);
	}
}

class Manager extends Member{

	String specialization;
	String department;
	Manager(String Name, int Age, String phone_number, String Address, double Salary, String specialization, String department){
		super(Name, Age, phone_number, Address, Salary);
		this.specialization = specialization;
		this.department = department;
		
	}

	void printSalary(){
		super.printSalary();
		System.out.println("Specialization : " + specialization);
		System.out.println("Deparment : " + department);
	}

}