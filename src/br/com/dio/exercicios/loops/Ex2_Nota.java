package br.com.dio.exercicios.loops;
import java.util.Scanner;

/*
Create a program that takes a grade between 0 and 10.
Show a message if the grade is invalid and
keep asking the grade until a valid value is informed.
*/
public class Ex2_Nota {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	while(true) {
    		System.out.println("Type a grade: ");
    		int grade = scan.nextInt();
    		if (grade < 0 || grade > 10) {
    			System.out.println("Invalid grade.");
    		} else {
    			break;
    		}
    	}
    	scan.close();
    }

}
