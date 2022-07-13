package com.krausova.example;

public class Cook {
	
	private String name;
	private boolean atWrok;
	
	public void serveCustomer() {
		if (atWrok) {
			System.out.println("Cook " + name + " is serving the customer...");
		} else {
			System.out.println("Cook is not available!");
		}
	}
}
