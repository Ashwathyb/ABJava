/*
 */


public class PracticalTestTwo {
	
	public static void main (String[] args) {
		System.out.println ("Ashwathy Balagopal");
		System.out.println ("   ");
		long numone = 0;
		long numtwo = 1;
		long numthree = 0;
		long digits = 0;
		long totalno = IBIO.inputInt ("How many terms : ");
		double average = 0;
			while (totalno < 0) {
				if (totalno < 0) {
					System.out.println ("Error- enter a positive number.");
				}
				totalno = IBIO.inputInt ("How many terms : ");
			}
			for (int k = 0; k <= (totalno-2); k++) {
				if (totalno <= 20) { 
					if (k == 0) {
						System.out.print (numone + ";");
						System.out.print (numtwo + ";");
					}
				numthree = numone + numtwo;
				System.out.print (numthree + ";");
				numone = numtwo;
				numtwo = numthree;
				}
				if (totalno>20) {
				numthree = numone + numtwo;
				numone = numtwo;
				numtwo = numthree;
					if (k == totalno-2) {
						System.out.println ("Term " + totalno + " is " + numthree);
					}
				}
				average = numthree+numtwo+numone;
			}
			System.out.println ("   ");
			average = average/totalno;
			System.out.println ("The average is " + average);
			while(numthree > 0) {
				digits++;
				numthree = numthree / 10;
			}	
		System.out.println ("Term has " + digits + " digits");
	}
}
