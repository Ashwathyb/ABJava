/*
 * LinkedList2_Demo.java
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


public class LinkedList2_Demo {

	public static void printLine( ) {
		IBIO.output("-----------------------------------------------------------------------------------------");
	}
	
	public static void main (String[] args) {
		
		LinkedList2 l = new LinkedList2();
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
	
		int listIndexLength = -1;
		
		for(int x : array) {
			l.append(x);
			listIndexLength++;
			//l.printList();
		}
		
		printLine();
		
		IBIO.output("The current list is : ");
		l.printList();
		IBIO.output("The index length starting from 0 is : " + listIndexLength);
		
		printLine();
		
		IBIO.output("After adding 61 to the beggining, the list is : ");
		l.insertAtIndex(61, 0); l.printList();
		
		listIndexLength++;
		IBIO.output("The index length starting from 0 is : " + listIndexLength);
		
		printLine();
		
		IBIO.output("After adding 97 to the beggining, the list is : ");
		l.insertAtIndex(97, 0); l.printList();
		
		listIndexLength++;
		IBIO.output("The index length starting from 0 is : " + listIndexLength);
		
		printLine();
		
		IBIO.output("After adding 378 at index 1, the list is : ");
		l.insertAtIndex(378, 1); l.printList();
		
		listIndexLength++;
		IBIO.output("The index length starting from 0 is : " + listIndexLength);
				
		printLine();
		
		IBIO.output("After adding 461 at index 7, the list is : ");
		l.insertAtIndex(461, 7); l.printList();
		
		listIndexLength++;
		IBIO.output("The index length starting from 0 is : " + listIndexLength);
				
		printLine();
		
		IBIO.output("After adding 22 at index 12 (the second last index of the previous list), the list is : ");
		l.insertAtIndex(22, 12); l.printList();
		
		listIndexLength++;
		IBIO.output("The index length starting from 0 is : " + listIndexLength);
		
		printLine();
		
		IBIO.output("After adding 99 at index 14 (the last index of the previous list), the list is : ");
		l.insertAtIndex(99, 14); l.printList();
		
		listIndexLength++;
		IBIO.output("The index length starting from 0 is : " + listIndexLength);
				
		printLine();
		
		IBIO.output("After adding 27 at index 16 (after the last index of the previous list), the list is : ");
		l.insertAtIndex(27, 16); l.printList();
		
		listIndexLength++;
		IBIO.output("The index length starting from 0 is : " + listIndexLength);
				
		printLine();
				
		IBIO.output("Inserting index as 18 when list length is 17 ");
		l.insertAtIndex(100, 18);
		
		printLine();
		
		IBIO.output("Inserting index as -16 :) ");
		l.insertAtIndex(27, -16);
		
		printLine();

	}
	
}

