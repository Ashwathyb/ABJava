/*
 * RippleSortMaxToMin.java
 * 
 * Copyright 2020 Ansh <ansh@10-72-127-176.wifi.8.s.pas.ofs.edu.sg>
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

public class RippleSortMaxToMin {
	
	public static void main (String[] args) {
		
		int input = IBIO.inputInt("How many random numbers do you want to input into an array : ");
		
		int times = IBIO.inputInt("How many times do you want to generate and sort this array of random numbers : ");
		
		long sortTotalTime = 0;

		for (int f = 1; f <= times; f++) {
			
			int[] randomArray = new int[input];
		
			long startTime1 = System.currentTimeMillis();
			
			for (int i = 0; i < input; i++) {
				
				int randomInt = (int)(Math.random()*10000);
				randomArray[i] = randomInt;
				
			}
			
			long endTime1 = System.currentTimeMillis();
			long totalTime1 = endTime1 - startTime1;
			//System.out.println("Total time taken (in milliseconds) to generate an array of random numbers is : " + totalTime1);
				 
			//System.out.println("The Random Array Is : " + Arrays.toString(randomArray));
			
			int max = 0;
			int placeholder = 0;
			int placeholder2 = 0;
			int ctr = 0;
			boolean did_sort = false;
						
			long startTime2 = System.currentTimeMillis();
			
			for (int i = 1; i <= (input - 1); i++) {
				
				did_sort = false;
				
				for (int e = 0; e < (input -1 -ctr); e++) {
					
					if (randomArray[e+1] > randomArray[e]) {
						
						placeholder = randomArray[e+1];
						randomArray[e+1] = randomArray[e];
						randomArray[e] = placeholder;
						did_sort = true;
					}
					
				}
				
				ctr++;
				
				//System.out.println("The Interim Sorted Array Is : " + Arrays.toString(randomArray));
				
				if (did_sort == false) {
					break;
				}
				
			}
			
			long endTime2 = System.currentTimeMillis();
			long totalTime2 = endTime2 - startTime2;
			sortTotalTime = sortTotalTime + totalTime2;
			System.out.println("Total time taken (in milliseconds) to generate the sorted array is : " + totalTime2);
			
			//System.out.println("The Sorted Array Is : " + Arrays.toString(randomArray));
			
		}
		
		System.out.println("The average time taken to generate the sorted array is : " + (sortTotalTime/times) );
		
	}
	
}

