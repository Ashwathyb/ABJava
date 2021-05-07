/*
 * Reverse.java
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


public class Reverse {
	
	public static void main (String[] args) {
		
		int input = IBIO.inputInt("Enter a number you wish to reverse : ");
		int i10 = input;
		int r10;
		
		for(; i10 > 0;) {
			r10 = i10 % 10;
			i10 = i10 / 10;
			System.out.print(r10);
		}
		
		int n = IBIO.inputInt("\nEnter a positive integer you wish to do 1 + 1/2 + 1/3 + .... + 1/n to : ");
		Double answer = 0.0;
		
		for(int i = 1; i <= n; i++) {
			answer = 1.0 / i + answer;
		}
		
		System.out.println("The answer is : " + answer);
		
	}
}

