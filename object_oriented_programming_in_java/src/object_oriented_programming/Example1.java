package object_oriented_programming;

public class Example1 {

	//max of two numbers
	public static double large(double x,double y) {
		
		double max=0;
		
		if (x>y)
			x=max;
		else
			max=y;
		return max;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//function call and display
		System.out.println("MAX Element is :" + large(12,13));

	}

}
