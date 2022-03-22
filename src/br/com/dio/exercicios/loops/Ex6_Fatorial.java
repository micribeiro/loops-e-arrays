package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Create a program that calculates the factorial of a number given by the user.
Example: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Factorial: ");
    	int factorial = scan.nextInt();
    	int multiplication = 1;
    	
    	for(int i = factorial; i > 0; i--) {
    		multiplication = multiplication*i;
    	}
    	
    	System.out.println(factorial + "! = " + multiplication);
    	scan.close();
    }

}
