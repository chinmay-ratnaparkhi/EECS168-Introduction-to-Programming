

/* -----------------------------------------------------------------------------
 *
 * File Name:  		Pyramid.java
 * Author: 			Chinmay Ratnaparkhi
 * Assignment:   	EECS-168/169 Lab 5
 * Description:		This program takes in a positive integer builds a pyramid of asterisks.
 * 
 * Date: March 7th 2013
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;
public class Pyramid {

	public static void main(String[] args){
		
		int base_num;
		//Create a scanner and store the input value in a variable as the maximum value for multiplication.
		Scanner keyboard= new Scanner(System.in);
		
		System.out.println("Please enter a positive integer as the base to build a pyramid :");
		base_num= keyboard.nextInt();
		//Since no more inputs are required, close the scanner.
		keyboard.close();
		
		for(int i=1; i<=base_num; i++){
			
			for(int j=1; j<=i; j++){
			System.out.print(" * ");
			}
			System.out.print("\n");
			
		}
		
	}
}
