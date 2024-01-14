package com.sasha.inputs;

import java.util.Scanner;

public class WorkWithScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		
		// Read a Line of Text Using Scanner
		System.out.println( "Accepting a line now " );
		String line = scanner.nextLine();
		System.out.println( "The line is: " + line );
		
		// Read a word from the user
		System.out.println( "Accepting a word now ( if you enter two words separated by space, the next code will be executed too ) " );
		String word = scanner.next();
		System.out.println( "The word is: " + word );
		
		// Read just a char from the user
		System.out.println( "Accepting a character now " );
		char char1 = scanner.next().charAt(0);
		System.out.println( "The character is: " + char1 );
		
		// Continously accept a word
		System.out.println( "Continous acceptance of word, till you enter word exit" );
		while ( scanner.hasNext() ) {
			
			word = scanner.next();
			System.out.println( word );
			
			if (word.equalsIgnoreCase( "exit" )) {
				break;
			}
			
		}
		
		// Working with Delimeter
		scanner.useDelimiter( ":" );
		System.out.println( "Enter a word ( this time word ends with delimeter as : )" );
		word = scanner.next();
		System.out.println( "Word you entered is: " + word );

		/*
		 * Accepting different data types with Scanner
		 * 
		nextBoolean()	Reads a boolean value from the user
		
		nextByte()	Reads a byte value from the user
		
		nextDouble()	Reads a double value from the user
		
		nextFloat()	Reads a float value from the user
		
		nextInt()	Reads a int value from the user
		
		nextLine()	Reads a String value from the user
		
		nextLong()	Reads a long value from the user
		
		nextShort()	Reads a short value from the user
		
		*/
		
		System.out.println( "Enter a boolean value: " );
		Boolean b = scanner.nextBoolean();
		System.out.println( "Value entered is: " + b);
		
		System.out.println( "Enter a long value: " );
		Long l = scanner.nextLong();
		System.out.println( "Value entered is: " + l);
		
		System.out.println( "Enter a float value: " );
		Float f = scanner.nextFloat();
		System.out.println( "Value entered is: " + f);

	}

}
