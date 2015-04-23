/* -----------------------------------------------------------------------------
 *
 * File Name:  		Factorial.java
 * Author: 			Chinmay Ratnaparkhi
 * Assignment:   	EECS-168/169 Lab 5
 * Description:		This program takes in a positive integer and calculates its factorial value.
 * 
 * Date: March 7th 2013
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;


public class Factorial {
	
	public static void main(String[] args){
	
			int total_product=1, max_val, increment=1;
		
	//Create a scanner and store the input value in a variable as the maximum value for multiplication.
			Scanner keyboard= new Scanner(System.in);
			
			System.out.println("Enter the number to compute factorial :");
			max_val= keyboard.nextInt();
	
	//Go into a loop if the value is not greater than or equal to 0 and keep asking until you do.
			
			while(max_val<0){
				
				System.out.println("Please enter a non-negative number :");
				max_val= keyboard.nextInt();
				}
	//Since no more inputs are required, close the scanner.
			keyboard.close();
	
			
			
			while(increment<= max_val){
				total_product= total_product*increment;
				increment= increment+1;
				
			}
	System.out.println("The factorial is "+ total_product);		
			
	}
}
