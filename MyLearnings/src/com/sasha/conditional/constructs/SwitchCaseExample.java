package com.sasha.conditional.constructs;

// https://www.javatpoint.com/java-switch

public class SwitchCaseExample {

	public static void main(String[] args) {
		
		
		// Fall through Example
		
		int z = 1;
		
		switch( z ) {							// Using for int, can also be used for long, double, float etc.
		
			case 1:													
				System.out.println("Value is 1");
			case 2:													
				System.out.println("Value is 2");
			case 3:													
				System.out.println("Value is 3");
			case 4:													
				System.out.println("Value is 4");
			default:												
				System.out.println("Dont know the Value");
			
		}
		
		// Because of fall through, this printed Value is 1, Value is 2, Value is 3 and Value is 4 and Dont know the value everything
		// It is fall through all the cases even when only the first case was true
		
		
		// To avoid fall through use break in each case 
		
		
		int value = 10;
		
		switch( value ) {							// Using for int, can also be used for long, double, float etc.
		
			case 1:													// if value matches 1 then do this
				System.out.println("Value is 1");
				break;												// if value matches - break out of switch block from this line
				
			case 2:													// if value matches 2 then do this
				System.out.println("Value is 2");
				break;
				
			case 3:													// if value matches 3 then do this
				System.out.println("Value is 3");
				break;
			case 4:													// if value matches 4 then do this
				System.out.println("Value is 4");
				break;
			default:												// if none of above values match then do this
				System.out.println("Dont know the Value");
			
		}

		
		// Giving a break in case is very important
		// Otherwise it will execute the case statements below too
		// for default last condition break is not necessary as switch-case block ends there
		
		
		String s = "3";
		
		switch( s ) {							// Using for String
		
			case "1":
				System.out.println("Value is 1");
				break;
			case "2":
				System.out.println("Value is 2");
				break;
			case "3":
				System.out.println("Value is 3");
				System.out.println("Now breaking out of switch case");
				break;
			case "4":
				System.out.println("Value is 4");
				break;
			default:
				System.out.println("Dont know the Value");
			
		}
		
	}

}
