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
	{	Node newNode = new Node(data);
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
	
	public void remove(int element)
	{
		if( isEmpty() == true )
		{	System.out.println("ERROR - List is empty.");
			return;
		}
		if( element.comparedTo (start.data) == 0 )
		{	start = start.next;
			return;
		}
		Node temp1 = start;
		Node temp2 = start.next;
		while(temp2 != null)
		{	
			if(temp2.data.comparedTo(element) == 0)
			{	temp1.next = temp2.next;
				return; // removing this does something!
			}
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
	}
	
	public void insertInOrder(String data) //Given an string, make it a node and then put it in the list
	{	Node current = start;
		Node newNode = new Node(data);
					
			while ( current.hasNext () == true) {
				if (data > current.data) {
				
				newNode.next = current.next;
				current.next = newNode;	
				
				}
				
				else {
					
					start.next = start;
					start = newNode;
					
				}
			}
		
		// your code goes here
		/*for the length of the list
		 *you check the data against the first node
		 * if greater, data inserts after
		 * if less than, data inserts before*/
	}
	
}

