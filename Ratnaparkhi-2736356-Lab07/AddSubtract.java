/* ------------------------------------------------------------------------------------
 *
 * File Name: 	AddSubtract.java
 * Author: 		Chinmay Ratnaparkhi (c732r120@ku.edu)
 * Assignment:  EECS-169 Lab 7
 * Description: This program accepts two integers from the user and gives out
 * 				their sum and difference by calling addition and subtraction methods.
 * Date: 		March 28th 2013
 *
 --------------------------------------------------------------------------------------- */

import java.util.Scanner;

public class AddSubtract {
	public static void main(String[] args) {
		
		/*Variable restarter is used in the loop to determine whether the user wants to run the
		 * addition-subtraction again and scanner reader will read input and store in appropriate
		 * variables x and y.
		 * */
		
		int restart=0, x, y;
		Scanner reader= new Scanner(System.in);
		
		/*Use of do-while loop will enable me to perform the operation at least once and 
		 * then several times depending on the choice of the user, stored in the variable
		 * restarter 
		 * */
		do{
		
			//variables x and y will store the values given in by the user
			
		System.out.println("Please enter the 1st No:");
		x= reader.nextInt();
		System.out.println("Please enter the 2nd No:");
		y= reader.nextInt();
		
		//Call the method that performs both addition and subtraction
		addSub(x,y);
		
		System.out.println("\nNow you are calling 2 different methods add and sub which return values as");
		
		//Call two different functions to perform addition and subtraction separately
		int sum=add(x,y);
		int difference=sub(x,y);
		System.out.println("Sum="+sum+"\nDifference="+difference);
		
		//Ask the user whether to redo addition and subtraction and store the choice in variable restarter.
		System.out.println("\nIt was fun right! Want to do again?(y=1/n=0):");
		restart= reader.nextInt();
		}
		//keep looping if user chooses 1.
		while(restart==1);
		
		
		
		// if the user chooses anything else but 1, loop condition is unsatisfied and following is printed on screen
		System.out.println("\nEnough of Addition and Subtraction. I am not in Elementary School any more!");
		reader.close();
		
	}
	
	/*Method performing addition and subtraction both. The method prints sum and difference and does not
	 * return anything to the main method.
	 */
	
	public static void addSub(int x, int y){
		int sum= x+y;
		int difference= x-y;
		System.out.println("You are inside Method AddSub where Sum="+sum+" and Difference="+difference);
		
	}

	//Method performing just addition. It returns sum to the main method.
	public static int add(int x, int y){
		return x+y;
	}
	
	
	//Method performing just subtraction. It returns the difference to the main method.
	public static int sub(int x, int y){
		return x-y;
	}
}
