package br.com.dio.exercicios.arrays;

import java.util.Random;

/*
Develop a program that reads 20 integer random numbers (between 0 and 100), storage them inside 
a vector.
Finally show the numbers and their successors.
*/
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
     
    	int [] numbers = new int [20];
    	
    	Random random = new Random();
    	
    	for(int i = 0; i < numbers.length; i++) {
    		int randomNumber = random.nextInt(100);
    		numbers[i] = randomNumber;
    	}
    	
    	System.out.println("Random Numbers: ");
    	for (int randoms : numbers) {
			System.out.print(randoms + " ");
		}
    	
    	System.out.println("\nSuccessors: ");
    	for (int successors : numbers) {
			System.out.print((successors + 1) + " ");
		}
    	
    	
    	
    	
    	
    }

}
