/*
 * SortMinToMax1Array.java
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

public class SortMinToMax1Array {
	
	public static void main (String[] args) {
		
		
		int input = IBIO.inputInt("How many random numbers do you want to input into an array : ");
		
		int[] randomArray = new int[input];
				
		for (int i = 0; i < input; i++) {
			
			int randomInt = (int)(Math.random()*10000);
			randomArray[i] = randomInt;
			
		}
	
		System.out.println("The Random Array Is : " + Arrays.toString(randomArray)); 
		
		
		/*
		int input = 6;
		
		int[] randomArray = new int[input];
		randomArray[0] = 10;
		randomArray[1] = 9;
		randomArray[2] = 8;
		randomArray[3] = 7;
		randomArray[4] = 6;
		randomArray[5] = 5;
		
		System.out.println("The Random Array Is : " + Arrays.toString(randomArray)); 
		*/
		
		int min = 0;
		int placeholderI = 0;
		  
		for (int i = 0; i < input; i++) {
			
			min = randomArray[i];
			placeholderI = randomArray[i];
			int placeholderF = 0;
			
			for (int f = i+1; f < input; f++) {
			  
			  if (randomArray[f] < min) {
				min = randomArray[f];
				placeholderF = f;
			  }
			  
			}
			
			randomArray[i] = min;
			if (placeholderF != 0) {
				randomArray[placeholderF] = placeholderI;
			}
			
			System.out.println("The Interim Array Is : " + Arrays.toString(randomArray)); 
								
		}
	
		//System.out.println("The Sorted Array Is : " + Arrays.toString(randomArray));
		
	}
	
}

