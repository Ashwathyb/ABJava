public class MockTestPracticalTwo {
	
	public static void main (String[] args) {
		System.out.println ("Ashwathy Balagopal");
		int start;
		do {
		start = IBIO.inputInt ("How many numbers to process? ");
		if (start < 5) {
			System.out.println ("Error- Number is out of range");
			}
		} while (start<5);
		int min = 0;
		int max = 0;
		double sum;
		for (int i=0; i<start; i++) {
			int n = IBIO.inputInt ("Enter a number: ");
			max = n;
			min = n;
			if (n>max) {
				n = max;
			}
			if (n<min) {
				n = min;
			} 
		}
		System.out.println (min);
		System.out.println (max);
	}

	}
