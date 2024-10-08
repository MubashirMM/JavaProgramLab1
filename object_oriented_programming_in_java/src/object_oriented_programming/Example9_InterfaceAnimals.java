package object_oriented_programming;

public interface Example9_InterfaceAnimals {

	//some methods
 void color();
 void legs();
	
	//default methods 
	default void sound() {
		System.out.println("All animal have different voice!");
	}
}
