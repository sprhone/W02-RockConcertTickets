package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Tickets;

/**
 * Sterling Rhone - sprhone
 * 202102 CIS175 26740
 * Feb 4, 2021
 */
public class TestTicketsMessages {
	String bandName = "Flarn";
	double ticketPrice = 28.00;
	int ticketsSold = 18;
	Tickets currentShow = new Tickets(bandName, ticketPrice, ticketsSold);
			
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTicketToString() {
		System.out.println("Testing Ticket toString()");
		assertEquals("Tickets [bandName=" + bandName + ", ticketsAvailable=" + currentShow.isTicketsAvailable() + ", ticketPrice="
				+ ticketPrice + ", INITIAL_TICKETS_AVAILABLE=" + currentShow.getINITIAL_TICKETS_AVAILABLE()
				+ ", ticketsCurrentlyAvailable=" + currentShow.getTicketsCurrentlyAvailable() + ", ticketsSold=" + ticketsSold + "]", currentShow.toString());
	}

	@Test
	public void testIsTicketsAvailable() {
		System.out.println("Testing isTicketsAvailable true");
		currentShow.setTicketsCurrentlyAvailable(5);
		assertTrue(currentShow.isTicketsAvailable());
	}
	
	@Test
	public void testIsTicketsAvailable2() {
		System.out.println("Testing isTicketsAvailable false");
		currentShow.setTicketsCurrentlyAvailable(0);
		assertFalse(currentShow.isTicketsAvailable());
	}
}
