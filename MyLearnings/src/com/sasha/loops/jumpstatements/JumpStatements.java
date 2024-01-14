package com.sasha.loops.jumpstatements;

public class JumpStatements {

	public static void main(String[] args) {
		
		int i = 0;
		
		// Example of continue 
		// continue means without executing the statements below in present iteration - go back to start of next iteration
		
		do {
		
			if (i % 2 == 0 ) {
				continue;
			}
			
			System.out.println("Value of i is: " + i);			// This code will not execute for even numbers
																// these lines are skipped as continue got executed
			
		} while ( i++ <= 100 );
		
	}

}
