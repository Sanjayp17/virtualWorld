package Myclasses;

import Myclasses.Hotelroom;
import Myclasses.Customer;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;

public class Hotel {
	String hotelrooms;
	static ArrayList<Hotelroom> rooms = new ArrayList<Hotelroom>();
	static ArrayList<Customer> customers = new ArrayList<Customer>();

	public void addRooms(Hotelroom myroom) {
		rooms.add(myroom);
	}

	public void listRooms() {

		for (int n = 0; n < rooms.size(); n++) {
			System.out.println(rooms.get(n).room_number);
		}
	}

	public void listRoomAndCustomers() {

		for (int n = 0; n < rooms.size(); n++) {
			System.out.println(rooms.get(n).room_number);
			System.out.println(rooms.get(n).customer.name);
		}
	}
	public void addCustomers(Customer custom) {
		customers.add(custom);
	}

	public void listCustomers() {
		for (int x = 0; x < customers.size(); x++) {
			System.out.println(customers.get(x).name);
		}
	}

	static String hotel;

	public static String getHotel() {
		return hotel;
	}

	public static void setHotel(String hotel) {
		Hotel.hotel = hotel;
	}

	public static <room> void main(String[] args) {
		Hotel ht = new Hotel();
		ht.setHotel("Holiday Inn");
		for (int n = 0; n < 1; n++) {
			System.out.println(getHotel());
		}
		
		
				

		Hotelroom r1 = new Hotelroom();
		r1.setRoom_number("213");

		Customer c1 = new Customer();
		c1.setCustomer("Ansh");
		
		r1.customer = c1;
		
		Hotelroom r2 = new Hotelroom();
		r2.setRoom_number("214");
		Customer c2 = new Customer();
		c2.setCustomer("Vastal");
		
		r2.customer = c2;
		
		Hotelroom r3=new Hotelroom();
		r3.setRoom_number("215");
		Customer c3 = new Customer();
		c3.setCustomer("Sahil");
		
		r3.customer = c3;
		
		ht.addRooms(r1);
		ht.addRooms(r2);
		ht.addRooms(r3);
		System.out.println("=======Printing Room");
		ht.listRooms();
		System.out.println("=======Printing Room and Customers");
		ht.listRoomAndCustomers(); 
		System.out.println("Ansh goes to room 213");
		System.out.println("Vastal goes to room 214");
		System.out.println("Sahil goes to room 215");
		int n1=0;
		
		if (n1<customers.size()){
			System.out.println("The nubmer of rooms are avalible are " + n1);
		}
		else{
			System.out.println("Number of rooms avalible are " + customers.size());
		}
		
	}

}
//Rooms, hotel, customer. How hotel and rooms are connected, and rooms and customer are connected
// Think of how the classes are connected
//Think of attributes
//Use drawings of objects     