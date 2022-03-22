package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Create a program that takes N integer numbers,
Calculate and show even and odd numbers quantity.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How many number do you want to type?");
        int numbersQty = scan.nextInt();
        int count = 0;
        int evenQty = 0;
        int oddQty = 0;
        
        do {
        	
        	System.out.println("Number: ");
        	int number = scan.nextInt();
        	
        	if (number % 2 == 0) evenQty++;
        	else oddQty++;
        	
        	count++;
        	
        } while (count < numbersQty);
    	
    	System.out.println("Even numbers quantity: " + evenQty);
    	System.out.println("Odd number quantity: " + oddQty);
    	scan.close();
    }
}
