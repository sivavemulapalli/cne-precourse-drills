package com.galvanize;
import java.util.*;

public class Address {
	private String street;
	private String city;
	private String state;
	private String zip;

	//Constructor
	public Address(String addr_street, String addr_city, String addr_state, String addr_zip) {
		street = addr_street;
		city = addr_city;
		state = addr_state;
		zip = addr_zip;
	}

	//Setter Methods
	public void setStreet(String streetName) {
		street = streetName;
	}
	public void setCity(String cityName) {
		city = cityName;
	}
	public void setState(String stateName) {
		state = stateName;
	}
	public void setZip(String zipCode) {
		zip = zipCode;
	}

	//Getter Methods
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zip;
	}

	@Override 
	public String toString() {
		return street + ", " + city + ", " + state + " " + zip;
	}

}