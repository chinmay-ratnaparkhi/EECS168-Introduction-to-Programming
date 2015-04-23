import java.util.Scanner;

/* -----------------------------------------------------------------------------
 *
 * File Name:  		Summation.java
 * Author: 			Chinmay Ratnaparkhi
 * Email:			c732r120@ku.edu
 * Assignment:   	EECS-168/169 Lab 5
 * Description:		This program takes in two integer values and performs a summation operation through them.
 * 
 * Date: March 7th 2013
 *
 ---------------------------------------------------------------------------- */

public class Summation {

	public static void main(String[] args){
		
		int initial_val, end_val, final_sumation=0;
		
		System.out.println("Welcome! This program calculates the summation of consecutive integers.\n");
		
		//Create a scanner and store the initial and end value.
		Scanner keyboard= new Scanner(System.in);
		
		System.out.println("Please input a positive integer as the initial value:");
		initial_val= keyboard.nextInt();
		System.out.println("Please input a positive integer as the end value:");
		end_val= keyboard.nextInt();
		
		//Go into a loop if the end value is smaller than or equal to initial value until an appropriate end value is obtained.
		while(end_val< initial_val){
			System.out.println("The end value is invalid. Please input a positive integer as the end value: ");
			end_val= keyboard.nextInt();
		}
		
		//Since no more inputs are required, close the scanner.
		keyboard.close();
		
		//Go into a for loop where some variable 'i' varies from initial to end value one at a time performing an addition.
		
		for(int i= initial_val; i<= end_val; i=i+1){
			final_sumation= final_sumation+i;
			}
		System.out.println("The summation is: "+final_sumation);
		
	}
}
