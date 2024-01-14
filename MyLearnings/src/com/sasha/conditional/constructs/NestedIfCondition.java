package com.sasha.conditional.constructs;

import java.util.Scanner;

public class NestedIfCondition {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the fruit name: ");
		String fruitName = sc.nextLine();
		
		System.out.println("Enter the fruit color: ");
		String fruitColor = sc.nextLine();
		
		if ( fruitName.toLowerCase().equals("apple") ) {
			
			System.out.println("Its a Apple");
			
			if ( fruitColor.toLowerCase().equals("red") ) {			// nested if
				
				System.out.println("Its red in color");
				
			} else {											// else of nested if - see the blocks
				
				System.out.println("Its not red in color");
				
			}
			
		} else {												// else of outer if
			
			System.out.println("Its NOT a Apple");
			
		}
		
	}

}
