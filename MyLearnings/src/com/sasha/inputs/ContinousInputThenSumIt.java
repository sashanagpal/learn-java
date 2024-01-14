package com.sasha.inputs;

import java.util.*;

public class ContinousInputThenSumIt {

	  public static void main(String[] args) {

	    // Initialise scanner object to take input
	    Scanner scanner = new Scanner( System.in );
	    
	    // Initialize sum to 0
	    int sum = 0;

	    // Check if next token is of int data-type or int  value is available in input stream
	    // If anything else is entered then sum all numbers given and exit
	    
	    System.out.println("Enter number: ");
	    while ( scanner.hasNextInt() ) {

	      // Read int value
	      int number = scanner.nextInt();
	      sum += number;

	      System.out.println("Enter number: ");
	    }

	    System.out.println("Sum: " + sum);

	  }
	
}
