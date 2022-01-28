/*
 * Mock Test for Practical 
 * Part 1 (Answers Steps 1-6)
 * 
 * 
 */


public class MockTestPractical1 {
	
	public static void main (String[] args) 
	{
		System.out.println ("=======================");
		System.out.println ("Ashwathy Balagopal");
		int base = IBIO.inputInt ("Enter the base - ");
		int power = IBIO.inputInt ("Enter the exponent - ");
		
		//int answer;
		int answer = 1;
		
		if (power == 0)
			{
				System.out.println ("Base is Zero. Nothing to do.");
				System.exit(0);
				//Make Sure To Add The Exit Code : "System.exit(0)"
			}
			
		else if (power < 0)
			{
				System.out.println ("Exponent needs to be positive.");
				System.exit(0);
				//Make Sure To Add The Exit Code : "System.exit(0)"
			}
			
		else if (power > 0) {
			
			answer = 1;
			
			for (int i = 1; i <=(power); i++) //No semi colon here!
			{
				answer = answer * base;
			}
			
			System.out.println ("The answer is " + answer);  /* stuck at number 6 */ //The 2 main mistakes you made is adding a semicolon after the for loop as well as showing the answer as base * base when it should be base * answer
																					//You should add this for loop in an else statement
																					// This is your old code :
																					//for (int i = 0; i == power; i=i+1);
																					//{
																					//answer = base*base;
																					//}
																					//System.out.println ("The answer is " + answer);  /* stuck at number 6 */
			
		}
		
		

	}
}

