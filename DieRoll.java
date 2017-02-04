// The "Lesson6_DieRollSimulation" class.
import java.awt.*;
import hsa.Console;

public class Lesson6_DieRollSimulation
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	int dierolls[] = new int[100];      //the 100 die rolls
	int frequency[] = new int[6];       //the frequency of each roll
	
	//roll the die 100 times
	for (int x=0; x<=99; x++)
	{
	    dierolls[x] = (int)(Math.random()*6)+1;
	    
	    //increase the frequency of the # rolled
	    if (dierolls[x] == 1)
		frequency[0] = frequency[0]+1;
	    else if (dierolls[x] == 2)
		frequency[1] = frequency[1]+1;
	    else if (dierolls[x] == 3)
		frequency[2] = frequency[2]+1;
	    else if (dierolls[x] == 4)
		frequency[3] = frequency[3]+1;
	    else if (dierolls[x] == 5)
		frequency[4] = frequency[4]+1;
	    else
		frequency[5] = frequency[5]+1;
		
	}
	
	//output results
	for (int x=0; x<=5; x++)
	    c.println("Die #: " +(x+1)+ "    Frequency: " +frequency[x]);
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Place your program here.  'c' is the output console
    } // main method
} // Lesson6_DieRollSimulation class
