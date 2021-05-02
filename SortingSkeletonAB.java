/* Sorting algorithms formative assessment
 * 
 * Student Name: Ashwathy Balagopal
 * 
 * April/2021
 * 
 * Please read sorting_algos_SL.pdf and convert the pseudocode algorithms
 * into Java methods
 * 
 * Also check https://visualgo.net/en/sorting 
 */
public class SortingSkeletonAB
{
	public static void printArray(int[] array)
	{
		for( int e: array )
		{	System.out.print( e + " " );
		}
		System.out.println();
	}
	
	public static int[] clone(int[] array) // returns a copy of array
	{
		if(array.length == 0) return null;
		int[] copy = new int[array.length];
		for(int i = 0; i < array.length; i++)
		{
			copy[i] = array[i];
		}
		return copy;
	}

	static void bubble(int[] a)
	{
		// your code goes here - sort the array a using bubble sort
		
		int i = a.length;
		boolean elementSwapped = true;
		while (elementSwapped = true) {
			
			int j = 0;
			elementSwapped = false;
			while ( j<=i-1 ) {
				
				if (a [j] > a [j+1]) {
					
					int temp = a [j];
					a [ j ] = a [ j+1 ];
					a [ j + 1] = temp;
					elementSwapped = true;
					
				}
				
				j++;
				
			}
			
			i--;
			
		}
	}

	public static void selection(int[] a)
	{
		// your code goes here - sort the array a using selection sort
		
	
	}

	// a couple of ways to visualise the insertion sort:
	// https://youtu.be/OGzPmgsI-pQ
	// https://youtu.be/JU767SDMDvA
	public static void insertion(int[] a)
	{
		// your code goes here - for the alternative insertion sort
		
		int i = 1;
		while ( i < a.length) {
			
			int j = i;
			while ( j>0 && a [ j-1 ] > a [ j ] ) {
				
				int temp = a [ j ];
				a [ j ] = a [ j-1 ];
				a [ j-1 ] = temp;
				j--;
			}
			
			i++;
		}
	}

	// No need to modify the main method.
	public static void main(String[] args)
	{
		int[] original = { 7,9,6,8,1,3,5,2,4 };
		int[] array = clone(original);
		System.out.println("Original array");
		printArray(original);

		System.out.println("\nBubble sort");
		bubble( array );
		printArray(array);
		System.out.println();

		System.out.println("\nSelection sort");
		array = clone(original);
		selection( array );
		printArray(array);

		System.out.println("\nInsertion sort");
		array = clone(original);
		insertion (array); //changed from simpleInsertion (array); - AB
		printArray(array);

	}
}
