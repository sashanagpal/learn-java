package com.sasha.inputparams;

public class NonParameterizedMethod {

	public static void main(String[] args) {

		// Nothing is passed as arguments/ parameters here, we are just printing the 
		// fullName by concatenating of firstName and lastName declared here itself and printing that
		// concatenating means joining two or more strings
		
		String firstName = "Sasha", lastName = "Nagpal", fullName = "";

		fullName = firstName + " " + lastName;
		
		System.out.println( "Your full name is: " + fullName );

	}
}
