package br.com.dio.exercicios.arrays;
/*
Develop a program that reads a vector of size 6 and
say how many consonants were read.
Print the consonants.
*/

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int consonantsQty = 0;
        
        String[] consonants = new String[6];
        
        for(int i = 0; i < consonants.length; i++) {
        	System.out.println("Type a letter: ");
        	String letter = scan.next();
        	
        	//ignora se for maiúsculo ou minúsculo
        	if (!(letter.equalsIgnoreCase("a") 
        			|| letter.equalsIgnoreCase("e")
        			|| letter.equalsIgnoreCase("i") 
        			|| letter.equalsIgnoreCase("o")
        			|| letter.equalsIgnoreCase("u"))) {
        		
        		consonants[i] = letter;
        		consonantsQty++;
        	}	
        }
        
        System.out.println("Consonants: ");
        for (String consonant : consonants) {
        	if(consonant != null) {
        		System.out.println(consonant + " ");    		
        	}
		}
    	
        System.out.println("Consonants Quantity: " + consonantsQty);
        
        scan.close();
    
    }

}
