/*
 * PapaProblem1.java
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
 
 /* The Problem :
  * 
 Input: "aaaabbbcca"
Output: [("a", 4), ("b", 3), ("c", 2), ("a", 1)]

Write a function that converts the input to the output

*/

import java.util.*;

public class PapaProblem1 {
	
	static int[] frequencyCounter(String s) {
				
		int[] frequency = new int[s.length() + 1];
		int counter = 0;
				
		for (int i = 0; i < s.length()-1; i++) {
			
			int placeholder = (int)s.charAt(i);
			int placeholder2 = (int)s.charAt(i+1);
			
			if (placeholder2 == placeholder) {
				frequency[counter] += 1;
			} else {
				frequency[counter] += 1;
				counter++;
			}
						
		}
		
		frequency[counter] += 1;
		frequency[counter + 1] = -1;
		return frequency;
		
	}
	
	static char[] letterHolder(String s) {
		
		char[] letter = new char[s.length()];
		int counter = 0;
				
		for (int i = 0; i < s.length()-1; i++) {
			
			char placeholder = s.charAt(i);
			char placeholder2 = s.charAt(i+1);
			
			if (placeholder2 == placeholder) {
				letter[counter] = placeholder;
			} else {
				letter[counter] = placeholder;
				counter++;
			}
						
		}
		
		letter[counter] = s.charAt(s.length()-1);
		return letter;
		
	}
	
	public static void main (String[] args) {
		
		String input = IBIO.inputString("Input: "); 
		
		int[] frequencyArray = frequencyCounter(input);
		char[] charArray = letterHolder(input);
		
		
		IBIO.out("Output: [");
		//Output: [("a", 4), ("b", 3), ("c", 2), ("a", 1)]
		
		int c = 0;
		
		while ( (frequencyArray[c] != -1) ) {
			
			if ( (frequencyArray[c + 1] != -1) ) {
				IBIO.out("(\"" + charArray[c] + "\", " + frequencyArray[c] + "), ");
			} else {
				IBIO.out("(\"" + charArray[c] + "\", " + frequencyArray[c] + ")]");
			}
			
			c++;
			
		}
		
	}
	
}

