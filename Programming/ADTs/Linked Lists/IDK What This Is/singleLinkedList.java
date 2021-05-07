/*
 * singleLinkedList.java
 * 
 * Copyright 2021 Ansh <ansh@10-72-127-176.wifi.8.s.pas.ofs.edu.sg>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class singleLinkedList {
	
	Node head;
	Node tail;
	int  size;
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public void enQueue(int data)
	{
		
		do  {
		
			Node newNode = new Node();
			newNode.data = data;
			if( isEmpty() )
			{
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			size++;
		
		} while (head != null);
		
	}
	
	/*
	public int deQueue()
	{	if( !isEmpty() )
		{	int data = head.data;
			head = head.next;
			size--;
			return data;
		} else {
			System.out.println("Error-Empty queue");
			return 0;
		}
	}
	*/
	
	public void printQueue()
	{	
		if(isEmpty())
		{	System.out.println("Queue is empty");
			return;
		}
		Node temp = head;
		System.out.print("Head <- ");
		while(temp != null)
		{	System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(" <- Tail");
	}
		
}

