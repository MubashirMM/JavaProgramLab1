package object_oriented_programming;

import java.util.ArrayList;
import java.util.List;

public class Airplane_employee extends Employee {

	//attributes
	String designation;
	
	//list to add passenger 
	List<Passenger> passenger;
	
	//constructor
	Airplane_employee(String Id,String eName,int salary,String d){
		super(Id, eName, salary);
		designation=d;
		passenger=new ArrayList<>();
	}
	
	
	//add passenger 
	void addPassenger(Passenger P) {
		passenger.add(P);
	}
	
	void airplaneEmployeeDetail() {
		System.out.println();
		System.out.println("Air plane Employee Details:");
		System.out.println("Designation: "+designation);
		super.employeeDetail();
		
		///display passengers
		for(Passenger p:passenger) {
			p.passengerDetail();
		}
	}
}
