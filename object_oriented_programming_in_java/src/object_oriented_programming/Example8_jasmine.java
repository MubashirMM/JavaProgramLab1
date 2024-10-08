package object_oriented_programming;

public class Example8_jasmine extends Example8_Flowers {

	//implementation of the abstract class
	//that is must to implement 
	public void size() {
		System.out.println("Jasmine size is about 1.5 inch!");
		}
	public void fragrance() {
		System.out.println("Jasmine has strong and sweet fragrance!");
	}
	
	@Override
	void color() {
		super.color();
		System.out.println("Jasmine exist in white, yellow and light pink color!");
	}
}
