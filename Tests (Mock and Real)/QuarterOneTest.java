/*
 * 
 * 
 */


public class QuarterOneTest {
	
	public static void main (String[] args) {
		
	System.out.println ("Ashwathy Balagopal");
	int number = IBIO.inputInt ("Input a number please  =  ");
	int answer = number;
	int square = 0;
	int power = number;
		if (number>= 10 || number<1) {
			System.out.println("Error in input");
			System.exit(0);
		}
		if (number<10) {
		for (int i=1; i<=number; i++) {
			System.out.print (answer);
			square = answer*answer;
			System.out.print ("   " + square);
			for (int v=1; v<=answer; v++) {   //* The powers step does not work properly */
				for (int g=1; g<= v; g++) {
					power = power*answer;
				}
				System.out.println("        " + power);
			}
			answer = answer - 1;
			}
		}
		
		}
}

