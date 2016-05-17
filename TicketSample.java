// The "TicketSample" class.
// Name: Sanjay Persad
// Date:10/30/2014
// Purpose: To find out the price of a ticket depending on age
import java.awt.*;
import hsa.Console;

public class TicketSample
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	int age;
	double ticketCost;
	c.println ("Please enter your age");
	age = c.readInt ();
	
	
	if (age <= 14)
	{
	    ticketCost = 4.75;
	    c.println ("You are an child, your ticket will be: $" + ticketCost);
	}
	else if (age <= 17 )
	{
	    ticketCost = 6.49;
	    c.println ("You are an youth, your ticket will be: $" + ticketCost);
	}
	else if (age <= 65 )
	{
	    ticketCost = 11.25;
	    c.println ("You are an adult, your ticket will be: $" + ticketCost);
	}
	else if (age >= 65)
	{
	    ticketCost = 6.99;
	    c.println ("You are an senior, your ticket will be: $" + ticketCost);
	    
	}

    } // main method
} // TicketSample class
