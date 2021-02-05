package model;

/**
 * Sterling Rhone - sprhone
 * 202102 CIS175 26740
 * Feb 4, 2021
 */
public class Tickets {

	private String bandName;
	private boolean ticketsAvailable = true;
	private double ticketPrice;
	final private int INITIAL_TICKETS_AVAILABLE = 25;
	private int ticketsCurrentlyAvailable = INITIAL_TICKETS_AVAILABLE;
	private int ticketsSold;
	
	public Tickets() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tickets(String bandName, double ticketPrice, int ticketsSold) {
		super();
		this.bandName = bandName;
		this.ticketPrice = ticketPrice;
		this.ticketsSold = ticketsSold;
	}

	public String getBandName() {
		return bandName;
	}

	public void setBandName(String bandName) {
		this.bandName = bandName;
	}

	public boolean isTicketsAvailable() {
		return ticketsAvailable;
	}

	public void setTicketsAvailable(boolean ticketsAvailable) {
		this.ticketsAvailable = ticketsAvailable;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getTicketsCurrentlyAvailable() {
		return ticketsCurrentlyAvailable;
	}

	public void setTicketsCurrentlyAvailable(int ticketsCurrentlyAvailable) {
		this.ticketsCurrentlyAvailable = ticketsCurrentlyAvailable;
		if (this.ticketsCurrentlyAvailable < 1) {
			this.setTicketsAvailable(false);
		}
		else {
			this.setTicketsAvailable(true);
		}
	}

	public int getINITIAL_TICKETS_AVAILABLE() {
		return INITIAL_TICKETS_AVAILABLE;
	}

	public int getTicketsSold() {
		return ticketsSold;
	}

	public void setTicketsSold(int ticketsSold) {
		this.ticketsSold = ticketsSold;
	}

	@Override
	public String toString() {
		return "Tickets [bandName=" + bandName + ", ticketsAvailable=" + ticketsAvailable + ", ticketPrice="
				+ ticketPrice + ", INITIAL_TICKETS_AVAILABLE=" + INITIAL_TICKETS_AVAILABLE
				+ ", ticketsCurrentlyAvailable=" + ticketsCurrentlyAvailable + ", ticketsSold=" + ticketsSold + "]";
	}
	
	
}
