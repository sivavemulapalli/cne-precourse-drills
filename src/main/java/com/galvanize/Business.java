package com.galvanize;

import java.util.*;

public class Business implements Addressable {
	private final String name;
	private final ArrayList<Address> addresses;


	//Constructor
	public Business(String inputName) {
		name = inputName;
		addresses = new ArrayList<Address>();

	}


	public String getName(){
		return name;
	}


	//implement interface method
	@Override
	public void addAddress(Address addr) {
		addresses.add(addr);
	} 



	//implement interface method
	@Override
	public List<Address> getAddresses() {
		return addresses;
	}
}