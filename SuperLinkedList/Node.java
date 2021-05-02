/*
 * Node (element) class: building block of ADTs,
 * specifically for linked (list) implementations
 */
 
public class Node
{
	String  data;
	Node next; // (self-reference)
	
	public Node(String d)	// constructor <- allows you to create
	{					// a node AND initialise its data at
		data = d;		// the same time (with one line of code).
		next = null;	// like: Node n = new Node(5);
	}
	
	public boolean hasNext()
	{
		if(next == null)
			return false;
		else
			return true;
			
		// OR // return next != null;
	}


	public String toString()
	{
		return "" + data;
	}


}

