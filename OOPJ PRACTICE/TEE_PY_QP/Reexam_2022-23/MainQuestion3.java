import java.util.*;

public class MainQuestion3{
	public static void main(String[] args){
		
		Patient p = new Patient("Raj", "Cholera");
		p.putdata();
		
		In_patient i = new In_patient("Raj", "Cholera", 250);
		i.putdata();

		Out_patient o = new Out_patient("Raj", "Cholera", 2250);
		o.putdata();
	
	}
}

class Patient{
	String name;
	String disease;
	
	Patient(String name, String disease){
		this.name = name;
		this.disease = disease;
	}
	
	void putdata(){
		System.out.println("Patient Name : " + name);
		System.out.println("Disease : " + disease);
	}	
}

class In_patient extends Patient{

	float roomrent;
	
	In_patient(String name, String disease, float roomrent){
		super(name, disease);
		this.roomrent = roomrent;
	}
	
	void putdata(){
		super.putdata();
		System.out.println("Room charges : " + roomrent);
		
	}
}

class Out_patient extends Patient{

	float OPD_charges;
	
	Out_patient(String name, String disease, float OPD_charges){
		super(name, disease);
		this.OPD_charges = OPD_charges;
	}

	void putdata(){
		super.putdata();
		System.out.println("OPD charges : " + OPD_charges);
		
	}
}