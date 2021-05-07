/*
 * ArrayChallenge1.java
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

import java.util.*;

public class ArrayChallenge1 {
	
	static void reverseArray(int[] a) {
		
		int[] reversedArray = new int[a.length];
		
		int counter = a.length-1;
		
		for (int i = 0; i < a.length; i++) {
			
			reversedArray[i] = a[counter];
			counter--;
			
		}
		
		System.out.println("The Reversed Array Is : " + Arrays.toString(reversedArray)); 
		
	} 
	
	static void copyArray(int[] a) {
	
		int[] cloneArray = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
		
			cloneArray[i] = a[i];
			
		}
		
		System.out.println("The Cloned Array Is : " + Arrays.toString(cloneArray)); 
		
	}
	
	static void get2Elements(int[] a) {
		
		int[] twoArray = new int[2];
		
		twoArray[0] = a[0];
		twoArray[1] = a[a.length-1];
	
		System.out.println("The 2 Element Array (First and Last element) Is : " + Arrays.toString(twoArray)); 
		
	}
	
	static void getSumOfArray(int[] a) {
		
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			sum += a[i];
			
		}
		
		IBIO.output("The Sum Is : " + sum);
		
	}
	
	public static void main (String[] args) {
		
		int[] array = { 9,8,7,6,5,4,3,2,1 };
		
		System.out.println("The Array Is : " + Arrays.toString(array)); 
		copyArray(array);
		reverseArray(array);
		get2Elements(array);
		getSumOfArray(array);
		
	}

}

