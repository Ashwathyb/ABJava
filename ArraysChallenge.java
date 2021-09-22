public class ArraysChallenge {
	
	public static void printArray (int [] one) {
		
		for (int element : one) { //for (int i = 0; i < array.length; i++)
			
			System.out.println (element + "  ");
		}
		
		System.out.println ( );
				
	}
	
	public static int [ ] copy (int [ ] array) {
		
		int [ ] clone = new int [ array.length ]; 
		
		for (int i = 0; i < array.length; i ++) { //transverse the array
			
			clone [ i ] = array [ i ];
			
		}
		
		return clone;
	}
	
	public static int [ ] reversecopy (int [ ] array) {
		
		int [ ] reversecopy = new int [ array.length ];
		for (int i = array.length-1; i >= 0; i --) {
				
				reversecopy [ array.length-i-1 ] = array [ i ];
		
		}
		
		return reversecopy;
	}
	
	public static int [ ] twoElement (int [ ] array) {
	
	if (array.length == 0) {
		return null;
	}
	
	int [ ] two =  new int [ 2 ];
	two [ 0 ] = array [ 0 ];
	two [ 1 ] = array [ array.length - 1];	
	
	return two;
	
	}
	
	public static int sumup (int [ ] array) {
		
		int sum = 0;
		for (int i = 0; i < array.length; i ++) {
			
			sum = sum + array [ i ];
		} 
		return sum;
	}
	
	public static void main (String[ ] args) {
		
		int[] a = { 5, 4, 3, 2, 1 };
		
		printArray (a);

		int[] b = copy (a);

		printArray (b);

		System.out.println (a);

		System.out.println (b);
		
		int [ ] c = reversecopy (a);
		
		printArray (c);
		
		System.out.println (sumup (a));
		
	}
}

