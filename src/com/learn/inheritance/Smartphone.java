package com.learn.inheritance;

public class Smartphone extends Mobile{

	 private String phoneType;

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public void feature() {
		System.out.println("This is a touch phone");
	}
}
