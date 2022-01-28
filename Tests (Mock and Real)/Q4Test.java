/*
 * Q4Test.java
 * Q42021
 */


public class Q4Test
{
	static int lastIndex = 0;
	
	public static void printArray(String[] a) {
		
		System.out.print( "Start: ");
		
		for(int i = 0; i < lastIndex; i++) {
			
			System.out.print( "  " + a[i]);
		}
		
		System.out.printf("\n\t[ %d elements in array ]\n", lastIndex);
		
	}
	
	public static String[] clone(String[] a) {
		
		String[] b = new String[a.length];
		
		for(int i = 0; i < a.length; i++) {	
			
			b[i] = a[i];
		
		}
		
		return b;
		
	}
	
	public static boolean isFull(String[] a) {
		
		if ( lastIndex == a.length) {
			
	 		return true;
	 		
		}
		
		else {
			
			return false;
		}
		
	}
	
	public static void bubbleSort(String[] a) {
	
		int i = a.length-1; 
		
		boolean swapped = true; // flag to indicate when a swap is made
		
		while(swapped==true && i >= 1) {
			
			swapped = false; 
			
			for(int j = 0; j < i; j++) {	
				
				if( a[j].compareTo(a[j+1]) < 0) {	//smaller value - bigger value = negative result, so bigger value would move left
					
					String temp = a[j];// not in order,
					
					a[j] = a[j+1];  // swap them
					
					a[j+1] = temp;
					
					swapped = true;
					
				} 
			} 
			
			i--; 
		} 

		
	}
	
	public static void selectionSort(String[] a) {
		
		for (int i = 0; i < a.length - 1; i++) {	
			
			int index = i;
			
			for (int j = i + 1; j < a.length; j++) {	
				
				if (a[j].compareToIgnoreCase(a[index]) < 0) {	
					
					index = j;
				}
			}

            String smallerNumber = a[index];
            
            a[index] = a[i];
            
            a[i] = smallerNumber;
        }

		
	}
	
	
	public static int search(String[] a, String data) {
		
		for(int i = 0; i < lastIndex; i++)	{
			
			if(a[i].equals(data) ) {
			
				return i;
				
			}
			
		}
		return -1;
	}
	
	public static void remove(String[] a, String indexToRemove) {
		
		int index = search (a, indexToRemove);
		
		if( index == ( -1) ) {	
			
			System.out.printf("%s not found.\n", indexToRemove);
		} 
		
		else {
			
			for(int i = index; i < lastIndex-1; i++) {
				
				a[i] = a[i+1];
			
			}
			
			lastIndex--;
			
			printArray (a);
		}
		
	}
	
	public static boolean isSortedAsc(String[] a) {
		
		selectionSort (a); //if the array has been sorted through the selection method (ascending)
			
			return true; //error: int cannot be converted to boolean, Not sure how to work past that 
		
	}

	public static boolean isSortedDesc(String[] a) {
		
		bubbleSort (a);
			
			return true;	
		
	}
	
	public static int isSorted(String[] a) {
		
		/*if ( isSortedAsc == true) {
			
			return 1;
			
		}
		
		if ( isSortedDesc == true) {
			
			return -1;
			
		}
		
		else {
			
			return 0;
			
		}*/
	
		return 0;
	}
	
	public static void removeDuplicates(String[] a) {
		
		/*for (int i = 0; i < a.length-1; i++) { //for the length of the array
			
			search (a, i); //find the data you are looking for
			
			
			
		}
		*/
	}
	
	public static void insert(String[] a, String data, int index) {
		
		if( isFull(a) == (true) ) {
			
			System.out.println("Error - array full");
		}
		
		else {
		
			lastIndex++;
		
			for(int i = lastIndex-1; i > index; i--)	{	
				
				a[i] = a[i-1];
				
				printArray(a);
			}
			
			a[index] = data;
		}
		
		printArray(a);
		
	}
	
	public static void insert(String[] a, String element)
	{
		
	}
	
	public static void main (String[] args)
	{
		String[] original = { "Abe", "Bob", "Gale", "Ed", "Faye", "Ives", "Chuck", "Abe", "Gale", "Anne" };
		
		String[] ascending  = clone(original);
		
		String[] descending = clone(original);
		
		selectionSort(ascending);
		
		bubbleSort(descending);
		
		printArray(original);
		
		printArray(ascending);
		
		printArray(descending);
		
		lastIndex = original.length;
		
		System.out.println();
		
		System.out.println("Looking for Lester [-1]: " + search(ascending, "Lester"));
		
		System.out.println("Looking for anne   [-1]: " + search(ascending, "anne"));
		
		System.out.println("Looking for Anne   [2] : " + search(ascending, "Anne"));
		
		System.out.println("\noriginal array sorted [0]: " + isSorted(original));
		
		System.out.println("ascending array sorted [1]: " + isSorted(ascending));
		
		System.out.println("descending array sorted [-1]: " + isSorted(descending));
		
		System.out.println("\nRemoving first element from descending array");
		
		lastIndex = descending.length;
		
		remove(descending, descending [ 0 ]);
		
		printArray(descending);
		
		lastIndex = ascending.length;
		
		System.out.println("\nRemoving Chuck [4] element from ascending array");
		
		remove(ascending, ascending [ 4 ] );
		
		System.out.println("\nRemoving duplicates from the ascending array");
		
		/*removeDuplicates(ascending);
		
		printArray(ascending);
		
		System.out.println("\nRemoving duplicates from the original array? ");
		
		removeDuplicates(original);
		
		System.out.println();
		
		System.out.println("Inserting Ivo into descending");*/
		
		insert(descending, "Ivo");
		
		System.out.println("Inserting Ives into ascending");
		
		insert(ascending, "Ives");
		
		System.out.println("\nInserting James into ascending");
		
		insert(ascending, "James");
		
		printArray(ascending);

		System.out.println("Inserting Aaron into ascending");

		insert(ascending, "Aaron");

		printArray(ascending);

		System.out.println("Inserting Ernesto into ascending");

		insert(ascending, "Ernesto");

		printArray(ascending);
	

	}

}

