/*
 * Trial for for loops.java
 */


public class ForLoopsExample {
	
	public static void main (String[] args) 
	{
	int randomnumber = IBIO.inputInt ("Give me a number");
		for (int i = 0; i == randomnumber; i++)
			{
			System.out.println (randomnumber*randomnumber);
			randomnumber = randomnumber*randomnumber;
			System.out.print ("is it working?");
			}
	}
}

