package com.sasha.loops.jumpstatements;

public class BreakExample {

	public static void main(String[] args) {
		
		// for loop
		for (int i = 1; i <= 10; i++) {
			
			if (i == 5) {

				break;		// loop ends here, no more iterations in loop now even when i did not reach 10
			}
			
			System.out.println( i );
		}
	}
}
