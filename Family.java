import java.util.Scanner;

public class Family
{
	//Declare varibles
	Family [] myFamily;
	int totalFamily = 0;
	int totalAge;
	
	public Family ()
	{
		myFamily = new Person[10];
		for (int i=0; i < myFamily.length; i++)
		{	
			myFamily[i] =  null;
		}
	}
	
	public boolean addPerson (String n, int age)
		{
			if (totalFamily > myFamily.length)
			{
			return false;	
			}
			else {
			   onePerson = new Person(n,age);
			   myFamily[totalFamily] = onePerson;
			   totalFamily++;
			  return true; }
		}
	public void display ()
	{
		System.out.print("There are " + totalFamily " people in the family, with a total age of " + totalAge);
		
		for (int i=0; i < totalFamily; i++)
		{	
			System.out.println(myFamily[i]);
		}
	}
	
	public void birthday (String n)
	{
		for (int i = 0; i < totalFamily; i++)
		{
			if(myFamily[i].getName.equals(n)){
				myFamily[i].incrementAge();
			}
		}

	)
	
}
	