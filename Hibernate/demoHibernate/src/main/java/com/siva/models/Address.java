package com.siva.models;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String streetAddress;
	private long pincode;
	public Address() {};
	public Address(String streetAddress, long pincode) {
		this.streetAddress = streetAddress;
		this.pincode = pincode;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	
	
	
}
