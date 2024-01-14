package com.sasha.inputparams;

public class ParameterizedMethod {

	public static void main( String[] args ) {

		String fullName = "";
		
		// Lets use the arguments passed by user - they get collected in String[] args

		if (args.length > 1 ) {
			
			fullName = args[0] + " " + args[1];
			
		} else {
			
			// Note: use of system.err instead of system.out
			System.err.println( "ERROR: You did not pass me two arguments/ parameters " );	
			System.exit( 0 );		// exit the program from here since there is a error
		}

		System.out.println( "Your full name is: " + fullName );

	}
}
