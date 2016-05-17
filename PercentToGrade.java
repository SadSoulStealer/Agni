// The "PercentToGrade" class.
// Name:Sanjay Persad
// Date:11/3/2014
// Purpose:To convert percetages to letter grades
import java.awt.*;
import hsa.Console;

public class PercentToGrade
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	//Find out user's name and tell them about the program
	c.println("What is your name?");
	String name = c.readString ();
	c.clear ();
	c.println("Well," + name + ",this program is used in order to show what your percentage would be as a letter. Shall we begin?");
	c.getChar ();
	c.clear ();
	
	//Input of grades and output of letter grades
	c.println("What percentage did you get out of 100, " + name + "?");
	int percent = c.readInt ();
	c.println("Press Enter to continue...");
	c.getChar ();
	c.clear ();
	if (percent <= 0)
	{
	  c.println("Not a valid mark");
	  c.getChar ();
	  c.close ();
	}
	if (percent > 100)
	{
	  c.println("We are looking  in to this error for you");
	  c.getChar ();
	  c.close ();
	}
	else if (percent < 49)
	{
	  c.println("Seek IMMEDIATE attention as you are getting a F");
	}
	else if(percent >= 50 && percent <= 59)
	{
	  c.println("Seek extra help in order to bring yor grade up from the D that it is");
	}
	else if(percent >= 60 && percent <= 69)
	{
	  c.println("With a little more focuse on studying, you can bring you mark up from this C");
	}
	else if(percent >= 70 && percent <= 79)
	{
	  c.println("You have a B! Keep up the good work!");
	}
	else if(percent >= 80 && percent <= 100)
	{
	  c.println("Your doing awesome! Go treat youself, you A student!");
	}
       
	
    } // main method
} // PercentToGrade class
