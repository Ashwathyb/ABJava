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
		System.out.println ("Part 4.2"); //I got it!!
		int output = 0;
		int sum = 0;
		for (int start = 1; start <= 1000; start++) {
			switch (start%3) {
				case (0):
					output = start * -5;
				break;
				case (1) :
					output = start * 7;
				break;
				case (2) :
					output = start * 2;
				break;
				default :
					System.out.println ("Error");
				break;
			}
			sum = sum + output;
		}
		System.out.println ("The sum is " + sum);
		
		System.out.println ("Part 4.3");
		int squareone;
		int squaretwo;
		int addition = 0;
		int num = IBIO.inputInt ("Enter a number: ");
		while (num >= 1000) {
			System.out.println ("Error.");
			num = IBIO.inputInt ("Enter a number less than 1000: ");
		}
		for (int c = 1; c <= num; c++) {
			squareone = c * c;
			
			for (int i = 1; i <= num; i++) {
				squaretwo = i * i;
				addition = squareone + squaretwo;
				if (addition == num) {
					System.out.print (c + "  " + i);
					break;
				}
			}
			if (addition == num) {
				break;
			}
		
		}
		
	}
}

