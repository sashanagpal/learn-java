package com.sasha.inputparams;

public class PrintingArgumentsToMainMethod {

	public static void main(String[] args) {
		
		System.out.println("The parameters to main method that you passed are: ");
		for (int i = 0; i < args.length; i++) {
			System.out.println( i + " -> " + args[i] );
		}

	}

}
