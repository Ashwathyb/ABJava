/*
 * MultiplicationTables.java
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


public class MultiplicationTables {
	
	public static void main (String[] args) {
		
		System.out.println("Anshul Jhingan");
		int input = 0;
		//int errorCount = 0;
		
		
		do {
			
			input = IBIO.inputInt("Enter an integer between 1 and 9 : ");
			
			while ( (input < 1 || input > 9) && input != 0) {
				System.out.print("Error- ");
				input = IBIO.inputInt("Enter an integer between 1 and 9 : ");
			}
			
			if (input >= 1 && input <= 9) {
			
				for (int i = 1; i <= input; i++) {
				
					for (int f = 1; f<= 20; f++) {
						
						System.out.print(i);
						System.out.print(" X ");
						
						if (f < 10) {
							System.out.print(" " + f);
						} else {
							System.out.print(f);
						}
						System.out.print(" = ");
						
						int product = f * i;
						if (product < 10) {
							System.out.println("  " + product);
						} else if (product >= 10 && product < 100) {
							System.out.println(" " + product);
						} else {
							System.out.println(product);
						}
						
					}
					
					System.out.println("------------");
							
				}	
			
			}
			
		} while (input != 0);

		
	}
}

