package be.bt.domain;

public class Address {

	private String number;
	private String street;
	private String postCode;
	private String town;
	private Address address;
	
	// Constructors
	
	public Address(String postCode, String town) {
		super();
		this.postCode = postCode;
		this.town = town;
	}
	public Address(String number, String street, String postCode, String town) {
		super();
		this.number = number;
		this.street = street;
		this.postCode = postCode;
		this.town = town;
	}
	
	//Setters and Getters
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	//To String
	
	@Override
	public String toString() {
		return "Address [number=" + number + ", street=" + street + ", postCode=" + postCode + ", town=" + town
				+ ", address=" + address + "]";
	}
	
	
}
