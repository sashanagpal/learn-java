package com.sasha.inputs;

import java.util.Scanner;

class SimpleInterest{

    public static void main(String[] args){
        
        int principal, rateOfInterest, timePeriod, calculatedInterest;
        
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Hello welcome! Calculate your Simple Interest here ~~");
        
        System.out.print("Enter Principal : ");
        principal = scanner.nextInt();
        
        System.out.println(" ");
        
        System.out.print("Enter Rate of Interest : ");
        rateOfInterest = scanner.nextInt();
        
        System.out.println(" ");
        
        System.out.print("Enter Time Period : ");
        timePeriod = scanner.nextInt();
        
        calculatedInterest = ( principal * rateOfInterest * timePeriod )/ 100;
        
        System.out.println(" ");
        
        System.out.print("Simple Interest is : " + calculatedInterest + " and Amount becomes : " + ( principal + calculatedInterest ) );
    
    }
}