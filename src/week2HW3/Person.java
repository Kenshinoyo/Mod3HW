package week2HW3;

public class Person {
	
	// - Class needs to have a parameterized constructor
	String fName;
	String lName;
	int age;
	char gender;
	String address;
	
	static int total;
	
	public Person()
	{
		total++;
	}
	
	public Person(String fName, String lName, int age, char gender, String address)
	{
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		total++;
	}
	
	public Person(String fName, String lName, int age, char gender)
	{
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.gender = gender;
		total++;
	}
	
	public Person(String fName, String lName, int age)
	{
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}
	
	public
	
	public Person(String fName, int age)
	{
		this.fName = fName;
		this.age = age;
	}
	
	

}
