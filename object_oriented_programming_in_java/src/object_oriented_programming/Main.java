package object_oriented_programming;

public class Main {

	public static void main(String[] args) {

		// airport objects
		Airport_Managment airport1 = new Airport_Managment("Islamabad AIR", "Islamabad", "Near Mole Market");
		airport1.airportDetails();
		System.out.println();

		// adding some flights
		airport1.addFlight(1, 200, 1222, "Islamabad", "Karachi", "9AM", "10AM", 1000);
		airport1.addFlight(2, 100, 1222, "Islamabad", "Lahore", "9AM", "9:30AM", 500);
		airport1.airportDetails();
		System.out.println();

		// adding notice boards
		airport1.addNoticeBoard(1, 111, "Islamabad", "Quetta", "1AM", "2AM");
		airport1.addNoticeBoard(2, 222, "Islamabad", "Gilgit", "3AM", "4AM");
		airport1.airportDetails();
		System.out.println();

		// adding some ticket counters
		System.out.println();
		airport1.addTicketCounter(1, 1221, "Islamabad", "Muzzafarabad", 400, 113);
		airport1.addTicketCounter(2, 121, "Islamabad", "Muzzafargarh", 700, 1134);
		airport1.airportDetails();

		// adding some passengers
		System.out.println();
		Passenger passenger1 = new Passenger(1, "Mubashir", 40, 121, 222, true);
		passenger1.addLuggage(11, 1, 02, 123, false);
		passenger1.addLuggage(113, 13, 3, 23, true);
		passenger1.passengerDetail();

		// adding some run ways
		System.out.println();
		Runway runway1 = new Runway(1, 1, true);
		Runway runway2 = new Runway(2, 3, false);
		runway1.runwayDetail();
		runway1.isOccupied();
		runway2.runwayDetail();
		runway2.isOccupied();

		// adding some employee
		System.out.println();
		Airport_employee employee1 = new Airport_employee("E-12", "Ahsan", 10000, "TCS", "DBS");
		Airport_employee employee2 = new Airport_employee("E-13", "Ahsan Ali", 20000, "WER", "ASD");
		employee1.airportEmployeeDetail();
		employee2.airportEmployeeDetail();
		System.out.println();
		Airplane_employee airemploye1 = new Airplane_employee("A-123", "Sajjad", 30000, "SAW");
		Airplane_employee airemploye2 = new Airplane_employee("A-23", "Sarmad", 40000, "FGH");
		airemploye1.airplaneEmployeeDetail();
		airemploye2.airplaneEmployeeDetail();

	}

}
