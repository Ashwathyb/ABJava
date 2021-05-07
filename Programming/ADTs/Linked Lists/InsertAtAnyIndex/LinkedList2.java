/*
 * LinkedList2.java
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


public class LinkedList2 {
	
	Node start;		// beginning/head/access point of the L. List
	
	public boolean isEmpty() {	
		return start == null;
	}
	
	public void insertAtBeginning(int data) {
		
		Node newNode = new Node(data);
		if( isEmpty() ) {	
			start = newNode;
			return;
		}
		
		Node temp = start;
		newNode.next = temp;
		start = newNode;
		
	}
	
	public void insertAtIndex(int data, int index) {
		
		Node temp = start;
		Node newNode = new Node(data);
		
		if( isEmpty() && index == 0 ) {	
			start = newNode;
			return;
		}
		
		if( isEmpty() && index != 0 ) {	
			IBIO.output("The linked list is empty and you have specified an index that is not 0. To add an element to the list, please specify an index of 0!");
			return;
		}
		
		if (!isEmpty() && index == 0) {
			temp = start;
			newNode.next = temp;
			start = newNode;
			return;
		}
 		
		int indexLength = 0;
		
		while( temp.hasNext() ) {	
			temp = temp.next;
			indexLength++;
		}
		//System.out.println("The length (starting from 0) is : " + indexLength);
		
		if (indexLength + 1 == index) {
			temp.next = newNode;
			return;
		}
		
		if (index > indexLength + 1) {
			IBIO.output("This index exceeds the list length (if you want to add to the end, your index should be list length (starting from 1). The index length starting from 0 is only : " + indexLength);
			return;
		}
		
		if (index < 0) {
			IBIO.output("Index value inputted cannot be negative, c'mon man!");
			return;
		}
		
		int counter = 0;
		
		temp = start;
		
		while( counter < (index-1) ) {	
			temp = temp.next;
			//IBIO.output("Ok");
			counter++;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
		
	}
	
	public void append(int data) {	
		
		Node newNode = new Node(data);
		if( isEmpty() ) {	
			start = newNode;
			return;
		}
		
		Node temp = start;
		// while( temp.next != null ) // also, ...
		
		while( temp.hasNext() ) {	
			temp = temp.next;
		}
		
		temp.next = newNode;
		
	}
	
	public void printList() {	
		
		if( isEmpty() ) {	
			System.out.println("List is empty");
			return;
		}
		
		Node temp = start;
		System.out.print("Start -> ");
		
		while(temp != null) {	
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
		System.out.println(); //" <- End");
	}
	
	public boolean remove(int element) {
		
		if( isEmpty() == true ) {	
			System.out.println("ERROR - List is empty.");
			return false;
		}
		
		if( element == start.data ) {	
			start = start.next;
			return true;
		}
		
		Node temp1 = start;
		Node temp2 = start.next;
		
		while(temp2 != null) {	
			
			if(temp2.data == element) {	
				temp1.next = temp2.next;
				return true; // removing this does something!
			}
			
			temp1 = temp1.next;
			temp2 = temp2.next;
			
		}
		
		return false;
	}
	
}

