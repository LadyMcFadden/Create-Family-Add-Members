import java.util.Scanner;

public class Person
{
	//Declare Variables
	private String name;
	private int age;

	//Default Constructor
	public Person ()
	{
		name = null;
		age = 0;
	}
	
	public Person (String n, int a)
	{
		name = n;
		age = a;
	}
	
	public String toString ()
	{
		String str = name + " is " + age + " years old";
		return str;
	}
	
	public void incrementAge ()
	{
		age++;
	}
	
	public String getName ()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
}