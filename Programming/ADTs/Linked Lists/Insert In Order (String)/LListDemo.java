/*
 * Use this class to test your LinkedList class assignment
 * 
 */
 
public class LListDemo
{
	
	public static void main (String[] args)
	{
		/*
		LinkedList l = new LinkedList();
		//int[] inputData = {5,1,4,7,9,1,6,3,2,0};
		String[] inputData = {"5", "1", "4", "7", "9", "1", "6", "3", "2", "0"};
		System.out.println("Adding data to a linked list:");
		printArray(inputData);
		System.out.println();
		for(String x : inputData)
		{
			l.append(x);
			l.printList();
		}
		System.out.println("Removing 5 from the linked list:");
		l.remove("5"); l.printList();
		System.out.println("Removing 9 from the linked list:");
		l.remove("9"); l.printList();
		System.out.println("Removing 0 from the linked list:");
		l.remove("0"); l.printList();
		
		System.out.println("\n\nSorted Linked List!\nInput data:");
		printArray(inputData);
		LinkedList sorted = new LinkedList();
		/*
		for(String x : inputData)
		{
			sorted.insertInOrder(x);
			sorted.printList();
		}
		*/
		
		LinkedList sorted = new LinkedList();
		String input;
		do
		{
			input = IBIO.inputString("Enter a string to add to the linked list: ");
			if(input.length() != 0)
			{	sorted.insertInOrder(input);
			}
			sorted.printList();
		} while(input.length() != 0);
		
	}
	
	
	public static void printArray(String[] a) {
		
		System.out.print( "Array contents -->");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print( "  " + a[i]);
		}
		System.out.printf("\t: %d elements in array\n", a.length);
		
	}
	
}

