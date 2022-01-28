/*
 * Worksheet Practise for Practical (obviously)
 * 
 * 
 */

public class WorksheetPractiseChapterOne {
	
	public static void main (String[] args) {
	int number = IBIO.inputInt ("Give me a number   ");
	if (number>0) {
		for (int i = 1; i <= number; i++) { //Watch out for conditions!
			System.out.println ("This was an epic effort by Ashwathy Balagopal");
			}
		}
	else {
		System.out.println("Less than zero? Really? You are lame!");
	}
	int start = IBIO.inputInt ("Give me the starting number of your sequence. P.S- Make it an integer and make my life easier   ");
	int step = IBIO.inputInt ("Give me the step between the terms of your sequence. Hint: This, too, should be an integer.    ");
	int term = IBIO.inputInt ("How many terms would you like me to print kind sir/madam/non-binary?     ");
	int answer = start;
	int square = start;
	System.out.print (start);
	for (int v = 1; v <= term-1; v++) {
		answer = answer + step;
		System.out.print("  " + answer);
	}
	System.out.println(" ");
	System.out.print (start);
	for (int c = 0; c<=8; c++) {
		start = start + step;
		System.out.print("  " + start);
		}	
	System.out.println("  ");
	for (int p = 0; p<=9; p++) {
		square = square*square;
		System.out.print ("  " + square); 
		
	}
	}
}	



