package object_oriented_programming;

public class Example9_cat implements Example9_InterfaceAnimals {
	
	//implementation of abstract methods 
	
	public void color() {
		System.out.println("Cats exist in white,black,and some combine colors!");
	}

	public void legs() {
		Example9_InterfaceAnimals.super.sound();
		System.out.println("Cats have 4 legs!");
	}
	
	@Override
	public void sound() {
		Example9_InterfaceAnimals.super.sound();
		System.out.println("Cat voice is  Meow!");
	}
	
}
