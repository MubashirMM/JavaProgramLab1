package object_oriented_programming;

//subclass for birds class
public class Example7_Penguins extends Example7_birds {

	//functions overriding 
	@Override
	public void fly() {
		super.fly();
		System.out.println("Penguins Cannot fly!");
	} 
} 
