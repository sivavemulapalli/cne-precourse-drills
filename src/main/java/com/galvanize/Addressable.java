package com.galvanize;

import java.util.*;

public interface Addressable{
	public List<Address> getAddresses();
	public void addAddress(Address addr);
}