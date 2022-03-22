package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Create a program that that reads 2 values,
a name and an age.
(Break the program when inserting "0" on name field)
*/
public class Ex1_NomeEIdade {
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	String name;
    	int age;
    	
    	while (true) {
    		System.out.println("Name: ");
    		name = scan.next();
    		if (name.equals("0")) {
    			break;
    		} else {
    		System.out.println("Age: ");
    		age = scan.nextInt();
    		}
    	}
    	
    	System.out.println("Finished");
    	
    	scan.close();
	}
}
