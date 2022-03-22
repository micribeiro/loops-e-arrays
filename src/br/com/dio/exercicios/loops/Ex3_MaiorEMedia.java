package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Create a program that reads 5 numbers and
show the highest number
and the average.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int number;
    	int sum = 0;
    	int highest = 0;
    	int count = 0;
    	
    	do {
    		System.out.println("Type a number: ");
    		number = scan.nextInt();
    		sum = sum + number;
    		
    		if (number > highest) highest = number;
    		count++;
    		
    	} while (count < 5);	
    	
    	System.out.println("Highest number: " + highest);
    	System.out.println("Sum: " + sum);
    	System.out.println("Average: " + (sum/5));
    	
    	scan.close();
    	}
    	
    }

