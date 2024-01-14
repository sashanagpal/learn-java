package com.sasha.loops.jumpstatements;

public class ReturnStatement {

	public static void main(String[] args) {

		method1();

		System.out.println("\r\n");
		
		int var = method1();
		
		System.out.println( "Variable contains " + var );

		var = method2();
		
		System.out.println( "Variable contains " + var );
	}
	
	public static int method1() {
		
		System.out.println("\r\nInside method Method1");
		
		return 10;
	}
	
	public static int method2() {
	
		System.out.println("\r\nInside method Method2");
		
		int valueToReturn = method3();
		
		return valueToReturn;
	}
	
	public static int method3() {

		System.out.println("Inside method Method3");
		
		return 30;			// This will return to the calling method which is method2() not the main method
		
	}

}
