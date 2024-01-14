package com.sasha.inputs;

import java.util.Scanner;

class MergeCharacters{
    
    public static void main (String[] args){
     
        char char1, char2, char3;
        String mergedWord;
            
        Scanner scanner = new Scanner( System.in );
        
        System.out.println(" ");
        
        System.out.print("Enter first character : ");
        char1 = scanner.next().charAt( 0 );
        
        System.out.println(" ");
        
        System.out.print("Enter second character : ");
        char2 = scanner.next().charAt( 0 );
    
        System.out.println(" ");
        
        System.out.print("Enter third character : ");
        char3 = scanner.next().charAt( 0 );
        
        mergedWord = "" +char1 + char2 + char3;
        
        System.out.println(" ");
        
        System.out.println("Your merged word is : " + mergedWord );
        
        System.out.println(" ");
        
        scanner.close();				// always close the scanner
        
    }
}