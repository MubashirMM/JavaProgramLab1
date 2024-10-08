package object_oriented_programming;

public class Example12_employee {

	//attributes
	String name;
	String id;
	
	//constructor
	Example12_employee(String n,String i){
		name=n;
		id=i;
	}
	
	//display
	void employeeDetail() {
		System.out.println("Employee detailss: ");
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
	}
}
