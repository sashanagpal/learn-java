package com.sasha.inputs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromCsvFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner( new File("books.csv") );
		scanner.useDelimiter(",");
		 
		while ( scanner.hasNext() ) {

		    String title = scanner.next();			// Read Book Name - comma separated word, not whitespace separated

		    title = title.trim();   

		    String author = scanner.next();			// Read Author Name 
		    
		    float price = scanner.nextFloat();		// Read Price of the Book
		 
		    System.out.format( "Title: %s; Author: %s; Price: %.2f %n", title, author, price);	// %.2f - 2 decimal point float number
		    																					// %n is for new line
		}

		
	}
}
