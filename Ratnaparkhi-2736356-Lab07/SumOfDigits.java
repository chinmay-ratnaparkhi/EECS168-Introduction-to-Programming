/* ------------------------------------------------------------------------------------
 *
 * File Name: 	sumOfDigits.java
 * Author: 		Chinmay Ratnaparkhi (c732r120@ku.edu)
 * Assignment:  EECS-169 Lab 7
 * Description: This program accepts an integer value from the user and gives out the 
 * 				total addition of the digits in the integer number.
 * Date: 		March 28th 2013
 *
 --------------------------------------------------------------------------------------- */

import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args){

		/*Variable restarter is used in the loop to determine whether the user wants to run the
		 * the program again and scanner reader will read input and store in appropriate
		 * integer value for variable x.
		 * */
		int x, restart;
		Scanner reader= new Scanner(System.in);
		
		
		/*Use of do-while loop will enable me to perform the operation at least once and 
		 * then several times depending on the choice of the user, stored in the variable
		 * restarter 
		 * */
		do{
		
		System.out.println("Please enter a No:");
		x= reader.nextInt();
		
		//This statement will print the statement and then call the addDigits(); with x as parameter.
		
		System.out.println("The sum of the Digits is :"+addDigits(x));
		System.out.println("Want to try again?(y=1/n=0):");
		
		restart= reader.nextInt();
		
		}
		//keep looping if the user puts in 1, terminate for anything else.
		while(restart==1);
		
		
		reader.close();
		System.out.print("Thank you!");
	}
	

	//This method performs actual sum of digits in the number and returns it to the main method.
	public static int addDigits(int x){
		
		int total=0;
		
		/*The integer x is divided by ten, remainder is added to total and x is reassigned as
		 * the integer part of the division result. i.e. the last digit is omitted. The process
		 * is looped until x reaches 0.something, but since only integer part is used, it will 
		 * become 0. 
		 * */
		
		
		while(x!=0){
			total+= x%10;
			x= (int)(x/10);
		}
		
		/*when x finally becomes zero, variable total contains the addition of digits and returns to 
		*the main method.
		*/
	return total;	
	}

}
