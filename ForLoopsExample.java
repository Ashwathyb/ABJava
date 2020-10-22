/*
 * Trial for for loops.java
 */


public class ForLoopsExample {
	
	public static void main (String[] args) 
	{
		int sum = 0;
		int start = IBIO.inputInt("Start Number = ");
		int ratio = IBIO.inputInt("Ratio = ");
		int term = IBIO.inputInt("How many terms?  ");
		for (int v=0; v<=term-1; v++) {
			System.out.println(start + " ");
			sum = sum + start;
			start = start*ratio;
			}
		System.out.println(sum + "   " + start);
	}
	}


