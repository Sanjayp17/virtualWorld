package Myclasses;

import java.util.ArrayList;

public class Resturant {
	ArrayList<Table> tables=new ArrayList<Table>();
	String name;
	int chaircount;
	public int getChaircount() {
		return chaircount;
	}
	public void setChaircount(int chaircount) {
		this.chaircount = chaircount;
		chaircount=15;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args){
		
	}
	public void assignTable(Party p){
		 for(int i=0; i<tables.size(); i++){
			 Table t=tables.get(i);
			 	if(chaircount>=15){
			 		p.getNumberofpeople();
			 	}
	
		 }
		}
}
