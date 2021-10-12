package week2HW3;

public class Employee extends Person {
	
	int eID;
	String department;
	
	Employee(int id, String fName, String lName, int age, char gender, String address, String division) 
	{
		super(fName, lName, age, gender, address);
		
		eID=id;
		department=division;	
	}

}
