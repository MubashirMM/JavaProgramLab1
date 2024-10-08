package object_oriented_programming;

public class Runway {
	
	//attributes
	int runwayNo;
	int flightName;
	boolean occupiedStatus=false;
	
	//constructor
	Runway(int r,int f,boolean o){
		runwayNo=r;
		flightName=f;
		occupiedStatus=o;
	}
	
	//check occupied status of the run way
	boolean isOccupied() {
		
		return occupiedStatus;
	}
	//showing run way details
	void runwayDetail() {
		System.out.println("Run Way details: ");
		System.out.println("Run way No: "+runwayNo);
		System.out.println("Flight Name: "+flightName);
		System.out.println("Run way Status: "+isOccupied());
	}

}
