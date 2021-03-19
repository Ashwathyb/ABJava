

public class ArraysChallenge2 {
	
	public static int oddnumbers (int [ ] array) {
		
		int counter = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			if (array [ i ] % 2 != 0) {
				
				counter = counter + 1;
			}
			
		}
		
		return counter;
	}
	
	public static boolean identical (int [ ] arrayA, int [ ] arrayB) {
		
		int sameElement = 0;
		
		for (int c = 0; c < arrayA.length; c ++) {
			
			if (arrayA [ c ] == arrayB [ c ]) {
				
				sameElement = sameElement + 1;
			}
		}
		
		if (sameElement == arrayA.length) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
	}
	
	public static int checking (int [ ] array, int n) {
		
		int checking = 0;
		
		for (int v = 0; v < array.length; v ++) {
			
			if (array [v] == n) {
				
				checking = checking + 1;
				
			}
		}
		
		return checking;
	}
	
	public static int largestElement (int [ ] array) {
		
		int largest = array [ 0 ];
		
		for (int x = 0; x < array.length; x++) {
			
			if (array [ x ] > largest) {
				
				largest = array [ x ];
				
			}
			
		}
		
		return largest;
		
	}
	
	public static int secondElement (int [ ] array) {
		
		int largest = array [ 0 ];
		int secondlargest = 0;
		
		for (int y = 0; y < array.length; y++) {
			
			if (array [ y ] > largest) {
				
				secondlargest = largest;
				largest = array [ y ];
				
			}
			
		}
		
		return secondlargest;
		
	}
	
	public static void main (String[] args) {
		
		int [ ] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int [ ] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println (oddnumbers (a));
		
		System.out.println (identical(a, b));
		
		int n = IBIO.inputInt ("What number should I check for?  ");
		
		System.out.println (checking(a, n));
		
		System.out.println (largestElement (a));
		
		System.out.println (secondElement(a));
	}
}

