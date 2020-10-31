public class Chapter2 {
	
	public static void main (String[] args) {
		System.out.println ("Part 2.1");
		int a = IBIO.inputInt ("Enter a number between 50 and 60 : ");
		if (a>60) {
			System.out.println ("Sorry, that number was too big");
		}
		if (a<50) {
			System.out.println ("Sorry, that number was too small");
		}
		System.out.println ("Part 2.2 and 2.3");
		int number = IBIO.inputInt ("Give me a number : ");
		if (number  % 2 != 0) {
			System.out.println (number + " is an odd number");
		}
		else {
			System.out.println (number + " is an even number");
		}
		System.out.println ("Part 2.4");
		for (int i = 0; i < 20; i++) {
			 if (i < 5) {
				IBIO.output("   " + i*i*i); } // there are 3 spaces between the ""
			else if (i>=5 && i<=9) {
				IBIO.output("  " + i*i*i); } //there are 2 spaces between the ""	
			else {
				IBIO.output(" " + i*i*i); } // there is only 1 space between the ""
		}
		System.out.println ("Part 2.5");
		for (int i = 1; i <= 100; i++) {
			 if (i%2 != 0) {
				 System.out.println (i); }
			 }
		System.out.println ("Part 2.6");
		for (int c = 1; c <= 100; c++) {
			if (c%2 !=0 && c%3 != 0) {
				System.out.println (c); }
			}
	}
}

