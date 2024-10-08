package object_oriented_programming;

public class Example5_vehicle_inheritance {

	String model;
	String engine;
	
	Example5_vehicle_inheritance(String m,String e){
		model=m;
		engine=e;
	}
	
	public void start()
   {  System.out.println("Model is:"+model+" & Engine is:"+engine);		}
}
