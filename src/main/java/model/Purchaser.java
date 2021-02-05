package model;

/**
 * Sterling Rhone - sprhone
 * 202102 CIS175 26740
 * Feb 4, 2021
 */
public class Purchaser {

	private String purchaserName;
	private int numberOfTickets = 0;
		
	public Purchaser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Purchaser(String purchaserName) {
		super();
		this.purchaserName = purchaserName;
	}

	public String getPurchaserName() {
		return purchaserName;
	}

	public void setPurchaserName(String purchaserName) {
		this.purchaserName = purchaserName;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}
	
	public String purchaserInfo()
	{
		return "Name: " + getPurchaserName() + 
				"\nNumber of Tickets: " + getNumberOfTickets();
	}
}
