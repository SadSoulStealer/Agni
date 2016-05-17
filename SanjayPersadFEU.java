// The "SanjayPersadFEU" class.
// Name: Sanjay Persad
// Date: 1/12/2015
// Purpose: To acomplish the assignment and hand it in by the 1/20/2015

import java.awt.*;
import hsa.Console;

public class SanjayPersadFEU
{
    static Console c;           // The output console
    
    public static void main (String[] args) throws InterruptedException
    {
	c = new Console ();
 
    //Main Menu    
     c.println("1: Title Page");
     c.println("2: Language Learner");
     c.println("3: Shape Maker");
     c.println("4: Program Portfolio");
     c.println("5: Exit Program");
     c.println();
     c.println("Enter your choice:");
     int choice1 = c.readInt ();
     
     if (choice1 == 5)
     {
	 c.clear ();
	 Exit ();
     }
	
     else if(choice1 == 4)
     {
	 c.clear ();
	 ProgPortfolio ();
     }
	
     else if(choice1 == 3)
     {
	 c.clear ();
	 MethodProg ();
     }
	
     else if(choice1 == 2)
     {
	 c.clear ();
	 OneDArrayTask ();
     }
	
     else if(choice1 == 1)
     {
	 c.clear ();
	 titlepage ();
     }
     
      else if(choice1 != 1 || choice1 != 2 || choice1 != 3 || choice1 != 4 || choice1 != 5)
     {
	 c.clear ();
	 c.println("INVALID ENTRY!");
	 c.getChar ();
	 c.clear ();
	 menu ();
     }

 } 
    
    
    //Back-up Menu
    public static void menu () throws InterruptedException
    {
	c.println("1: Title Page");
	c.println("2: Language Learner");
	c.println("3: Shape Maker");
	c.println("4: Program Portfolio");
	c.println("5: Exit Program");
	c.println();
	c.println("Enter your choice:");
	int choice1 = c.readInt ();
	
	if (choice1 == 5)
	{
	    c.clear ();
	    Exit ();
	}
	
	else if(choice1 == 4)
	{
	    c.clear ();
	    ProgPortfolio ();
	}
	
	else if(choice1 == 3)
	{
	    c.clear ();
	    MethodProg ();
	}
	
	else if(choice1 == 2)
	{
	    c.clear ();
	    OneDArrayTask ();
	}
	
	else if(choice1 == 1)
	{
	    c.clear ();
	    titlepage ();
	}
	
	else if(choice1 != 1 || choice1 != 2 || choice1 != 3 || choice1 != 4 || choice1 != 5)
	{
	   c.clear ();
	   c.println("INVALID ENTRY!");
	   c.getChar ();
	   c.clear ();
	   menu ();
	}
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
    
    //Title Page
    public static void titlepage () throws InterruptedException
    {
	
	c.fillRect(10,10,660,660);
	Font consolas = new Font ("Consolas", Font.PLAIN, 69);
	c.setColor(Color.green);
	c.setFont(consolas);
	c.drawString("COMPUTER",50,100);
	   Thread.sleep (210);
	c.drawString("PROGRAMMING",130,160);
	   Thread.sleep (210);
	c.setColor(Color.white);
	c.fillRect(250,195,125,105);
	c.setColor(Color.black);
	c.fillRect(260,205,105,85);
	c.setColor(Color.white);
	c.fillRect(283,295,60,20);
	c.fillRect(264,316,100,5);
	c.fillRect(252,323,125,34);
	c.fillRect(252,378,125,43);
	c.setColor(Color.black);
	c.fillRect(259,384,111,32);
	c.setColor(Color.gray);
	c.fillRect(311,359,7,17);
	c.getChar ();
	c.clear ();
	menu ();
	
    }
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //One Dimensional Array Task
    public static void OneDArrayTask () throws InterruptedException
    {
	String ComputerLang []  = new String[35];

	ComputerLang[0] = "A+: an array programming language descendent from the programming language A, which in turn was created to replace APL";
	ComputerLang[1] = "A++: stands for abstraction plus reference plus synthesis which is used as a name for the minimalistic programming language that is built on ARS.";
	ComputerLang[2] = "ActionScript: an object-oriented programming language originally developed by Macromedia Inc. (now dissolved into Adobe Systems). It is a derivation of HyperTalk, the scripting language for HyperCard.";
	ComputerLang[3] = "AppleScript: a scripting language created by Apple Inc. and built into Macintosh operating systems since System 7.";
	ComputerLang[4] = "C#: a multi-paradigm programming language encompassing strong typing, imperative, declarative, functional, generic, object-oriented (class-based), and component-oriented programming disciplines.";
	ComputerLang[5] = "C--: a C-like programming language. Its creators, functional programming researchers Simon Peyton Jones and Norman Ramsey, designed it to be generated mainly by compilers for very high-level languages rather than written by human programmers.";
	ComputerLang[6] = "C++: a general-purpose programming language. It has imperative, object-oriented and generic programming features, while also providing the facilities for low-level memory manipulation.";
	ComputerLang[7] = "CoffeeSpirit: a programming language that transcompiles to JavaScript. It adds syntactic sugar inspired by Ruby, Python and Haskell[1] to enhance JavaScript's brevity and readability.";
	ComputerLang[8] = "ColdFusion: was originally designed to make it easier to connect simple HTML pages to a database. By Version 2 (1996), it had become a full platform that included an IDE in addition to a full scripting language.";
	ComputerLang[9] = "Delphi: an integrated development environment (IDE) for console, desktop graphical, web, and mobile applications. Delphi's compilers use their own Object Pascal dialect of Pascal and generate native code for 32- and 64-bit Windows operating systems, as well as 32-bit Mac OS X, iOS and Android.";
	ComputerLang[10] = "Google Apps Script: a cloud based scripting language for light-weight application development in the Google Apps platform.";
	ComputerLang[11] = "GameMaker Language: the creation of cross-platform and multi-genre video games using drag and drop action sequences or a sandboxed scripting language known as Game Maker Language, which can be used to develop more advanced games that could not be created just by using the drag and drop features. ";
	ComputerLang[12] = "GameMonkey Script: a small, cross-platform scripting language designed, as its name suggests, for embedding into games. GameMonkey bears many similarities to Lua, except the syntax is more similar to that of C.";
	ComputerLang[13] = "Hack: programming language for the HipHop Virtual Machine (HHVM), created by Facebook. The language is open source, licensed under the BSD License.";
	ComputerLang[14] = "J#: a programming language was a transitional language for programmers of Java and Visual J++ languages, so they could use their existing knowledge and applications on .NET Framework.";
	ComputerLang[15] = "J++: was Microsoft's implementation of Java. Syntax, keywords, and grammatical conventions were the same as Java's. Microsoft discontinued support of J++ in January 2004, replacing it to a certain extent with J# and C#.";
	ComputerLang[16] = "Java: a functional computer programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible. It is intended to let application developers write once, run anywhere (WORA), meaning that code that runs on one platform does not need to be recompiled to run on another.";
	ComputerLang[17] = "JavaScript: a dynamic computer programming language. It is most commonly used as part of web browsers, whose implementations allow client-side scripts to interact with the user, control the browser, communicate asynchronously, and alter the document content that is displayed.";
	ComputerLang[18] = "LegoScript: a dynamic programming language mixing elements from other languages and using them to program Lego NXT Mindstorms.";
	ComputerLang[19] = "Lynx: a programming language for large distributed networks, using remote procedure calls.";
	ComputerLang[20] = "OpenCL: a language (based on C99) for programming these devices, and application programming interfaces (APIs) to control the platform and execute programs on the compute devices. ";
	ComputerLang[21] = "Pizza: an open-source superset of the Java programming language with the following new features: Generics, Function Pointers, Case classes and pattern matching (a.k.a. Algebraic types)";
	ComputerLang[22] = "Python: a widely used general-purpose, high-level programming language. Its design philosophy emphasizes code readability, and its syntax allows programmers to express concepts in fewer lines of code than would be possible in languages such as C++ or Java.";
	ComputerLang[23] = "Ruby: a dynamic, reflective, object-oriented, general-purpose programming language. It was designed and developed in the mid-1990s by Yukihiro Matsumoto in Japan. It supports multiple programming paradigms, including functional, object-oriented, and imperative.";
	ComputerLang[24] = "RuneScript:  an interpreted domain-specific scripting language called which is used by RuneScape's server for event handling.";
	ComputerLang[25] = "Stackless Python: a Python programming language interpreter, so named because it avoids depending on the C call stack for its own stack. The most prominent feature of Stackless is microthreads, which avoid much of the overhead associated with usual operating system threads.";
	ComputerLang[26] = "Turing: a Pascal-like programming language developed in 1982 by Ric Holt and James Cordy, then of University of Toronto, Canada. Turing is a descendant of Euclid, Pascal and SP/k that features a clean syntax and precise machine-independent semantics.";
	ComputerLang[27] = "Turbo C++: a C++ compiler and integrated development environment and computer language originally from Borland. Most recently it was distributed by Embarcadero Technologies, which acquired all of Borland's compiler tools with the purchase of its CodeGear division in 2008.";
	ComputerLang[28] = "UNITY: a programming language that was constructed by K. Mani Chandy and Jayadev Misra. It is a rather theoretical language, which tries to focus on what, instead of where, when or how.";
	ComputerLang[29] = "VBA: an implementation of Microsoft's event-driven programming language, Visual Basic 6, and its associated integrated development environment (IDE).";
	ComputerLang[30] = "VBScript: an Active Scripting language developed by Microsoft that is modeled on Visual Basic. It is designed as a lightweight language with a fast interpreter for use in a wide variety of Microsoft environments.";
	ComputerLang[31] = "Visual Basic: a third-generation event-driven programming language and integrated development environment (IDE) from Microsoft. Visual Basic was derived from BASIC and enables the rapid application development (RAD) of graphical user interface (GUI) applications, access to databases using Data Access Objects, Remote Data Objects, or ActiveX Data Objects, and creation of ActiveX controls and objects.";
	ComputerLang[32] = "Visual Basic.NET: a multi-paradigm, high level programming language, implemented on the .NET Framework. Microsoft launched VB.NET in 2002 as the successor to its original Visual Basic language.";
	ComputerLang[33] = "Window Powershell: a task automation and configuration management framework from Microsoft, consisting of a command-line shell and associated scripting language built on the .NET Framework. PowerShell provides full access to COM and WMI, enabling administrators to perform administrative tasks on both local and remote Windows systems as well as WS-Management and CIM enabling management of remote Linux systems and network devices.";
	ComputerLang[34] = "XBL: an XML-based markup language used to declare the behavior and look of XUL-widgets and XML elements.";
	
	
	c.println("What language would you like to learn about?");
	c.println();
	c.println("Enter your choice (Case-Sensitive):");
	String language = c.readString ();
	
	if (language.equals ("A+"))
	{
	   c.clear ();
	   c.println(ComputerLang[0]);
	}
	
	else if (language.equals ("A++"))
	{
	   c.clear ();
	   c.println(ComputerLang[1]);
	}
	
	else if (language.equals ("ActionScript"))
	{
	   c.clear ();
	   c.println(ComputerLang[2]);
	}
	
	else if (language.equals ("AppleScript"))
	{
	   c.clear ();
	   c.println(ComputerLang[3]);
	}
	
	else if (language.equals ("C#"))
	{
	   c.clear ();
	   c.println(ComputerLang[4]);
	}
	
	else if (language.equals ("C--"))
	{
	   c.clear ();
	   c.println(ComputerLang[5]);
	}
	
	else if (language.equals ("C++"))
	{
	   c.clear ();
	   c.println(ComputerLang[6]);
	}
	
	else if (language.equals ("CoffeeScript"))
	{
	   c.clear ();
	   c.println(ComputerLang[7]);
	}
	
	else if (language.equals ("ColdFusion"))
	{
	   c.clear ();
	   c.println(ComputerLang[8]);
	}
	
	else if (language.equals ("Delphi"))
	{
	   c.clear ();
	   c.println(ComputerLang[9]);
	}
	
	else if (language.equals ("Google Apps Script"))
	{
	   c.clear ();
	   c.println(ComputerLang[10]);
	}
	
	else if (language.equals ("GameMaker Language"))
	{
	   c.clear ();
	   c.println(ComputerLang[11]);
	}
	
	else if (language.equals ("GameMonkey Script"))
	{
	   c.clear ();
	   c.println(ComputerLang[12]);
	}
	
	else if (language.equals ("Hack"))
	{
	   c.clear ();
	   c.println(ComputerLang[13]);
	}
	
	else if (language.equals ("J#"))
	{
	   c.clear ();
	   c.println(ComputerLang[14]);
	}
	
	else if (language.equals ("J++"))
	{
	   c.clear ();
	   c.println(ComputerLang[15]);
	}
	
	else if (language.equals ("Java"))
	{
	   c.clear ();
	   c.println(ComputerLang[16]);
	}
	
	else if (language.equals ("JavaScript"))
	{
	   c.clear ();
	   c.println(ComputerLang[17]);
	}
	
	else if (language.equals ("LegoScript"))
	{
	   c.clear ();
	   c.println(ComputerLang[18]);
	}
	
	else if (language.equals ("Lynx"))
	{
	   c.clear ();
	   c.println(ComputerLang[19]);
	}
	
	else if (language.equals ("OpenCL"))
	{
	   c.clear ();
	   c.println(ComputerLang[20]);
	}
	
	else if (language.equals ("Pizza"))
	{
	   c.clear ();
	   c.println(ComputerLang[21]);
	}
	
	else if (language.equals ("Python"))
	{
	   c.clear ();
	   c.println(ComputerLang[22]);
	}
	
	else if (language.equals ("Ruby"))
	{
	   c.clear ();
	   c.println(ComputerLang[23]);
	}
	
	else if (language.equals ("RuneScript"))
	{
	   c.clear ();
	   c.println(ComputerLang[24]);
	}
	
	else if (language.equals ("Stackless Python"))
	{
	   c.clear ();
	   c.println(ComputerLang[25]);
	}
	
	else if (language.equals ("Turing"))
	{
	   c.clear ();
	   c.println(ComputerLang[26]);
	}
	
	else if (language.equals ("Turbo C++"))
	{
	   c.clear ();
	   c.println(ComputerLang[27]);
	}
	
	else if (language.equals ("Unity"))
	{
	   c.clear ();
	   c.println(ComputerLang[28]);
	}
	
	else if (language.equals ("VBA"))
	{
	   c.clear ();
	   c.println(ComputerLang[29]);
	}
	
	else if (language.equals ("VBScript"))
	{
	   c.clear ();
	   c.println(ComputerLang[30]);
	}
	
	else if (language.equals ("Visual Basic"))
	{
	   c.clear ();
	   c.println(ComputerLang[31]);
	}
	
	else if (language.equals ("Visual Basic.NET"))
	{
	   c.clear ();
	   c.println(ComputerLang[32]);
	}
	
	else if (language.equals ("Windows Powershell"))
	{
	   c.clear ();
	   c.println(ComputerLang[33]);
	}
	
	else if (language.equals ("XBL"))
	{
	   c.clear ();
	   c.println(ComputerLang[34]);
	}
	
	c.getChar ();
	c.clear();
	menu ();
	   
	
	
    }
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //Method Program
    public static void MethodProg () throws InterruptedException
    {
	c.println("What is your favorite shape (Rectangle, Star or Oval)?");
	c.println ();
	c.println("Enter your choice(Case-Sensitive):");
	String shape = c.readString ();
	
	if (shape.equals ("Rectangle"))
	{
	   c.clear ();
	   Rect ();
	}
	
	if (shape.equals ("Star"))
	{
	   c.clear ();
	   Star ();
	}
	
	if (shape.equals ("Oval"))
	{
	   c.clear ();
	   Oval ();
	}
	
	c.getChar ();
	c.clear ();
	menu ();


    }
    
    public static void Rect () throws InterruptedException
    {
       c.println("Here is a rectangle just for you!");
       c.drawRect(25,25,175,100);
    }
    
    
     public static void Star () throws InterruptedException
    {
       c.println("Here is a star (It kinda looks like you)!");
       c.drawStar(25,25,175,175);
    }
    
    
     public static void Oval () throws InterruptedException
    {
       c.println("Here is a oval just for you!");
       c.drawOval(25,25,175,100);
    }
    
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------    
    
    //Program Portfolio Menu
    public static void ProgPortfolio () throws InterruptedException
    {
	c.println("1: Average Calculator for 4 marks");
	c.println("2: Personal Quiz");
	c.println("3: Comparing Cereals");
	c.println("4: Return to Main Menu");
	c.println();
	c.println("Enter your choice: ");
	int choice2 = c.readInt ();
	
	if (choice2 == 1)
	{
	   c.clear ();
	   Program1 ();
	}
	
	else if (choice2 == 2)
	{
	   c.clear ();
	   Program2 ();
	}
	
	else if (choice2 == 3)
	{
	   c.clear ();
	   Program3 ();
	}
	
	else if (choice2 == 4)
	{
	   c.clear ();
	   menu ();
	}
	
	
    }
    
    
    //Program 1
    public static void Program1 () throws InterruptedException
    {
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
	
	c.getChar ();
	c.clear ();
	menu ();

    }
    
    
    //Program 2
    public static void Program2 () throws InterruptedException
    {
	//Intro.
	c.println("Hey, We would like to know all about you? Press any key to continue!");
	char yes = c.readChar ();
	c.clear ();
	
	//Question 1
	c.println("What is your name, mysterious wanderer?");
	String name = c.readString ();
	c.println("Onward," + name + " ,to the next question!");
	c.clear ();
	
	//Question 2
	c.println("What is your age, " + name + "?");
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
	c.getChar ();
	c.clear ();
	menu ();
    }
    
    
    //Program 3
    public static void Program3 () throws InterruptedException
    {
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
	double unitPriceB = priceB / gramB ;
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
	
	c.getChar ();
	c.clear ();
	menu ();
 
    }

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    //Exit of program
    public static void Exit () throws InterruptedException
    {
       c.println("Thanks for stopping by!");
       c.getChar ();
       c.close ();
    }
}// SanjayPersadFEU class
