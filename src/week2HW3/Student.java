package week2HW3;
import java.util.Scanner;

public class Student extends Person {
	
	int studID;
	String studentMajor;
	int studentCredits;
	
	Student(int id, String fName, String lName, int age, char gender, String major, int Credits) 
	{
		super(fName, lName, age, gender);
		
		studID=id;
		studentMajor=major;
		studentCredits=Credits;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
