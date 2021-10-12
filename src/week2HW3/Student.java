package week2HW3;
import java.util.Scanner;

public class Student extends Person {
	
	int studID;
	String studentMajor;
	int studentCredits;
	
	// Tracker for total students
	static int totalStu;
	
	Student(int sID, String fName, String lName, int age, char gender, String major, int Credits) 
	{
		super(fName, lName, age, gender);
		
		studID=sID;
		studentMajor=major;
		studentCredits=Credits;
		totalStu++;
		
	}
	
	Student(int sID, String fName, String lName, int age, char gender, String major) 
	{
		super(fName, lName, age, gender);
		
		studID=sID;
		studentMajor=major;
		totalStu++;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
