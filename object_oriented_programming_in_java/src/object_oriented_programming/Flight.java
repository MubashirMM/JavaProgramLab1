package object_oriented_programming;

import java.util.*;

class Flight {

	// attributes
	int flightId;
	int capacity;
	int flightName;
	String source, destination;
	String startTime, reachTime;
	int fare;

	// list to add notice board for flight
	List<Notice_board> noticeBoard;
	// list to add passenger in flight
	List<Passenger> passenger;
	// list to add run way for flight
	List<Runway> runWay;

	// constructors
	Flight(int i, int c, int fn, String s, String d, String st, String rt, int f) {

		flightId = i;
		capacity = c;
		flightName = fn;
		source = s;
		destination = d;
		startTime = st;
		reachTime = rt;
		fare = f;

		// lists initialization
		noticeBoard = new ArrayList<>();
		passenger = new ArrayList<>();
		runWay = new ArrayList<>();

	}

	// add notice board
	public void addNoticeBoard(Notice_board NB) {
		noticeBoard.add(NB);
	}

	// add run way
	public void addRunWay(Runway RW) {
		runWay.add(RW);
	}

	// add passenger
	public void addPassenger(Passenger P) {
		passenger.add(P);
	}

	// showing flight details
	public void flightDetails() {
		System.out.println("Flight Details: ");
		System.out.println("FlightId: " + flightId);
		System.out.println("Flight Name: " + flightName);
		System.out.println("Flight Capacity: " + capacity);
		System.out.println("Starting Time: " + startTime);
		System.out.println("Reaching Time: " + reachTime);
		System.out.println("Source: " + source);
		System.out.println("Destination: " + destination);
		System.out.println("fare: " + fare);

		/// display passengers
		for (Passenger p : passenger) {
			p.passengerDetail();
		}

		// display notice board
		for (Notice_board nb : noticeBoard) {
			nb.NoticeBoardDetails();
		}

		// display run way
		for (Runway rw : runWay) {
			rw.runwayDetail();
		}
	}

}
