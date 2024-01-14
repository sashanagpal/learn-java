package com.sasha.inputs;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		
		int firstNumber = 0;
		int secondNumber = 0;
		int sumOfTheTwo = 0;
		
		Scanner scanner = new Scanner( System.in );
		
		System.out.print("Please enter the first number: ");
		firstNumber = scanner.nextInt();							// the 1st number is read here
		
		System.out.println("");										// Leave a blank line 
		
		System.out.print("Please enter the second number: ");
		secondNumber = scanner.nextInt();							// the 2nd number is read here
		
		sumOfTheTwo = firstNumber + secondNumber;
		
		scanner.close();											// important to close the scanner
		
		System.out.println("");										// Leave a blank line 

		System.out.println( "Sum of the two numbers " + firstNumber + " and " + secondNumber + " is -> " + sumOfTheTwo );

	}

}
