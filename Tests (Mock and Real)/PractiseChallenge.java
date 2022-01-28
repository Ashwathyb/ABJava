public class PractiseChallenge {
	
	public static void main (String[] args) {
		
		System.out.println ("Ashwathy Balagopal");
		int input = IBIO.inputInt ("Enter a number between 1 and 9: ");
		while (input<1 || input > 9) {
			if (input < 1 || input > 9) {
			System.out.println ("Error- number out of range");
			}
			input = IBIO.inputInt ("Enter a number between 1 and 9: ");
			}
		for (int i = 1; i<=input; i++) {
			for (int c = 1; c<=20; c++) {
				System.out.print (i);
				System.out.print (" " + " x ");
					if (c<10) {
					System.out.print (" ");
					}
			System.out.print (c + " = ");
			System.out.println (i*c);
			}
		System.out.println ("------------");
		}
	}
}
	


