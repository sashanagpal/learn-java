package com.sasha.inputparams;

public class ParameterizedMethodToSumArguments {

	public static void main( String[] args ) {

		int sum = 0;
		
		// Lets use the arguments passed by user - they get collected in String[] args
		
		for ( int i = 0; i <= args.length; i++ ) {
			sum = sum + Integer.parseInt( args[ i ] );		// by default the args come as String, so convert to int
		}

		System.out.println( "The sum of the two numbers is: " + sum );

	}
}
