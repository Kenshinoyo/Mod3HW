package week2HW3;

public class Employee extends Person {
	
	int badgeNum = userScan.nextInt();
	String department = userScan.next();
	
	// Tracker for total employees
	static int totalE;
	
	Employee(int eID, String fName, String lName, int age, char gender, String address, String division) 
	{
		super(fName, lName, age, gender, address);
		
		badgeNum=eID;
		department=division;
		totalE++;
	}
	
	// "Auxiliary" constructors to compensate for any employee obj created with "missing information"
	Employee(int eID, String fName, String lName, int age, char gender, String address) 
	{
		super(fName, lName, age, gender, address);
		
		badgeNum=eID;
		totalE++;
	}
	
	Employee(int eID, String fName, String lName, int age, char gender) 
	{
		super(fName, lName, age, gender);
		
		badgeNum=eID;
		totalE++;
	}
	
	Employee(int eID, String fName, String lName, int age) 
	{
		super(fName, lName, age);
		
		badgeNum=eID;
		totalE++;
	}
	
	Employee(int eID, String fName, String lName, String address) 
	{
		super(fName, lName, address);
		
		badgeNum=eID;
		totalE++;
	}
	
	Employee(int eID, String fName, String lName) 
	{
		super(fName, lName);
		
		badgeNum=eID;
		totalE++;
	}
	
	Employee(int eID, String fName, int age) 
	{
		super(fName, age);
		
		badgeNum=eID;
		totalE++;
	}
	
	Employee(int eID, String fName, char gender) 
	{
		super(fName, gender);
		
		badgeNum=eID;
		totalE++;
	}
	
	Employee(int eID, String lName, int age) 
	{
		super(lName, age);
		
		badgeNum=eID;
		totalE++;
	}

}
