package com.sasha.inputs;

import java.util.*;

public class MergeLines {

	public static void main(String[] args) {

		String line1, line2, mergedLine; 				// Collective declaration of String, no Initialization done here

		Scanner scanner = new Scanner(System.in); 		// Create Scanner object,
														// pass System.in as we are taking inputs from System
		System.out.println(); 							// Leave a blank line

		System.out.print("Please enter line 1 : "); 	// read the first line
		line1 = scanner.nextLine(); 					// scanner.next() reads as a String the full Line entered

		System.out.print("Please enter line 2 : "); 	// read the second line
		line2 = scanner.nextLine(); 					// scanner.next() reads as a String the full Line entered

		mergedLine = line1 + " " + line2; 				// add the two inputs into variable mergedLine

		System.out.println(); 							// Leave a blank line

		System.out.print("Merged line is " + mergedLine); // print contents of mergedLine
		
		scanner.close();

	}

}
