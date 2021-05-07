/*
 * Stack ADT - Linked implementation
 *
 */
 
public class Stack
{
	Node top;
	
	public boolean isEmpty()
	{
		if(top == null)
			return true;
		else
			return false;
		// or, in short: return top == null;
	}
	
	public void push(String d)
	{
		Node newNode = new Node();
		newNode.data = d;
		if( isEmpty() )
		{
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
	}
	
	public String pop()
	{
		if( !isEmpty() )
		{
			String d = top.data;
			top = top.next;
			return d;
		} else {
			//System.out.println("Stack empty!");
			return "\nStack empty!";
		}
	}
	
	public String peek()
	{
		return top.data;
	}
	
	public void printStack()
	{
		Node temp = top;
		if(temp != null)
		{
			System.out.println("Top\n---");
		}
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
}

