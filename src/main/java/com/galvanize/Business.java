package com.galvanize;

import java.util.*;

public class Business implements Addressable {
	private final String name;
	private final ArrayList<Address> addresses;

	public Business(String inputName) {
		name = inputName;
		addresses = new ArrayList<Address>();

	}


	public String getName(){
		return name;
	}

	@Override
	public void addAddress(Address addr) {
		addresses.add(addr);
	} 


	@Override
	public List<Address> getAddresses() {
		return addresses;
	}
}