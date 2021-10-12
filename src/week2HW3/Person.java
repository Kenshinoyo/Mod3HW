package week2HW3;

public class Person {
	
	// - Class needs to have a parameterized constructor
	String fName;
	String lName;
	int age;
	char gender;
	String address;
	
	static int totalP;
	
	public Person()
	{
		totalP++;
	}
	
	public Person(String fName, String lName, int age, char gender, String address)
	{
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		totalP++;
	}
	
	public Person(String fName, String lName, int age, char gender)
	{
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.gender = gender;
		totalP++;
	}
	
	public Person(String fName, String lName, int age)
	{
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		totalP++;
	}
	
	public Person(String fName, String lName)
	{
		this.fName = fName;
		this.lName = lName;
		totalP++;
	}
	
	public Person(String fName, int age)
	{
		this.fName = fName;
		this.age = age;
		totalP++;
	}
	
	public void display()
	{
		System.out.println("Name: " + this.lName  + ", " + this.fName);
		System.out.println("Age: " + this.age);
		System.out.println("Gender: " + this.gender);
	}
	
	public void display (Person obj)
	{
		System.out.println("Parameterized Display");
		System.out.println("---------------------------");
		System.out.println("Name: " + obj.fName);
	}
	
	

}
