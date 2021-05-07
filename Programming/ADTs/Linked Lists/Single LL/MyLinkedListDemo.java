
public class MyLinkedListDemo
{
	
	public static void main (String[] args)
	{
		LinkedList l = new LinkedList();
		
		int input;
		
		do {
			
			input = IBIO.inputInt("Enter the number that you wish to add to the linked list : ");
			if (input == 0) {
				IBIO.output("0 was inputted. Terminating.....");
				IBIO.output("The final list is : ");
				l.printList();
				break;
			}
			l.append(input);
			l.printList();
			
		} while (input != 0);
		
		
		for (int i = 0; i < 3; i++) {
			
			int deleteInput = IBIO.inputInt("Enter the number that you wish to delete from the linked list : ");
			boolean didDelete = l.remove(deleteInput);
			if (didDelete) {
				IBIO.output("Element was deleted. Proof : ");
				l.printList();
			} else {
				IBIO.output("Element was not found");
			}
			
		}
		
		IBIO.output("Done deleting 3 elements!");
		
	}
}

