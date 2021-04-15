public class ArraysPractiseTest {
	
	public static double [ ] createnewarray ( ) {
		
		double grades [ ] = new double [ 8 ]; //remember new array format - datatype name [ ] = new datatype [size]
		
		for (int i = 0; i < 8; i ++) {
			
			grades [ i ] = IBIO.inputDouble ("Grade " + (i+1) + "? "); //gets the input and puts it in the array
			
			if (grades [ i ] > 7.9 | grades [ i ] < 1.0) { //validation process 
				
				System.out.println ("Error. Grades must be in between 7.9 and 1.0");
				grades [ i ] = IBIO.inputDouble ("Grade " + (i+1) + "? "); //replaces the value that caused the error
				
			} 
			
		}
		
		return grades;
		
	}
	
	public static void printArray (double [] array) {
		
		for (double element : array) {
			
			System.out.print (element + " | ");
		}
		
		System.out.println ( );
				
	}
	
	public static double largestElement (double [ ] array) {
		
		double largest = array [ 0 ];
		
		for (int x = 0; x < array.length; x++) {
			
			if (array [ x ] > largest) {
				
				largest = array [ x ];
				
			}
			
		}
		
		return largest;
		
	}
	
	public static double smallestElement (double [ ] array) {
		
		double smallest = array [ 0 ];
		
		for (int c = 0; c < array.length; c ++) {
			
			if (array [ c ] < smallest) {
				
				smallest = array [ c ];
				
			}
			
		}
		
		return smallest;
	}
	
	public static void main (String[] args) {
		
		System.out.println ("Ashwathy Balagopal");
		
		String subject = IBIO.inputString ("Subject? ");
		
		double [ ] grades = createnewarray ( );
		
		System.out.println ( subject + " Scores ");
		
		printArray (grades);
		
		System.out.println ("Highest Score = " + largestElement(grades));
		
		System.out.println ("Lowest Score = " + smallestElement(grades));
		
		if (largestElement(grades) > smallestElement(grades)) {
			
			System.out.print ("Improving");
			
		}
		
		else {
			
			System.out.print ("Worsening");
			
		}
	}
}

