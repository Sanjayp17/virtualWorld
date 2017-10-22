package Myclasses;

import java.util.ArrayList;

public class Resturant2 {
	ArrayList<Table2> tablelist=new ArrayList<Table2>();
	
	public int findTable(Party p){
		int cp=p.getPersoncount();
		for(int i=0; i<tablelist.size(); i++){
		Table2 z=tablelist,get(i);
		int cc= z.getChaircount;
		if(cc>=cp){
			z.assignParty(p);
		}
		}
		return cp;
	}
}
