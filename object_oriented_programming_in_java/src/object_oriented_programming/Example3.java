package object_oriented_programming;


//car class 
//example

public class Example3 {

	String model,color;
	int year;
	
	Example3(String m,String c,int y){
		model=m;
		color=c;
		year=y;
	}
	
	void displayDetails() {
		System.out.println("Car Details : ");
		System.out.println("Model: "+model);
		System.out.println("Color: "+color);
		System.out.println("Year: "+year);
	}
	
	
}
