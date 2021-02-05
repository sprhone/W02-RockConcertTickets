package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Purchaser;

/**
 * Sterling Rhone - sprhone
 * 202102 CIS175 26740
 * Feb 4, 2021
 */
public class TestPurchaserInput {
	String purchaserName = "Pinky";
	int numberOfTickets = 0;
	Purchaser newPurchaser = new Purchaser(purchaserName);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPurchaserInfo() {
		System.out.println("Testing purchaserInfo()");
		assertEquals("Name: " + purchaserName + "\nNumber of Tickets: " + 
				numberOfTickets, newPurchaser.purchaserInfo());
	}
	
	@Test
	public void testSettingAndDisplayingPurchaserInfo() {
		System.out.println("Testing Setting and Displaying purchaserInfo()");
		newPurchaser.setPurchaserName("JimBob");
		newPurchaser.setNumberOfTickets(27);
		assertEquals("Name: JimBob\nNumber of Tickets: 27", newPurchaser.purchaserInfo());;
		
	}

}
