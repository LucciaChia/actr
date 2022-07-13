package com.krausova.example;

import com.zakgof.actr.IActorRef;

public class Canteen {
	
	private String name;
	private int capacity;
	private IActorRef<Cook> cookActor;
	
	public Canteen(String name, int capacity, IActorRef<Cook> cookActor) {
		super();
		this.name = name;
		this.capacity = capacity;
		this.cookActor = cookActor;
	}

	public boolean iWillBeServed() {
		return capacity-1 >= 0;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
