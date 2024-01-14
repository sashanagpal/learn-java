package com.sasha.conditional.constructs;

public class IfConditionExample1 {
	
	public static void main(String[] args) {
		
		int x = 10;
		
		// Simple if condition
		
		if ( x == 10 ) {

			System.out.println("Value of x is : 10");

		}
		
		// Simple if-else condition
		
		if ( x == 10 ) {

			System.out.println("Value of x is : 10");

		} else {

			System.out.println("Value of x is NOT 10");

		}
		
		x = 30;
		
		// Simple if-else-if condition and with multiple conditions joined
		
		if ( x < 0 ) {
			
			System.out.println("Value of x is LESS THAN 0");
			
		} else if ((x > 0) && (x < 10)) {
			
			System.out.println("Value of x is LESS THAN 10");
			
		} else if ((x >= 10) && (x < 20)) {
			
			System.out.println("Value of x is GREATER THAN EQUAL TO 10 but LESS THAN 20");
			
		} else {					// else is not mandatory here
			
			System.out.println("Value of x is GREATER THAN or EQUAL TO 20");
			
		}
		
		
	}
	

}
