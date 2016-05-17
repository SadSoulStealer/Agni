// The "Salesperson" class.
// Name: Sanjay Persad
// Date: 11/4/2014
// Purpose: Takes a person's base salary and finds out how much they own for the year, using their commission
import java.awt.*;
import hsa.Console;

public class Salesperson
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	//Get user's name
	c.println("Hi, what is your name?");
	String name = c.readString ();
	c.clear ();
      
	//Tell user about purpose
	c.println("Well, " + name + " , this program is to help you figure out how much you would earn in a year. Are you ready?");
	c.println("Press Enter to continue...");
	c.getChar ();
	c.clear ();
	
	//Get base salary
	c.println("What is your base salary, " + name + " ?");
	int salary = c.readInt ();
	c.clear ();
	if (salary < 29999)
	{
	  c.println("Our company would not pay you so low. Please call your supervisor");
	  c.getChar ();
	  c.close ();
	}
	
	//Calculate the commision
	double comis = (salary * 0.10);
	if (salary > 50000)
	{
	  comis = (salary * 0.12);
	}
	
	//Display output
	double totalSal = (salary + comis);
	c.println("Your total salary at our company is " + totalSal);
	c.getChar ();
	c.println("Thank you for choosing Aperture");
	c.getChar ();
	c.close ();

	
    } // main method
} // Salesperson class
