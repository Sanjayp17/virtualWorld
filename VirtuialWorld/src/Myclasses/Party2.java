package Myclasses;

import java.util.ArrayList;

public class Party2 {
	ArrayList<Person2> people=new ArrayList<Person2>();
	public int getPersonCount(){
		return people.size();
	}
	public void addPerson(Person2 p){
		people.add(p);
	}
}
