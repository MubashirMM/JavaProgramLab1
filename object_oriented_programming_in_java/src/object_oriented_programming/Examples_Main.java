package object_oriented_programming;

public class Examples_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// car object creation
		Example3 car1=new Example3("First Model","Gray Blue",2020);
		//display car details 
		car1.displayDetails();
		
		System.out.println();
		//new account creation 
		Example4 account1=new Example4(12345,2000);
		//balance check
		System.out.println("Current Balance $:"+account1.getBalance());
		//deposit amount
		account1.deposit(20);
		//withdraw
		account1.withdraw(10);
		//check balance
		System.out.println("Current Balance $:"+account1.getBalance());
		
		System.out.println();
		//vehicles and cars objects 
		Example5_vehicle_inheritance vehicle1=new Example5_vehicle_inheritance("New Model","200CC");
		Example5_car_inheritance car2=new Example5_car_inheritance("ABC","XYZ",5);
		vehicle1.start();
		car2.start();
		
		System.out.println();
		// Polymorphism functions overloading
		Example6_polymorphism object1=new Example6_polymorphism();
		int result=object1.multiply3Numbers(2, 03, 03);
	    double result1=object1.multiply3Numbers(2.3, 3.3, 3.3);
	    System.out.println("Polymorphism: ");
	    System.out.println("Result From Integer: "+result);
	    System.out.println("Result From Double: "+result1);
	    
	    System.out.println();
	    //polymorphism functions overriding 
	    Example7_birds birds=new  Example7_birds();
	    Example7_Penguins penguins=new  Example7_Penguins();
	    System.out.println("Functions Overriding:");
	    System.out.print("Birds: ");
	    birds.fly();
	    System.out.print("Penguins: ");
	    penguins.fly(); 
	    
	    System.out.println(); 
	    //Abstraction
	    System.out.println("Abstration:");
	     Example8_jasmine jasmine=new Example8_jasmine();
	     jasmine.color();
	     jasmine.size();
	     jasmine.fragrance();
	     
	     System.out.println(); 
	     //Interfaces
	     System.out.println("Interface:");
	     //objects creations 
	     Example9_cat cat=new Example9_cat();
	     cat.color();
	     cat.sound();
	     cat.legs();
	     Example9_goat goat=new Example9_goat();
	     goat.color();
	     goat.sound();
	     goat.legs();
	     
	     //unidirectional association
	     System.out.println(); 
	     System.out.println("Unidirectional-Association:");
	     //object creations 
	     Example10_Teacher teacher=new Example10_Teacher("Muhammad Mubashir","Islam","2022se46");
	     Example10_classRoom clas=new Example10_classRoom("Software Engineering","M-11",teacher,45);
	     clas.classDetail();
	     
	     System.out.println(); 
	     System.out.println("Bidirectional Association!");
	     Example11_student st1=new Example11_student("2022se46","Muhammad Mubashir");
	     Example11_student st2=new Example11_student("2022se40","Saeed Ahmad");
	    // st1.enrollCourse("CS-12", "Computer Science");
	    // st1.enrollCourse("Py-1", "Pysics");
	     Example11_courses c1=new Example11_courses("SE-11","Software Engi.");
	     Example11_courses c2=new Example11_courses("S-12","Sciology for Engi.");
	     //c1.addStudent("2022se33", "Ali");
	     //c1.addStudent("2022se21", "Alia");
	     st1.enrollCourse(c1);
	     st1.enrollCourse(c2);
	     c1.addStudent(st2);
	     c1.addStudent(st1);
	     //display 
	     c1.showCourses();
	     System.out.println();  
	     st1.showStudent();
	     
	     System.out.println(); 
	     System.out.println("Aggregation:");
	     //object creations
	     Example12_employee employee=new Example12_employee("123","Ali");
	     Example12_employee employee1=new Example12_employee("143","Alia");
	     Example12_employee employee2=new Example12_employee("133","Ali Hamza");
	     
	     Example12_department department=new Example12_department("D-1","CS");
	     Example12_department department1=new Example12_department("D-2","SE");
	     Example12_department department2=new Example12_department("D-4","EE");
	     /// add employee
	     department.addEmployee(employee1);
	     department.addEmployee(employee2);
	     department1.addEmployee(employee);
	     department2.addEmployee(employee1);
	     department1.addEmployee(employee2);
	     department1.addEmployee(employee1);
	     //display the details 
	     department.departmentDetails();
	     department1.departmentDetails();
	     department2.departmentDetails();
	     
	     
	     //composition
	     System.out.println(); 
	     System.out.println("Composition:");
	     //objection creating
	     Example13_house house=new  Example13_house("HN-12345","Lahore");
	     house.addRoom("Guest room", "33");
	     house.addRoom("Living room", "21");
	     house.addRoom("Study room", "2");
	     house.addRoom("Luggage room", "1");
	     //showing details of the house
	     house.showHouse();
	     
	     
	     
	}
}
