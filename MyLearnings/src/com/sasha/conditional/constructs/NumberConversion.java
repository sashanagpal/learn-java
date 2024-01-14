package com.sasha.conditional.constructs;

public class NumberConversion {

	public static void main(String[] args) {
		
		String x = "10";
		
		int i = 0;
		long l = 0;
		double d = 0;
		
		// i = x 					//	Cannot do this as x is a string and i is a int
		
		i = Integer.parseInt( x );	//  So use the function Integer.parseInt() to convert to Integer
									
		// Similarly you have Float.parseFloat, Double.parseDouble
		
		l = Long.parseLong( x );
		
		d = Double.parseDouble( x );
		
		System.out.println( "Value of i is " + i );
		System.out.println( "Value of l is " + l );
		System.out.println( "Value of d is " + d );
		
		// Storing int/long/double to String - use String.valueOf() function
		
		// String y = d;					// won't work as y is String and d is double
		
		String z = String.valueOf( d );

	}

}
