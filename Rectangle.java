// The "Rectangle" class.
import java.awt.*;
import hsa.Console;

public class Rectangle
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console (); 
       c.fillOval (210, 210, 250, 250);
       c.fillOval (128, 128, 200, 200);
       c.fillOval (334, 128, 200, 200);
       c.setColor (new Color (241, 232, 188)); 
       c.fillOval (334, 128, 200, 200);
    } // main method
} // Rectangle class
