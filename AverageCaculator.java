// The "AverageCaculator" class.
// Name:Sanjay Persad
// Date:10/22/2014
// Purpose:To calculate a user's average using four marks
import java.awt.*;
import hsa.Console;

public class AverageCaculator
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	//Name
	c.println("What is your name?");
	String name;
	name = c.readString ();
	c.println ();
	c.clear ();
	c.println("Hello, " + name + "!");
	c.println ();
	
	//Entering Marks
	c.println ("What is your first mark?");
	int mark1;
	mark1 = c.readInt ();
	if(mark1 <=0)
	{
	  c.println("Get better grades!");
	  c.getChar ();
	  c.close (); 
	}
	c.println ("What is your second mark?");
	int mark2;
	mark2 = c.readInt ();
	if(mark2 <=0)
	{
	  c.println ("Don't even try!");
	  c.getChar ();
	  c.close ();
	}
	c.println ("What is your third mark?");
	int mark3;
	 mark3 = c.readInt ();
	 if(mark3 <=0)
	{
	  c.println("You can't trick me!");
	  c.getChar ();
	  c.close ();
	} 
	c.println ("What is your fourth mark?");
	int mark4;
	mark4 = c.readInt ();
	if(mark4 <=0)
	{
	  c.println("You must really suck or your lying...");
	  c.getChar ();
	  c.close ();
	} 
	c.clear ();
	
	//Calculation of Average
	int markfinal;
	markfinal = (mark1 + mark2 + mark3 + mark4 );
	
	//Determining the average
	c.println(name + ", your average mark is " + markfinal/4 + "%!");
       
	
	
	
	
       
    } // main method
} // AverageCaculator class
