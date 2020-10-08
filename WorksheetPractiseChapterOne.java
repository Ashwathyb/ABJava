/*
 * Worksheet Practise for Practical (obviously)
 * 
 * 
 */

public class WorksheetPractiseChapterOne {
	
	public static void main (String[] args) {
	int number = IBIO.inputInt ("Give me a number   ");
	if (number>0) {
		for (int i = 0; i <= number; i++) { //Watch out for conditions!
			System.out.println ("This was an epic effort by Ashwathy Balagopal");
			}
		}
	else {
		System.out.println("Less than zero? Really? You are lame!");
	}
	int start = IBIO.inputInt ("Give me the starting number of your sequence. P.S- Make it an integer and make my life easier   ");
	int step = IBIO.inputInt ("Give me the step between the terms of your sequence. Hint: This, too, should be an integer.    ");
	int term = IBIO.inputInt ("How many terms would you like me to print kind sir/madam/non-binary?     ");
	for (int v = 0; v >= term; v++) {
		start = start + step;
		System.out.print("This is your sequence" + start);
	}
		}
	}


