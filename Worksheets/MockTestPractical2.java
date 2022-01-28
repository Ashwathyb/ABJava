/*
 * Mock Test for Practical 
 * Part 2 
 * 
 * 
 */


public class MockTestPractical2 {
	
	public static void main (String[] args) 
	{
		System.out.println ("=======================");
		System.out.println ("Ashwathy Balagopal");
		int base = IBIO.inputInt ("Enter the base - ");
		int power = IBIO.inputInt ("Enter the exponent - ");
		int answer = 1;
			if (power == 0)
				{
					System.out.println ("Base is Zero. Nothing to do.");
					System.exit(0);
				}
			
			else if (power < 0)
				{
					System.out.println ("Exponent needs to be positive.");
					power = power * -1;
					for (int i = 1; i <=(power); i++)
					{
						answer = answer * base;
					}
					System.out.print ("The answer is = ");
					System.out.println ("   1   ");
					System.out.println ("                ------");
					System.out.println ("                   " + answer);
					//double final = answer;
					double decimal = 1.0/answer;
					System.out.println ("The decimal answer is = " + decimal);
				
				}
			
			else if (power > 0) 
			{
			
				answer = 1;
			
				for (int i = 1; i <=(power); i++)
				{
					answer = answer * base;
				}
			
				System.out.println ("The answer is " + answer);  
			}
	}
}
