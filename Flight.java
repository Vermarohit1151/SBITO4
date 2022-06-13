package com.sbi;

@DevelopedBy(name="vijay",version=1.3)
public  class Flight { 

	
	public  int flightNumber;
	public String flightName;
	public  String source;
	public  String destination;
	

	public Flight(int flightNumber, String flightName) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
	}
	
	
	public Flight(int flightNumber, String flightName, String source) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.source = source;
	}


	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Flight(int flightNumber, String flightName, String source, String destination) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
	}


	public Flight(int flightNumber) {
		super();
		this.flightNumber = flightNumber;
	}


	
	public void fly() { 
		System.out.println("Flight is flying....");
	}
	public void landing() {
		System.out.println("Flight is landing....");
	}
}
