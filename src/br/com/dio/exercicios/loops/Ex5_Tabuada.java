package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Develop a multiplication table generator.
The user must type a number and the multiplication table must appear.
The output must be like the example below:

Multiplication table of 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class Ex5_Tabuada {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Which multiplication table do you want to see?");
    	int multTable = scan.nextInt();
    	
    	System.out.println("Multiplication table of " + multTable + ":");
    	
    	for(int i = 0; i <= 10; i++) {
    		System.out.println(multTable + " X " + i + " = " + multTable*i);
    	}
    	
    	scan.close();
    }

}
