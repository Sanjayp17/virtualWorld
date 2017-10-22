package Myclasses;
import  java.util.ArrayList;

import	Myclasses.Passenger;
import  Myclasses.Seat;

public class Airplane {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	ArrayList<Passenger> passengers;{
		passengers=new ArrayList<Passenger>();
	}
	ArrayList<Seat> seats;{
		seats=new ArrayList<Seat>();
		
	}
	

	public void addPassengers(Passenger p){
		this.passengers.add(p);
	}
	
	public void removePassenger(){
	}
	public void removeSeats(){
	}

	public void addSeats(Seat s){
		this.seats.add(s);
	}
	public void listPassengers(){
		for(int p=0; p<passengers.size(); p++){
			Passenger myref=passengers.get(p);
			String myname=myref.getName();
			System.out.println(myref);
			System.out.println(myname);
		}
	}

	public void listSeats(){
		for(int s=0; s<seats.size(); s++){
			Seat seatr=seats.get(s);
			String mysn=seatr.getSeatnumber();
			System.out.println(seatr);
			System.out.println(mysn);
		}
	}
	public void setSeatnumber(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
	}

	 

	 
	

