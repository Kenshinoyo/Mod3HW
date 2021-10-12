package week2HW3;

public class Employee extends Person {
	
	int eID;
	String department;
	
	static int totalE;
	
	Employee(int id, String fName, String lName, int age, char gender, String address, String division) 
	{
		super(fName, lName, age, gender, address);
		
		eID=id;
		department=division;
		totalE++;
	}
	
	Employee(int id, String fName, String lName, int age, char gender, String address) 
	{
		super(fName, lName, age, gender, address);
		
		eID=id;
		totalE++;
	}
	
	Employee(int id, String fName, String lName, int age, char gender) 
	{
		super(fName, lName, age, gender);
		
		eID=id;
		totalE++;
	}
	
	Employee(int id, String fName, String lName, int age) 
	{
		super(fName, lName, age);
		
		eID=id;
		totalE++;
	}
	
	Employee(int id, String fName, String lName, String address) 
	{
		super(fName, lName, address);
		
		eID=id;
		totalE++;
	}
	
	Employee(int id, String fName, String lName) 
	{
		super(fName, lName);
		
		eID=id;
		totalE++;
	}
	
	Employee(int id, String fName, int age) 
	{
		super(fName, age);
		
		eID=id;
		totalE++;
	}
	
	Employee(int id, String fName, char gender) 
	{
		super(fName, gender);
		
		eID=id;
		totalE++;
	}
	
	Employee(int id, String lName, int age) 
	{
		super(lName, age);
		
		eID=id;
		totalE++;
	}

}
