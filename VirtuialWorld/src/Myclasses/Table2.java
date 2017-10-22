package Myclasses;

import java.util.ArrayList;

public class Table2 {
	ArrayList<Chair2> chairlist=new ArrayList<Chair2>();
	Party2 Py;
	int TID;
	public int chairCount(){
		return chairlist.size();
	}
	public void addChair(Chair2 c){
		chairlist.add(c);
		}
	public void assignParty(Party p1){
		Py=p1;
	}
}
