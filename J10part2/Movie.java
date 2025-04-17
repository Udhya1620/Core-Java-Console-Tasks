package J10part2;

public class Movie implements Bookable{
	
	public String movieTitle;
	public String showTime;
	private String bookingStatus;
	private int noOfTickets;
	public double ticketPrice;
	public double gst;
	

	public Movie(String movieTitle, String showTime , int noOfTickets){
		this.movieTitle = movieTitle;
		this.showTime = showTime;
		this.noOfTickets = noOfTickets;
		this.ticketPrice = noOfTickets*150;
	}
	public void bookTicket() {
		this.bookingStatus = "Done";
		System.out.println("Movie Ticket booking done ");
	}

	public void cancelBooking() {
		this.bookingStatus = "Cancelled";
		System.out.println("Movie Ticket cancelled");
		
	}
	
      void gst() {
    	gst = ((double)18/100)*ticketPrice;
    	System.out.println("GST 18%                       : +"+gst);
    	ticketPrice = ticketPrice + gst;
      }
      
	
	public void displaydetails() {
		System.out.println("Movie Title                   : "+movieTitle);
		System.out.println("Show time                     : "+showTime);
		System.out.println("Ticket price (per person)     : 150");
		System.out.println("No of tickets                 : "+noOfTickets);
		System.out.println("Ticket price for "+noOfTickets+" Tickets is : "+ticketPrice);
		gst();
		System.out.println("Total                         : "+ticketPrice);
	}
	
	public void bookingStatus() {
		System.out.println("Movie ticket booking status   : "+bookingStatus);
	}
}
