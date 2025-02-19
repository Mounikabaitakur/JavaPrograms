package in.bluespire.beans;


public class Address {
	
	private String houseNo;
	private String city;
	private int pincode;
	
	
	public Address(String houseNo, String city, int pincode) {
		this.houseNo = houseNo;
		this.city = city;
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "#" + houseNo + " - " + city + ", " + pincode ;
	}
	
	
	
	

}
