// The "AverageFourMarks" class.
/* Header Comments here*/
import java.awt.*;
import hsa.Console;

public class AverageFourMarks
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	/* Introduce the program here*/

	int numMarks = 4;
	int sum = 0;

	//Mark1
	c.println ("Please enter your first mark");
	int mark1 = c.readInt ();
	if (mark1 < 0)
	{
	    c.println ("Invalid entry");
	    numMarks = numMarks - 1;

	}

	else
	{
	    sum = sum + mark1;
	}

	//Mark2

	c.println ("Please enter your second mark");
	int mark2 = c.readInt ();

	if (mark2 < 0)
	{
	    c.println ("Invalid entry");
	    numMarks = numMarks - 1;

	}
	else
	{
	    sum = sum + mark2;
	}

	//Mark3

	c.println ("Please enter your third mark");
	int mark3 = c.readInt ();

	if (mark3 < 0)
	{
	    c.println ("Invalid entry");
	    numMarks = numMarks - 1;

	}
	else
	{
	    sum = sum + mark3;
	}

	//Mark4
	c.println ("Please enter your fourth mark");
	int mark4 = c.readInt ();

	if (mark4 < 0)
	{
	    c.println ("Invalid entry");
	    numMarks = numMarks - 1;

	}
	else
	{
	    sum = sum + mark4;
	}
	
	//Calculating Average and showing it

	if (numMarks == 0)
	{
	    c.println ("You had no valid marks");
	}
	else
	{
	    int average = sum / numMarks;
	    c.println ("\n\nThe average of your " + numMarks + " valid marks is " + average);
	}

    } // main method
} // AverageFourMarks class
