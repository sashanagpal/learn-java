package com.sasha.inputs;

import java.util.*;

public class MergeWords {

	public static void main(String[] args) {

		String line1, line2, mergedLine; 				// Collective declaration of String, no Initialization done here

		Scanner scanner = new Scanner(System.in); 		// Create Scanner object,
														// pass System.in as we are taking inputs from System
		System.out.println(); 							// Leave a blank line

		System.out.print("Please enter line 1 : "); 	// read the first line
		line1 = scanner.next(); 						// scanner.next() reads as a String word only

		System.out.print("Please enter line 2 : "); 	// read the second line
		line2 = scanner.next(); 						// scanner.next() reads as a String word only

		mergedLine = line1 + " " + line2; 				// add the two inputs into variable mergedLine

		System.out.println(); 							// Leave a blank line

		System.out.print("Merged line is " + mergedLine); // print contents of mergedLine

		scanner.close();
		
		// Observations:
		// If you enter two words in the first line itself. It won't ask you for the 2nd input.
		// It takes the 2nd word of first line as the 2nd input
		// If you enter three or more words in the first line itself. It will just pick up 2 words
		// 3rd, 4th onwards all extra words are ignored
		// If you want to read a full line - use the nextLine() method instead of next() method 

	}

}
