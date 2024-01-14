package com.sasha.inputs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromTxtFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Scanner scanner = new Scanner( System.in );				// when reading input from command line 

		Scanner scanner = new Scanner( new File("tasks.txt") );		// when reading input from txt file
		 
		while ( scanner.hasNext() ) {
		    String line = scanner.nextLine();
			System.out.println( line );
		}
		 
		scanner.close();
		
	}
}
