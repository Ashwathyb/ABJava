/*
 * List.java
 * 
 * Requires: Node.java
 * 
 * WIP. Singly linked list
 * We will implement:
 * isEmpty()   : boolean
 * printList() : void
 * append(int data) : void [add to the end of the list]
 * remove(int data) : boolean [remove data from the list]
 * insert(int data, int location) : insert data after (could
 * 		also be before if needed) a location/element
 * 		in the list
 * 
 * Try to implement the first two or three
 * before our next lesson!
 * 
 */


public class LinkedList
{
	Node start;		// beginning/head/access point of the L. List
	
	public boolean isEmpty()
	{	return start == null;
	}
	
	public void append(String data)
	{	Node newNode = new Node();
		newNode.data = data;
		if( isEmpty() )
		{	start = newNode;
			return;
		}
		Node temp = start;
		// while( temp.next != null ) // also, ...
		while( temp.hasNext() )
		{	temp = temp.next;
		}
		temp.next = newNode;
	}
	
	public void printList()
	{	
		if( isEmpty() )
		{	System.out.println("List is empty");
			return;
		}
		Node temp = start;
		System.out.print("Start -> ");
		while(temp != null)
		{	System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(); //" <- End");
	}
	
	public boolean remove(String element)
	{
		if( isEmpty() == true )
		{	System.out.println("ERROR - List is empty.");
			return false;
		}
		if( element.compareTo( start.data ) == 0 )
		{	start = start.next;
			return true;
		}
		Node temp1 = start;
		Node temp2 = start.next;
		while(temp2 != null)
		{	if(element.compareTo( temp2.data ) == 0)
			{	temp1.next = temp2.next;
				return true; // removing this does something!
			}
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		return false;
	}
	
	public void insertInOrder(String data) {	
		
		Node newNode = new Node();
		newNode.data = data;
		
	
		if ( isEmpty() ) {
			start = newNode;
			return;
		}
		
		if( data.compareTo( start.data ) <= 0 ) {	
		
			//IBIO.output("String is smaller than smallest string in list !!");
			newNode.next = start;
			start = newNode;
			
		} else {
			
			Node temp = start;
			
			while(temp.hasNext() && data.compareTo( temp.next.data ) >= 0) {	
				//System.out.println("Data is : " + data);
				//System.out.println("Compared To Data is : " + temp.data);
				temp = temp.next;
			}
			
			newNode.next = temp.next;
			temp.next = newNode;

		}
		
	}
	
}

