package object_oriented_programming;

public class Notice_board {
	
	//attributes
	int flightId;
	int flightName;
	String source,destination;
	String startTime,reachTime;
	//status for flight
	boolean status;
	
	//constructor 
	Notice_board(int i,int fn,String s,String d,String st,String rt){
		flightId=i;
		flightName=fn;
		source=s;
		destination=d;
		startTime=st;
		reachTime=rt;
	}
	
	//showing flight details
	void NoticeBoardDetails() {
		
		System.out.println("Notice Board.");
		System.out.println("FlightId: "+flightId);
		System.out.println("Flight Name: "+flightName);
		System.out.println("Starting Time: "+startTime);
		System.out.println("Reaching Time: "+reachTime);
		System.out.println("Source: "+source);
		System.out.println("Destination: "+destination);
		
	}
	
	boolean flightStatus() {
		return status;
	};
}
