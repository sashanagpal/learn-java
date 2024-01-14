package com.sasha.conditional.postfixprefixoperators;

public class PlusPlusOperator {

	public static void main(String[] args) {

		int i = 0;
		
		if ( i++ == 1 ) {							// value of i is incremented after this statement is executed
			
			System.out.println("i is 1");
		}
		
		System.out.println("Value of i after the if condition is " + i );
		
		int j = 0;
				
		if ( ++j == 1 ) {							// value of i is incremented before this statement is executed
			
			System.out.println("j is 1");
		}
		
		System.out.println("Value of j after the if condition is " + i );

	}

}
