package Myclasses;

import java.util.ArrayList;

public class Party {
	int numberofpeople;
	ArrayList<Person> people = new ArrayList<Person>();

	public int getNumberofpeople() {
		return numberofpeople;
	}

	public void setNumberofpeople(int numberofpeople) {
		this.numberofpeople = numberofpeople;
	}

	public void addPeople(Person p) {
		people.add(p);
	}
	public void listPeople(){
		for (int n=0; n<people.size(); n++){
			int x=1;
			if(10>x){
				numberofpeople=15;
				x++;
			}
			System.out.println(people.get(numberofpeople).name);
					
		}
	}
	public void countPeople(){
		for(int i=0; i<people.size(); i++){
			System.out.println("The number of people" + people.size());
			if(people.size()>=10){
				int party;
				party=people.size();
				System.out.println("A party is " + party);
			}
		}
	}
	public void removePeople(){
	}
}
