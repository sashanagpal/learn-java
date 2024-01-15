package com.sasha.loops;

public class PrintTablesDoWhile {

	public static void main(String[] args) {

		/*
		 * This prints
		 * 
		 * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		 * 2, 4, 6, 8, 10, 12, 14, 16, 18, 20
		 * 3, 6, 9, 12, 15, 18, 21, 24, 27, 30
		 * . . . 
		 * 5, 10, 15, 20, 25, 30, 35, 40, 45, 50
		 */

		int i = 1, j = 1;
		
		do {
			
			j = 1;
			
			do {
			
				System.out.print( i * j );
				
				if (j < 10 ) {
					System.out.print( ", " );
				}
			} while (++j <= 10);
			
			System.out.println( "" );
			
		} while (++i <= 5);
		
	}

}
