package com.sasha.loops;

public class WhileAndDoWhileLoop {

	public static void main(String[] args) {
		
		int i = 0;
		
		System.out.println("Executing the while loop now!!");
		while ( i <= 10 ) {											// Condition check is done first
			System.out.println("Value of i is " + i);				// then the logic executes if condition is true
			i++;
		}
		System.out.println("\r\n\r\n");
		
		i = 0;
		System.out.println("Executing the do while loop now!!");
		do {
			System.out.println("Value of i is " + i);				// Execute the logic first in first iteration
			i++;
		} while( i <= 10 );											// Condition check is done later

		System.out.println("\r\n\r\n");

		boolean booleanValue = false;
		
		while ( booleanValue ) {									// This won't get in as condition is false
			
			System.out.println("Value of boolean is" + booleanValue + " and I got in the while loop!!!");
		}
		
		System.out.println("\r\n\r\n");

		do {														// This will get in even though condition is false
																	// because condition is checked later in every iteration
			
			System.out.println("Value of boolean is" + booleanValue + " and I got in the do while loop!!!");
			booleanValue = false;
			
		} while ( booleanValue );
		
	}

}
