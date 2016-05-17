// The "VideoGame" class.
// Name: Sanjay Persad
// Date: 10/31/2014
// Purpose: To get the # of points and convert to free games
import java.awt.*;
import hsa.Console;

public class VideoGame
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	//Get user's name
	c.println("What is your name?");
	String name = c.readString ();
	c.clear ();
	
	//Greet the user
	c.println("Why, Hello " + name + "!");
	c.clear ();
	
	//Gather amount of points from user and determine amount of free games
	c.println("How many point did you earn today, " + name + " ?");
	int pointTotal = c.readInt ();
	c.clear ();
	if (pointTotal <= 0)
	{
	  c.println("Not a valid mark");
	  c.getChar ();
	  c.close ();
	}
	else if (pointTotal > 25000)
	{
	  c.println("You have recieved 5 free games");
	}
	else if (pointTotal <= 24999 && pointTotal >= 20000)
	{
	  c.println("You have recieved 3 free games");
	}
	else if (pointTotal <= 19999 && pointTotal >= 10000)
	{
	  c.println("You have recieved 1 free game");
	}
	else if (pointTotal <= 9999)
	{
	  c.println("Better luck next time!");
	}
	
    } // main method
} // VideoGame class
