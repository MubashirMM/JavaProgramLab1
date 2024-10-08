package object_oriented_programming;

import java.util.*;

public class Passenger {

	// attributes
	int passengerId;
	String passengerName;
	int age;
	int ticketId;
	int luggageId;
	boolean isChecked = false;

	// list for storing passenger luggage
	List<Luggage> luggage;
	// list for airport employee info
	List<Airport_employee> airportEmployee;
	// list for airplane employee info
	List<Airplane_employee> airplaneEmployee;

	/// constructor
	Passenger(int i, String n, int a, int ti, int li, boolean c) {
		passengerId = i;
		passengerName = n;
		age = a;
		ticketId = ti;
		luggageId = li;
		isChecked = c;

		// initialization of lists
		luggage = new ArrayList<>();
		airportEmployee = new ArrayList<>();
		airplaneEmployee = new ArrayList<>();
	}

	// Ad luggage
	void addLuggage(int li, int pi, int fi, int n, boolean s) {
		luggage.add(new Luggage(li, pi, fi, n, s));
	}

	// add airplane employee
	void addAirPlaneEmployee(Airplane_employee em) {
		airplaneEmployee.add(em);

	}

	// add airport employee
	void addAirPortEmployee(Airport_employee em) {

		airportEmployee.add(em);
	}

	// show passenger details
	void passengerDetail() {

		System.out.println("Passenger details: ");
		System.out.println("Passenger Name: " + passengerName);
		System.out.println("Passenger Id: " + passengerId);
		System.out.println("Passenger LuggageID: " + luggageId);
		System.out.println("Passenger Ticket ID: " + ticketId);
		System.out.println("Passenger Age: " + age + " years");

		// display luggage
		if (luggage.size() > 0) {
			for (Luggage l : luggage) {
				l.luggageDetail();
				System.out.println();
			}
		} else {
			System.out.println("No Luggage!");
		}

		// display airplane employee
		if (airplaneEmployee.size() > 0) {
			for (Airplane_employee em : airplaneEmployee) {
				em.airplaneEmployeeDetail();
				System.out.println();
			}
		} else {
			System.out.println("No AirPlaneEmployee!");
		}

		// display airport employee
		if (airportEmployee.size() > 0) {
			for (Airport_employee em : airportEmployee) {
				em.airportEmployeeDetail();
				System.out.println();
			}
		} else {
			System.out.println("No AirPort Employee!");
		}
	}

	boolean checkIn() {

		return isChecked;
	}
}
