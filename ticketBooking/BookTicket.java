package ticketBooking;

public class BookTicket {

	public static void main(String[] args) {

		Movie movie = new Movie("kgf 3", "18:30", 5);
        movie.displaydetails();
        movie.bookTicket();
        movie.bookingStatus();
    	movie.cancelBooking();
        movie.bookingStatus();
        
        System.out.println("-----------------------------------------");
        
        Flight flight = new Flight(274202, "chennai", "dubai", 3);
        flight.displaydetails();
        flight.bookTicket();
        flight.bookingStatus();
        flight.cancelBooking();
        flight.bookingStatus();
	}

}
