package com.sasha.conditional.constructs;

public class NotConditions {

	public static void main(String[] args) {
		
		
		String name = "Dimpy";
		
		// Remember that for String we cannot use == 
		// We have to use .equals method as String is a class and we are creating objects
		// ==  does a comparison of memory location
		// .equals() method does a comparison of value inside the object
		
		if ( name.equals("Dimpy") ) {				// Simple Condition
			
			System.out.println("Name is Dimpy");
		} 
		
		
		if ( ! name.equals("Chea") ) {				// Not condition, just put a exclamation mark before condition
			
			System.out.println("Name is not Chea");
		}
		
		// Checking boolean condition
		
		boolean value = true;

		if ( value == true ) {
			System.out.println("Its true");
		} else {
			System.out.println("Its false");
		}

		// if (value == true) can also be written as if (value) 
		if (value) {
			System.out.println("Its true");
		} else {
			System.out.println("Its false");
		}
		
		// False boolean condition
		
		if (value == false) {
			System.out.println("Value is false");	
		}
		
		// OR use the exclamation operator for NOT condition
		
		if ( !value ) {
			System.out.println("Value is false");
		}

	}

}
