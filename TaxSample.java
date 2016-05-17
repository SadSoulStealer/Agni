// The "TaxSample" class.
// Name: Sanjay Persad
// Date:10/30/2014
// Purpose:To find the tax on a purchase and output the total price
import java.awt.*;
import hsa.Console;

public class TaxSample
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	double purchase, discount, total;
	c.println ("What is the total of your purchase before taxes?");
	purchase = c.readDouble ();
	if (purchase > 200.00)
	{
	    discount = purchase * .25;
	    purchase = purchase - discount;
	}
	total = purchase * 1.14;
	c.print ("Your total with tax will be:" + total); 

    } // main method
} // TaxSample class
