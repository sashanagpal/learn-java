package com.sasha.loops;

import java.util.Scanner;

public class DoWhileLoop {

	static String userInput = new String();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		
		do {
		
			myGame();											// First I want the user to play the game once
			
			System.out.println("Do you want to continue");		// Then ask whether he wants to play again
			userInput = sc.nextLine();
		
		} while (userInput.trim().equalsIgnoreCase("y"));
		
		System.out.println("Do While testing is complete \r\nNow testing with the while loop \r\n ");
		
		// The other way using while loop, make the variable as y first
		userInput = "y";
		
		while (userInput.trim().equalsIgnoreCase("y")) {
			
			myGame();											// First I want the user to play the game once
			
			System.out.println("Do you want to continue");		// Then ask whether he wants to play again
			userInput = sc.nextLine();			
		}
		
	}
	
	public static void myGame() {
		System.out.println("You are into the game");
		// Some logic for the game
		System.out.println("Game Ends!!!");
	}
	
	
	

}
