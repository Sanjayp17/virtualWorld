package Myclasses;
import java.util.ArrayList;

import Myclasses.Airplane;
import Myclasses.Passenger;
import Myclasses.Seat;
public class Airport {
	int i=0;
	String name;
	ArrayList<Airport> airport;
	public String getName() {
		return name;
	}
	public void setName(String string) {
		this.name = string;
	}

	ArrayList<Airplane> airplanes;{
		airplanes=new ArrayList<Airplane>();
	}
public void listAirport(){
	for(i=0; i<airport.size();i++){
		Airport aref=airport.get(i);
		String aName=aref.getName();
		System.out.println(aName);
		System.out.println(aref);
	}
}

	public void addAirplane(Airplane air){
	this.airplanes.add(air);

	
	}
	public void removeAirplane(){
	}
	
	public void listAirplanes(){
		for(i=0; i<airplanes.size();i++){
			Airplane aref=airplanes.get(i);
			String aName=aref.getName();
			System.out.println(aName);
			System.out.println(aref);
		}
	}
	
	public static void main(String[] args){
		Airport Newark=new Airport();
		Newark.setName("Newark Airport");
		
		
		Airplane A1=new Airplane();
		A1.setName("Emirates");
		Airplane Air = A1;
		Newark.addAirplane(Air);
		
		Passenger P1=new Passenger();
		P1.setName("Sejal");
		Passenger A=P1;
		Passenger P2=new Passenger();
		P2.setName("Sahil");
		Passenger I=P2;
		Passenger P3=new Passenger();
		P3.setName("Vastal");
		Passenger R=P3;
		Passenger P4=new Passenger();
		P4.setName("Ansh");				
		Passenger P=P3;
		A1.addPassengers(A);
		A1.addPassengers(I);
		A1.addPassengers(R);
		A1.addPassengers(P);
		
		Seat S1=new Seat();
		S1.setSeatnumber("12A");
		Seat s=S1;
		
		Seat S2=new Seat();
		S2.setSeatnumber("24D");
		Seat e=S2;
		
		Seat S3=new Seat();
		S3.setSeatnumber("19C");
		Seat a=S3;
		
		Seat S4=new Seat();
		S4.setSeatnumber("32B");
		Seat t=S4;
		
		
		
		A1.addSeats(s);
		A1.addSeats(e);
		A1.addSeats(a);
		A1.addSeats(t);
		
		Airport Aport=new Airport();
		Aport.listAirport();
		Aport.listAirplanes();
		
		/* march 11 commenting out and will try again
		Airport A= new Airport();
		Airplane airp=new Airplane();
		airp.setName("Ansh");
		A.addAirplane(airp);
		A.listAirplanes();
		
		
		
		airp.addPassengers("3 rpi students");
		airp.setName("Vastal, Ansh, Sahil");
		airp.listPassengers();
		airp.addSeats("4 seat numbers");
		airp.setSeatnumber("3A, 23F, 33C, 17D");
		airp.listSeats();
		*/
	}
	
/*Use main method in the main(biggest, king) class/object
	(ex.Airport should have main method)*/
	
}