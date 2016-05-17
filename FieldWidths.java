// The "FieldWidths" class.
import java.awt.*;
import hsa.Console;

public class FieldWidths
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	//Read the total price from the keyboard and
	//1. Price before tax
	//2. Tax
	c.println("What is the total price of that product?");
	double totalPrice = c.readDouble ();
	
	double totaltax = price / tax;
	byte price = 20;
	byte tax = .3;
	c.println(totaltax);
       
    } // main method
} // FieldWidths class
