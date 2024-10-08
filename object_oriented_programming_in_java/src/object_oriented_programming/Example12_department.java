package object_oriented_programming;

import java.util.*;

public class Example12_department {
	//attributes
String name;
String id;
List<Example12_employee> employee;

//constructor
Example12_department(String n, String i)
{
	name=n;
	id=i;
	employee=new ArrayList<>();
	}

void addEmployee(Example12_employee newEmployee) {
	employee.add(newEmployee);
}

void departmentDetails() {
	System.out.println("Department ID: "+name);
	System.out.println("Department Name: "+id);
	for(Example12_employee em:employee) {
		em.employeeDetail();
			}
}
}
