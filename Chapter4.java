public class Chapter4 {
	
	public static void main (String[] args) {
		System.out.println ("  ");
		System.out.println ("Part 4.1");
		int numone = IBIO.inputInt ("Enter the first number: ");
		int numtwo = IBIO.inputInt ("Enter the second number: ");
		int answer;
		System.out.println (" 1 is for addition of the two numbers. ");
		System.out.println (" 2 is for multiplication of the two numbers. ");
		System.out.println (" 3 is for exiting the system. ");
		int operation = IBIO.inputInt ("Enter the operation number: ");
		switch (operation) {
			case 1:
				answer = numone + numtwo;
				System.out.println ("The answer is " + answer);
			break;
			case 2:
				answer = numone*numtwo;
				System.out.println (answer);
			break;
			case 3:
				System.out.println ("Exiting system.....");
				System.exit(0);
			break;
			default:
				System.out.println ("That was not a valid operation");
			break;
		}
		
		System.out.println ("   ");
		System.out.println ("Part 4.2"); //I'm not sure if this is correct.
		int digit = 1;
		int x = digit%3;
		int sum = digit;
		System.out.print (digit + "  ");
		do {
			switch (x) {
				case 0:
					digit = -5*digit;
					System.out.print (digit + "  ");
				break;
				case 1:
					digit = 7*digit;
					System.out.print (digit + "  ");
				break;
				case 2:
					digit = 2*digit;
					System.out.print (digit + "  ");
				break;
				default:
					System.out.println ("Error");
				break;	
				}
			sum = sum + digit;			
		} while (digit <= 1000);
		System.out.println ("  ");
		System.out.println ("The sum is " + sum);
		System.out.println ("  ");
		System.out.println ("Part 4.3");
		int num = IBIO.inputInt ("Enter a number: ");
		do {
			
		} 
		
		
	}
}

