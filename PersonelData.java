// The "PersonelData" class.
// Name: Sanjay Persad
// Date: 10/23/2014
// Purpose: To have a user input 6 personal things and output them all together
import java.awt.*;
import hsa.Console;

public class PersonelData
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	//Intro.
	c.println("Hey, We would like to know all about you? What do you say? Press any key to continue!");
	char yes = c.readChar ();
	c.clear ();
	
	//Question 1
	c.println("What is your name, mysterious wanderer?");
	String name = c.readString ();
	c.println("Onward," + name + " ,to the next question!");
	c.clear ();
	
	//Question 2
	c.println("What is your age," + name + "?");
	int age = c.readInt ();
	c.println("Keep going," + name);
	c.clear ();
	
	//Question 3
	c.println("What was the first cartoon you ever watched? Mine was OVER 9000!");
	String cartoon = c.readString ();
	c.println("You got this," + name);
	c.clear ();
	
	//Question 4
	c.println("Charmander, Bulbasaur, or Squirtle?");
	String pokemon = c.readString ();
	c.println("The next question!");
	c.clear ();
	
	//Question 5
	c.println("What is your favorite genre of music?");
	String music = c.readString ();
	c.println("Your getting used to this, aren't you");
	c.clear ();
	
	//Question 6
	c.println("What is your favorite Star Wars movie?");
	String starwars = c.readString ();
	c.println("Let's get your answer together," + name + "!");
	c.clear ();
	
	//Outputing the answer
	c.println("So, your name is " + name + " and you are " + age + " years old. The first cartoon you ever watched was " + cartoon + " and you would choose " + pokemon  + " as your starter pokemon. The genre of music that you enjoy the most is " + music + " and you prefer " + starwars + " over the other Star Wars films. Hooray!!!");
	
	// Place your program here.  'c' is the output console
    } // main method
} // PersonelData class
