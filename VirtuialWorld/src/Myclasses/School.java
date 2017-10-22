package Myclasses;
import Myclasses.Class;
import Myclasses.Student;

import java.util.ArrayList;

public class School {
	ArrayList<Class> classes=new  ArrayList<Class>();
	static String schoolname;
	
	public static String getSchoolname() {
		return schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	
	public void addClasses(Class myclass){
		this.classes.add(myclass);
	}
	
	public void listClasses(){
		for(int i=0; i<classes.size(); i++){
			System.out.println(classes.get(i).classnumber);
		}
	}

	public static void main(String[] args) {
		
		
	School school=new School();
	school.setSchoolname("Indian Hill");
	for (int n = 0; n < 1; n++) {
		System.out.println(getSchoolname());
	}
	Class c1=new Class();
	c1.setClassname("Mrs.DCB");
	
	
	Class c2=new Class();
	c2.setClassname("Mrs.Butoy");
	
	Attendencesheet a1=new Attendencesheet();
	a1.setDate("3/23/15");
	a1.setName("Attendencesheet");
	a1.setClassname("Mrs.DCB");
	
	Attendencesheet a2=new Attendencesheet();
	a2.setDate("3/27/15");
	a2.setName("Attendencesheet 2");
	a2.setClassname("Mrs.Butoy");
		
	Student s1=new Student();
	s1.setName("White Milk");
	
	Student s2=new Student();
	s2.setName("Brownie");
	
	Student s3=new Student();
	s3.setName("Tan");
	
	school.addClasses(c1);
	school.addClasses(c2);
	school.listClasses();
	Class myclass=new Class();
	myclass.addSheets(a1);
	myclass.addSheets(a2);
	myclass.addStudents(s1);
	myclass.addStudents(s3);
	myclass.addStudents(s2);
	myclass.listStudents();
	myclass.listSheets();
	

		}
	 

}
