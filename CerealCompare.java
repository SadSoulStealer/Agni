// The "CerealCompare" class.
// Name: Sanjay Persad
// Date: 10/30/2014
// Purpose: To obtain the grams and prices of two cereals. Then, output each cereal's price per gram
import java.awt.*;
import hsa.Console;

public class CerealCompare
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	//Declaring Variables
	double priceA;
	double priceB;
	int gramA;
	int gramB;
	
	//Getting the price of box A
	c.println("What is the price of the first cereal box?");
	priceA = c.readDouble ();
	c.println("Press Enter to continue...");
	c.getChar ();
	c.clear ();
	if (priceA <= 0)
	{ 
	  c.println("Invalid Price");
	  c.println("Come back when you are serious");
	  c.getChar ();
	  c.close ();
	}
	
	//Getting the grams of box A
	c.println("What is the weight of the first cereal box (in grams)?");
	gramA = c.readInt ();
	c.println("Press Enter to continue...");
	c.getChar ();
	c.clear ();
	if (gramA <= 0)
	{ 
	  c.println("Invalid Price");
	  c.println("Come back when you are serious");
	  c.getChar ();
	  c.close ();
	}
	
	//Calculation of box A
	double unitPriceA = priceA / gramA;
      
	 //Getting the price of box B
	c.println("What is the price of the second cereal box?");
	priceB = c.readDouble ();
	c.println("Press Enter to continue...");
	c.getChar ();
	c.clear ();
	if (priceB <= 0)
	{ 
	  c.println("Invalid Price");
	  c.println("Come back when you are serious");
	  c.getChar ();
	  c.close ();
	}
	
	//Getting the grams of box B
	c.println("What is the weight of the second cereal box (in grams)?");
	gramB = c.readInt ();
	c.println("Press Enter to continue...");
	c.getChar ();
	c.clear ();
	if (gramB <= 0)
	{ 
	  c.println("Invalid Price");
	  c.println("Come back when you are serious");
	  c.getChar ();
	  c.close ();
	}
	
	 //Calculation of box B
	double unitPriceB = priceB / gramB;
	if (unitPriceA < unitPriceB)
	{
	  c.println("The first box of cereal is " + (unitPriceB - unitPriceA) + " cheaper then the second box (" + unitPriceA + ")");
	}
	
	if (unitPriceB < unitPriceA)
	{
	  c.println("The second box of cereal is " + (unitPriceA - unitPriceB) + " cheaper then the first box (" + unitPriceB + ")");
	}
	
	if  (unitPriceA == unitPriceB)
	{
	  c.println("There is no difference in price at all!");
	}

    } // main method
} // CerealCompare class
