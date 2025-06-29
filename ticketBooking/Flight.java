package ticketBooking;
public class Flight implements Bookable {
	
	public int flightNumber;
	public String departureCity;
	public String arrivalCity;
	public double ticketPrice;
	public String bookingStatus;
	public double gst;
	public int noOfTickets;
	
	public Flight(int flightNumber, String departureCity, String arrivalCity,int noOfTickets)
	{
		this.flightNumber = flightNumber;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.noOfTickets = noOfTickets;
		this.ticketPrice = noOfTickets*10000;
}

	public void bookTicket() {
		this.bookingStatus = "Done";
		System.out.println("Flight Ticket booking done ");
	}

	public void cancelBooking() {
		this.bookingStatus = "Cancelled";
		System.out.println("Flight Ticket cancelled");
		
	}
    void gst() {
  	gst = ((double)18/100)*ticketPrice;
  	System.out.println("GST 18%                       : +"+gst);
  	ticketPrice = ticketPrice + gst;
    }
	public void displaydetails() {
		System.out.println("Flight number                 : "+flightNumber);
		System.out.println("Flight departure city         : "+departureCity);
		System.out.println("Flight arrival city           : "+arrivalCity);
		System.out.println("Ticket price for one person   : 10000");
		System.out.println("No of tickets                 : "+noOfTickets);
		System.out.println("Flight ticket price           : "+ticketPrice);
		gst();
		System.out.println("Total                         : "+ticketPrice);
	}
	
	public void bookingStatus() {
		System.out.println("Flight ticket booking status  : "+bookingStatus);
	}
}
