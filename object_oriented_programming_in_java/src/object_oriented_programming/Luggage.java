package object_oriented_programming;

public class Luggage {

	// attributes
	int luggageId;
	int passengerId;
	int flightId;
	int noOfLuggages;
	boolean status = false;

	// constructor
	Luggage(int li, int pi, int fi, int n, boolean s) {
		luggageId = li;
		flightId = fi;
		passengerId = pi;
		noOfLuggages = n;
		status = s;
	}

	// luggage status
	boolean luggageStatus() {

		return status;
	}

	// show luggage details
	void luggageDetail() {

		System.out.println("Luggage details: ");
		System.out.println("Passenger Id: " + passengerId);
		System.out.println("Passenger LuggageID: " + luggageId);
		System.out.println("FlightId: " + flightId);
		System.out.println("Numners of luggages: " + noOfLuggages);
		System.out.println("Luggage Status: " + luggageStatus());

	}

}
