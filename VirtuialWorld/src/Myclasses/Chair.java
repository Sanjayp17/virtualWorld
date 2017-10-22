 package Myclasses;

import java.util.ArrayList;

public class Chair {
	ArrayList<Party> parties=new ArrayList<Party>();
	ArrayList<Chair> chairs=new ArrayList<Chair>(); 
	int ID;
	public ArrayList<Party> getParties() {
		return parties;
	}
	public void setParties(ArrayList<Party> parties) {
		this.parties = parties;
	}
	public ArrayList<Chair> getChairs() {
		return chairs;
	}
	public void setChairs(ArrayList<Chair> chairs) {
		this.chairs = chairs;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public void addParty(Party myparty) {
		parties.add(myparty);
	}
	public void listParty(){
		for (int n=0; n<parties.size(); n++){
			System.out.println(parties.get(n).numberofpeople);		
		}
	}
	
	public void assignPerson(Person p){
		for(int x=0; x<2; x++){
			System.out.println(parties.get(x));
		}
		for(int x=0; x<15; x++){
			System.out.println(chairs.get(x));
		}
	}
}