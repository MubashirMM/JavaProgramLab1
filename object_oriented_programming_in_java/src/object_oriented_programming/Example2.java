package object_oriented_programming;

public class Example2 {
	
	///print stars function 
	public static void printStars(int blank,int stars) {
		int count=1;
		
		//print blanks
		for(;count<=blank;count++)
			System.out.println("-");
		//print stars 	
		for(count=1;count<=stars;count++)
			System.out.println(" *");
		System.out.println();
		
	}

	public static void main(String[] args) {
		
      //function call
		printStars(3,10);
		
	}

}
