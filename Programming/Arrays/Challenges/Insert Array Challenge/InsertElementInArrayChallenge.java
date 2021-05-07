/*
 * InsertArrayChallenge.java
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

public class InsertElementInArrayChallenge {
	
	private static int lastIndex = 0;

	public static boolean checkIfFull(int[] a) {
		if (a.length >= 2) {
			return (a[a.length-1] != 0);
		}
		return true;
	}
	
	public static int getLastIndex(int[] a) {
		if (a.length >= 2) {
			lastIndex = a.length - 1;
			for (int i = 1; i < a.length; i++) {
				if (a[i] == 0) {
					lastIndex = i-1;
				}
			}
			return lastIndex;
		}
		return lastIndex;
	}

	public static int[] insertElement(int[] a, int ii, int p) {

		lastIndex = getLastIndex(a);
		IBIO.output("The last index is : " + lastIndex);

		if (checkIfFull(a)) {

			IBIO.output("The array is full!!!");
			int[] a2 = new int[a.length + 1];
			
			for (int i = lastIndex; i >= p; i--) {
				a2[i+1] = a[i];
			}
			a2[p] = ii;
			if (p != 0) {
				for (int i = 0; i < p; i++) {
					a2[i] = a[i];
				}
			}
			return a2;
		
		}

		for (int i = lastIndex; i >= p; i--) {
			a[i+1] = a[i];
		}
		a[p] = ii;
		return a;
	}
	
	public static void main (String[] args) {
		
		int[] array = { 9,8,7,6,5,4,3,2,0 };
		//int[] array = { 9,8,0,0,0,0,0,0,0 };
		//int[] array = { 9,0,0,0,0,0,0,0,0 };
		//int[] array = { 0,0,0,0,0,0,0,0,0 };
		//int[] array = { 9,8,7,6,5,4,3,2,1 };

		System.out.println("The Current Array Is : " + Arrays.toString(array)); 
		
		int inputInt = IBIO.inputInt("Enter the integer that you want to insert : "); 
		int position = IBIO.inputInt("Enter the position you want to insert this integer in : "); 
		
		int[] outputArray = insertElement(array, inputInt, position);
		
		System.out.println("The newly formatted array is : " + Arrays.toString(outputArray)); 
		
	}
	
}

