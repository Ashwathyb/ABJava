

public class ArraysChallenge2 {
	
	public static int oddnumbers (int [ ] array) {
		
		int counter = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			if (array [ i ] % 2 == 0) {
				
				counter = counter + 1;
			}
			
		}
		
		return counter;
	}
	
	public static void main (String[] args) {
		
		int [ ] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
	}
}

