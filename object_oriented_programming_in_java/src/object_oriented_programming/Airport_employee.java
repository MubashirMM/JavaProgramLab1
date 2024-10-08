package object_oriented_programming;

import java.util.ArrayList;
import java.util.List;

public class Airport_employee extends Employee{

	//attributes
	String designation,department;
	
	//list to add passenger 
	List<Passenger> passenger;
	//constructor
	Airport_employee(String Id,String eName,int salary,String d,String dep){
		super(Id, eName, salary);
		designation=d;
		department=dep;
		passenger=new ArrayList<>();
	}
	
	//add passenger 
	void addPassenger(Passenger P) {
		passenger.add(P);
	}
	
	//show details 
	void airportEmployeeDetail() {
		System.out.println();
		System.out.println("Air port Employee Details:");
		System.out.println("Designation: "+designation);
		System.out.println("Department: "+department);
		super.employeeDetail();
		
		///display passengers
		for(Passenger p:passenger) {
			p.passengerDetail();
		}
	}
	
}
