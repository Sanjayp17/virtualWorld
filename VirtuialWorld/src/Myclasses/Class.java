package Myclasses;

import java.util.ArrayList;

import Myclasses.Student;

public class Class {
	// ArrayList<Student> students;
	ArrayList<Student> students = new ArrayList<Student>();
	ArrayList<Attendencesheet> sheets = new ArrayList<Attendencesheet>();
	String classnumber;

	public String getClassname() {
		return classnumber;
	}

	public void setClassname(String classname) {
		this.classnumber = classname;
	}

	public void addStudents(Student mystudent) {
		this.students.add(mystudent);
	}

	public void listStudents() {
		for (int x = 0; x < students.size(); x++) {
			System.out.println(students.get(x).name);
		}
	}

	public void addSheets(Attendencesheet attendence) {
		sheets.add(attendence);
	}

	public void listSheets() {
		for (int i = 0; i < sheets.size(); i++) {
			System.out.println(sheets.get(i).date);
			System.out.println(sheets.get(i).name);
			System.out.println(sheets.get(i).classname);
		}
	}
	public void absentStudent(){
		for(int i=4; i>=students.size(); i++){
			System.out.println(students.get(i) + " has not attended");
			int subtract=students.size()-1;
			System.out.println("Their are " + subtract + " students");
		}
		for(int i=3; i<=students.size(); i++){
			System.out.println(students.get(i) + " has not attended");
			int subtract=students.size()-2;
			System.out.println("Their are " + subtract + " students");
		}
	}
}