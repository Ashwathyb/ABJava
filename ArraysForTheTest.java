public class ArraysForTheTest {	
	
	public static void printArray (int [] array) {
		
		for (int element : array) {
			
			System.out.print (element + " | ");
		}
		
		System.out.println ( );
				
	}
	
	private final static int MAXSIZE = 10;
	
	private static int lastIndex = 0;
	
	public static boolean isFull() {
		
		return lastIndex == MAXSIZE;
		
	/*	if (size == MAXSIZE)
	 *		return true;
	 *	else
	 *		return false;
	 */
	}
	
	public static int [] bubbleSort (int [] array) {
		int temp = 0;
		
		for (int i = 0; i < array.length-1; i++) {
			
			for (int j = 0; j < array.length - 1 - i; j++) {
				
				if (array [ j ] > array [ j + 1]) {
					
					temp = array [j];
					
					array [j] = array [j+1];
					
					array [j+1] = temp;
				}
				
			}
			
		}
		
		return array;
	}
	
	public static int [] selectionSort (int [] array) {
		
		int minValue = 0;
		int minIndex = 0;
		int temp = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			minValue = array [i];
			
			minIndex = i;
			
			for (int j = i; j < array.length; j++) {
				
				if (array [j] < minValue) {
					
					minValue = array [j];
					
					minIndex = j;
	
				}
				
			}
			
			if (minValue < array [i]) {
				
				temp = array [i];
				
				array [i] = array [minIndex];
				
				array [minIndex] = temp;
				
			}
			
		}
		
		return array;
		
	}
	
	public static int [] insert(int[] a, int data, int index) {
		
		if( isFull() == true ) {
			
			System.out.println("Error - array full");
			
		}
		
		else {
			
			lastIndex++;
			
		for(int i = lastIndex-1; i > index; i--) {	
			
			a[i] = a[i-1];
			
			printArray(a);
			
		}
			
			a[index] = data;
		}
		 
		return a;
	}
	public static int search(int[] a, int data)	{
		
		for(int i = 0; i < lastIndex; i++) {
			
			if(a[i] == data) {
			
				return i; }
		}
		return -1;
	}
	
	public static void remove(int [] a, int data)	{

		int indexToRemove = search(a, data);

		if( indexToRemove == -1)	{	
			
			System.out.printf("%s not found.\n", data);
		} 
		
		else {
			
			for(int i = indexToRemove; i < lastIndex-1; i++) {
				
				a[i] = a[i+1];
				
			}
			
			lastIndex--;
			
			printArray(a);
		}
	}
	public static void main (String[] args) {
		
		int [] original = { 7,9,6,8,1,3,5,2,4 };
		
		printArray ( original );
		
		int [ ] bubbleSorted = bubbleSort ( original );
		
		printArray ( bubbleSorted );
		
		int [ ] selectionSorted = selectionSort ( original );
		
		printArray ( selectionSorted );
		
		int [ ] inserted = insert ( original, 8, 6 );
	
		printArray ( inserted );
	
	}
}
