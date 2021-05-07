/*
 * Queue Demo v1
 * 
 */


public class QueueDemo
{
	
	public static void main (String[] args)
	{
		Queue numberQueue = new Queue();
		String input;
		do
		{
			input = IBIO.inputString("Enter a string to enqueue: ");
			if(input.length() != 0)
			{	numberQueue.enQueue(input);
			}
			numberQueue.printQueue();
		} while(input.length() != 0);
		
		System.out.println("\nNow we dequeue the whole q:");
		while(numberQueue.isEmpty() == false)
		{	System.out.print( numberQueue.deQueue() + " " );
		}
		System.out.print( numberQueue.deQueue() + " " ); // to cause error, q empty
	}
}

