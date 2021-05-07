/*
 * StackDemo v1
 * 
 */


public class StackDemo
{
	
	public static void main (String[] args)
	{
		Stack stack = new Stack();
		String input;
		do
		{
			input = IBIO.inputString("Enter a string to push to the stack: ");

			if(input.length() != 0)
			{	stack.push(input);
			}
			
			stack.printStack();
			
		} while(input.length() != 0);
		
		System.out.println("\nNow we pop the whole stack:");
		while(stack.isEmpty() == false)
		{	System.out.print( stack.pop() + " " );
			//stack.printStack();
		}
		System.out.print( stack.pop() + " " ); // to cause error, stack empty
	}
}

