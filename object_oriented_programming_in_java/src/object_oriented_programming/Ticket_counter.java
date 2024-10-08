package object_oriented_programming;

public class Ticket_counter {
	
	//attributes
	int ticketId;
	int passengerId;
	String source,destination;
	int fare;
	int flightId;

   //constructor
	Ticket_counter(int tid,int pid,String s,String d,int f,int fid){
		
		ticketId=tid;
		passengerId=pid;
		source=s;
		destination=d;
		fare=f;
		flightId=fid;	
	}
	 
	//showing ticket details
	void ticketDetail() {
		System.out.println("Ticket Detail: ");
		System.out.println("TicketId: "+ticketId);
		System.out.println("PassengerId: "+passengerId);
		System.out.println("Source: "+source);
		System.out.println("Destination: "+destination);
		System.out.println("fare: "+fare);
		System.out.println("FlightId: "+flightId);
	}
	
	//book ticket
	void bookTicket() {
		
		System.out.println("Ticket Booked for Passenger ID "+passengerId);
	}
}
