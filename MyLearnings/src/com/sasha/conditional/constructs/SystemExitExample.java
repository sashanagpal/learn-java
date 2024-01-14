package com.sasha.conditional.constructs;

public class SystemExitExample {

	public static void main(String[] args) {

		if (args[0] == "0") {
			
			System.out.println("Normal Exiting");
			System.exit(0);
			
		} else if ( Integer.parseInt(args[0]) > 1 ) {
			
			System.out.println("Abnormal Exiting");
			System.exit( Integer.parseInt(args[0]) );
			
		} else {
			
			System.out.println("No input provided, closing program!");
		}
		

	}
}
