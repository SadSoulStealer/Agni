// The "RelationalOperationsDemo" class.
// Name:Sanjay Persad
// Date:10/28/2014
// Purpose:To learn about relational and logical operators
import java.awt.*;
import hsa.Console;

public class RelationalOperationsDemo
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	int m=6; int n=2; boolean flag=true;
	
	//greater than
	c.println("The value of m is"+m);
	c.println("The value of n is"+n);
	c.println("The answer to \"Is m is greater then n is " + (m > n));
	
	//greater than or equal to 
	c.println("The value of m is"+m);
	c.println("The value of n is"+n);
	c.println("The answer to \"Is m is greater then n is " + (m >= n));
       
	//less than
	c.println("The value of m is"+m);
	c.println("The value of n is"+n);
	c.println("The answer to \"Is m is greater then n is " + (m < n));
	
	//less than or equal to
	c.println("The value of m is"+m);
	c.println("The value of n is"+n);
	c.println("The answer to \"Is m is greater then n is " + (m >= n));
	
	s = new Console ();
	
	
       
    } // main method
} // RelationalOperationsDemo class
