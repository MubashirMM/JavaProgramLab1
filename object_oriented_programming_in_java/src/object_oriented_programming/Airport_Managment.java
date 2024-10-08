package object_oriented_programming;

import java.util.*;

public class Airport_Managment {

	// attributes
	String airPortName;
	String cityName;
	String area;

	// list of flight
	List<Flight> flight;
	// list of the notice board
	List<Notice_board> noticeBoard;
	// list of Ticket counters
	List<Ticket_counter> ticketCounter;

	// constructor
	Airport_Managment(String a, String c, String ar) {
		airPortName = a;
		cityName = c;
		area = ar;

		// initialization of the lists
		flight = new ArrayList<>();
		noticeBoard = new ArrayList<>();
		ticketCounter = new ArrayList<>();
	}

	// methods
	void open() {

		System.out.println("Airplane Is open Now.");
	}

	// add flights for airport
	void addFlight(int i, int c, int fn, String s, String d, String st, String rt, int f) {

		Flight newF = new Flight(i, c, fn, s, d, st, rt, f);
		flight.add(newF);
	}

	// add notice boards for air port
	void addNoticeBoard(int i, int fn, String s, String d, String st, String rt) {

		Notice_board newNB = new Notice_board(i, fn, s, d, st, rt);
		noticeBoard.add(newNB);
	}

	// add ticket counters
	void addTicketCounter(int tid, int pid, String s, String d, int f, int fid) {

		Ticket_counter newTC = new Ticket_counter(tid, pid, s, d, f, fid);
		ticketCounter.add(newTC);

	}

	// airport details
	void airportDetails() {

		System.out.println("AirPort Details:");
		System.out.println("Name: " + airPortName);
		System.out.println("City name: " + cityName);
		System.out.println("Area: " + area);
		System.out.println();

		// display the flights
		if (flight.size() > 0) {
			for (Flight f : flight) {
				f.flightDetails();
				System.out.println();
			}
		} else {
			System.out.println("No Flight!");
		}

		// display the notice boards
		if (noticeBoard.size() > 0) {
			for (Notice_board NB : noticeBoard) {
				NB.NoticeBoardDetails();
				System.out.println();
			}
		} else {
			System.out.println("No Notice Board!");
		}

		// display the ticket counters
		if (ticketCounter.size() > 0) {
			for (Ticket_counter TC : ticketCounter) {
				TC.ticketDetail();
				System.out.println();
			}
		} else {
			System.out.println("No Ticket Counter!");
		}
	}
}
