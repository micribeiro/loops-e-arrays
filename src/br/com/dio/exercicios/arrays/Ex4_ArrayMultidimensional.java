package br.com.dio.exercicios.arrays;

import java.util.Random;

/*
Generate and print a matrix M 4x4 with random values between 0 and 9.
*/
public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        
        int [][] M = new int[4][4];
        
        for (int i = 0; i < M.length; i++) {
        	for (int j = 0; j < M[i].length; j++) {
        		M[i][j] = random.nextInt(9);
        	}
        }
    	
        System.out.println("Matrix: ");
        for (int[] line : M) {
			for (int column : line) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
    }


}
