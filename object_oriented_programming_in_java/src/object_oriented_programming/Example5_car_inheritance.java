package object_oriented_programming;

public class Example5_car_inheritance extends Example5_vehicle_inheritance  {

	int doors;
	//constructors
	Example5_car_inheritance(String m,String e,int d){
	super(m,e);	
	doors=d;
	}
	//
       public void start(){
    		super.start();      
		System.out.println("Doors of the Car are :"+doors);
	}
}
