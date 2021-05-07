/*
 * CalculateBigPowers.java
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


public class CalculateBigPowers {
	
	public static void main (String[] args) {
		
		long input = IBIO.inputInt("Enter the base you wish to input : ");
		long exponent = IBIO.inputInt("Enter the exponent : ");
		long value = 1;
		
		for (long i = 1; i <= exponent; i++) {
			
			value = input * value;
			
		}
		
		System.out.println("The value is : " + value);
		
	}
	
}

