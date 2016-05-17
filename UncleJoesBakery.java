// The "UncleJoesBakery" class.
//Name: Sanjay Persad
//Date: October. 8th. 2014
//Purpose: Practice with Concatenation
import java.awt.*;
import hsa.Console;

public class UncleJoesBakery
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	c.println(" " + "Uncle" + " Joe's" + " " + "Bakery");
	c.println(" ******************");
	c.println();
	c.println();
	c.println(" Customer Number:  45");
	c.println();
	c.println(" Date:             October 10, 2006");
	c.println();
	c.println("QTY          ITEM               PRICE");
	c.println();
	c.println("1"+"            Cannoli               $3.75");
	c.println("2"+"            Sandwich              $6.85");
	c.println("             TOTAL"+"                 $10.60");
    } // main method
} // UncleJoesBakery class
