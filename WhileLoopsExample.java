/*
 * Trial of while loops.java
 * 
 * 
 */


public class WhileLoopsExample {
	
	public static void main (String[] args) 
	{	
	int number = 2;																		 /* this can now find values for when two is the base and the
																							* user inputs the power! */
	int counter = IBIO.inputInt ("How many times should I multiply with 2?  ");
	while (counter > 1)
		{
			System.out.println (number*2);
			counter = counter - 1;
			number = number*2;
		}
	}
}
/* OUTPUT for when input is 3:
 * How many times should I multiply with 2?  3
4
8
 */
