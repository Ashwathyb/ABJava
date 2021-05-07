/*
 * ArrayChallenge2.java
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

public class ArrayChallenge2 {
	
	public static int oddCount(int[] a) {
		
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] % 2 != 0) 
				count ++;
			
		}
		
		return count;
		
	}
	
	public static boolean checkIfSame(int[] a, int[] b) {
		
		if (a.length != b.length)
			return false;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] != b[i]) {
				return false;
			}
			
		}
		
		return true;
		
	}
	
	public static int checkFrequency(int[] a, int n) {
		
		int frequency = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] == n) {
				frequency++;
			}
			
		}
		
		return frequency;
		
	}
	
	public static int[] removeElement(int[] a, int n) {
		
		int placeholder = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] == n) {
				
				for (int j = i; j < a.length-1; j++) {
					a[j] = a[j + 1];
					break;
				}
				
			}
			
		}
		
		a[a.length-1] = 0;
		return a;
		
	}
	
	
	public static int getSecondLargestElement(int[] a) {
		
		int max = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			if (max < a[i])
				max = a[i];
			
		}
		
		int max2 = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] == max)
				i++;
				
			if (max2 < a[i]) 
				max2 = a[i];
			
		}
		
		return max2;
		
	}

	
	public static void main (String[] args) {
		
		int[] array = { 9,8,7,6,5,4,3,2,1 };
		int[] array2 = { 9,8,7,6,5,4,3,2,1, 0 };
		
		int oddC = oddCount(array);
		IBIO.output("The number of odd numbers in the array is : " + oddC);
		
		boolean boolSame = checkIfSame(array, array2);
		IBIO.output("True if two arrays are same : " + boolSame);
		
		int freq = checkFrequency(array, 7);
		IBIO.output("Frequency of 7 is : " + freq);
		
		int[] removeArrayElement = removeElement(array, 4);
		System.out.println("The Removed element Array Is : " + Arrays.toString(removeArrayElement) ); 
		
		int secondLargestElement = getSecondLargestElement(array);
		IBIO.output("The second largest element in the array is : " + secondLargestElement);
		
	}
	
}

