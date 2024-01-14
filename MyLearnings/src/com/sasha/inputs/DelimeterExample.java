package com.sasha.inputs;

import java.util.Scanner;

public class DelimeterExample {
	
	// Delimeter means the character that separates two words - by default it is white space 
	// We can change the delimeter to what we want

	public static void main(String[] args) {

		String line1; 				

		Scanner scanner = new Scanner( System.in ); 
		scanner.useDelimiter(":");						// Delimeter i.e. word separator is a : now 
														// and not whitespace
														
		System.out.println(); 							// Leave a blank line

		System.out.print("Please enter the line: "); 	// read the first line
		line1 = scanner.next(); 						// will keep reading as single word till you enter a :					

		System.out.println( line1 ); 							

		System.out.println( scanner.next() );			// if you entered 2 colons in first next() above, then this is not read 							
		System.out.println( scanner.next() ); 			// if you entered 3 colons in first next() above, then this is not read
		
		scanner.close();

		// Observation: Now if you enter as Hello There How Are You - all of this is a single word ( This is a single word now )
		// To enter as different words you have to enter as Hello:There:How:Are:You ( These are 5 words now )
	}
	
	/*
	 
	 [ OUTPUT ] - When using : after setting delimeter as : and entering :s in your input to program

	 Please enter the line: Hello:There:How:Are:You
	 Hello
	 There
	 How

	 [ OUTPUT ] - When using : after setting delimeter as : and not entering : in your input to program
	 
	 Please enter the line: Hello There How Are You
	 program keeps running, as the word has not ended here, word ends only when we enter : and since there is no colon
	 java is thinking you are still entering the first word
	 program will end as soon as you enter the : here 


	 */

}
