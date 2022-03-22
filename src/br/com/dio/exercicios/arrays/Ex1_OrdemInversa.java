package br.com.dio.exercicios.arrays;
/*
Create a vector of 6 integer numbers
and show them in reverse order.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
    	
    	int [] vetor = {4, 6, 10, -6, -19, 90};
    	
    	System.out.println("Inverse list: ");
    	for(int i = vetor.length - 1; i >= 0; i--) {
    		System.out.print(vetor[i] + " ");
    	}
    	
    	System.out.println("\n");
    	
    	int count = 0;
    	while(count < vetor.length - 1) {
    		System.out.println(vetor[count]);
    		count++;
    	}    	    	   	
    }
}
