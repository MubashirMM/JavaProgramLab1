package object_oriented_programming;

public class Example9_goat  implements Example9_InterfaceAnimals{
	
	//implementations of abstract methods
	public void color(){
		System.out.println("Goats exist in combine and only one different colors.");
	}
	public void legs() {
		System.out.println("Goats have 4 legs.");
	}
	
	@Override
	public void sound() {
		Example9_InterfaceAnimals.super.sound();
		System.out.println("Goat voice is Maa maa.");
	}
}
