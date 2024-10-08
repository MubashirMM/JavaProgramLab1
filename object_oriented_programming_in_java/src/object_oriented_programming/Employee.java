package object_oriented_programming;

public class Employee {

	
	//attributes
	String employeeId;
	String employeeName;
	int employeeSalary;
	
	//constructors
	Employee(){}
	Employee(String i,String n,int s){
		employeeId=i;
		employeeName=n;
		employeeSalary=s;
	}
	
	//employee details revealing 
	void employeeDetail() {
		///System.out.println("Employee details: ");
		System.out.println("Employee id: "+employeeId);
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Employee Salary: "+employeeSalary);
	}
}
