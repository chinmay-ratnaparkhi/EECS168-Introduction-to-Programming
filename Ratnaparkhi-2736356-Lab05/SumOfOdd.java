/* -----------------------------------------------------------------------------
 *
 * File Name:  		SumOfOdd.java
 * Author: 			Chinmay Ratnaparkhi
 * Assignment:   	EECS-168/169 Lab 5
 * Description:		This program takes in a positive integer and adds up all the odd
 * 					ones to give out a summation upto the provided value.
 * 
 * Date: March 7th 2013
 *
 ---------------------------------------------------------------------------- */

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args){
	
		//Declare three integer variables to store the total, take input from the user and an increment value for looped addition. 
		int total_sum=0, max_val, increment=1;
		
		//Create a scanner and store the input value in a variable as the maximum value for addition.
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Please input a positive integer as the end value: ");
		max_val= keyboard.nextInt();
		
		//Since no more inputs are required, close the scanner.
		keyboard.close();
		
		
		
		//perform a repeated operation until the maximum value is reached and store it in total_sum.
		while(max_val>= increment){
		total_sum = total_sum+ increment;
		
		increment+=2;
		
		}
		
		System.out.println("The summation is: "+ total_sum);
		
	}
	
	
}
