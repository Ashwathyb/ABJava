public class Chapter1 {
	
	public static void main (String[] args) {
		/*Pr.1.1 Answer*/
		int number = IBIO.inputInt ("Enter a number : "); 
		for (int i = 1; i <= number; i++) 
		{
			System.out.println ("Ash");
		}
		System.out.println ("(This was Part 1.1)");
		/*Pr.1.2 Answer*/
		int start = IBIO.inputInt ("Enter starting point : ");
		int steps = IBIO.inputInt ("Enter number of steps : ");
		int increments = IBIO.inputInt ("Enter the increment : ");
		int s = start;
		System.out.println ("   ");
		System.out.println ("Part 1.2");
		System.out.println ("   ");
		for (int v = 1; v <= steps; v++) {
			System.out.println (start);
			start = start + increments;
		}
		System.out.println ("   ");
		System.out.println ("Part 1.3");
		System.out.println ("   ");
		/*Pr.1.3 Answer*/
		int square;
		int cube;
		for (int c = 1; c <= 10; c++) {
			System.out.print (s + "   ");
			square = s*s;
			System.out.print (square + "   ");
			cube = s*s*s;
			System.out.println (cube);
			s = s + increments;
		}
		System.out.println ("   ");
		System.out.println ("Part 1.4. The triangular sequence.");
		System.out.println ("   ");
		int addon = 2;
		int begin = 1;
		for (int t = 1; t <= 100; t++) {
			System.out.println (begin);
			begin = addon + begin;
			addon = addon + 1;
		}
		System.out.println ("   ");
		System.out.println ("Part 1.5");
		System.out.println ("   ");
		int answer; 
		for (int r = 1; r <= 20; r++) {
			answer = 1;
			for (int a = 0; a < r; a++) {
				answer = answer * 2;
			}
			System.out.println ("2 raised to " + r + " is equal to " + answer);
		}
		System.out.println ("Part 1.6");
		System.out.println ("   ");
		int numone = 3;
		int numtwo = 4;
		int totalno = IBIO.inputInt ("How many terms : ");
		System.out.println (numone);
		System.out.println (numtwo);
		for (int k = 1; k <= (totalno - 2); k++) {
			int numthree = numone + numtwo;
			System.out.println (numthree);
			numone = numtwo;
			numtwo = numthree;
		}
		
	}

}

