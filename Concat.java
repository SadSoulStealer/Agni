// The "Concat" class.
import java.awt.*;
import hsa.Console;

public class Concat
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	//Print on the same line
	c.print ("abc" + "def");
	//Print a separator line
	c.println();
	//On two lines
	c.print ("abc");
	c.print ("def");
	

    } // main method
} // Concat class
