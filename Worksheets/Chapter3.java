public class Chapter3 {
	
	public static void main (String[] args) {
		
		System.out.println ("Part 3.1");
		int x;
		do {
			x = IBIO.inputInt ("Enter a number please: "); 
		} while (x%2 == 0 && x>0 && x<100);
				
		System.out.println (" ");
		System.out.println ("Part 3.2");
		
		int divisor = 0;
		int number = IBIO.inputInt("Enter a number: ");
		
		do {
			divisor++;
			if (number % divisor == 0) {
				System.out.println (number + " is divisible by " + divisor);	//Lists all factors of number
			}
		} while(divisor != number );
		
		System.out.println (" ");
		System.out.println ("Part 3.3");
		
		int sum = 0;
		int input = IBIO.inputInt ("Enter a number that is greater than 100: ");
		int cube;
		int sumcube = 0;
		int n = input;
		
		do {
			int digit = input % 10;
			cube = digit * digit * digit;
			sum = sum + digit;
			sumcube = sumcube + cube;
			input = input / 10;
		} while (input != 0);
		System.out.println ("The sum of the digits of " + n + " is " + sum); 
		System.out.println ("The sum of the cubes of the digits of " + n + " is " + sumcube);
		
		System.out.println (" ");
		System.out.println ("Part 3.4");
		
		double uone = IBIO.inputInt ("Enter starting number: ");
		int counter = 0;
		do {
			System.out.print (uone + "  ");
				if (uone % 2 == 0) {
				uone = uone * 0.5; }
				else {
				uone = 3 * uone + 1; }
			counter ++;
			} while (uone != 1);
		System.out.println ("  ");
		System.out.println ("This took " + counter + " steps");
	}
}


