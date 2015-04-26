/* ------------------------------------------------------------------------------------
 *
 * File Name: 	Palindrome.java
 * Author: 		Chinmay Ratnaparkhi (c732r120@ku.edu)
 * Assignment:  EECS-169 Lab 7
 * Description: This program accepts an integer value from the user and through 3 methods
 * 				determines whether it is a palindrome.
 * Date: 		March 28th 2013
 *
 --------------------------------------------------------------------------------------- */

import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args){
	
		/*Variable restarter is used in the loop to determine whether the user wants to run the
		 * the program again and scanner reader will read input and store in appropriate
		 * integer value for variable user_input.
		 * */
		
		int user_input, restarter;
		boolean is_palindrome;
		Scanner reader= new Scanner(System.in);
		
		
		/*Use of do-while loop will enable me to perform the operation at least once and 
		 * then several times depending on the choice of the user, stored in the variable
		 * restarter 
		 * */
		do{	
		System.out.println("Please enter a No:");
		user_input= reader.nextInt();
		
		
		//Boolean var is_palindrome will store returned result of method isPalindrome with user_input.
		
		
		System.out.println("The Length of the Number is:"+ lengthOfNumber(user_input));
		System.out.print("The Reverse of the Number is:"+ reverse(user_input));
		is_palindrome= isPalindrome(user_input);
		//If boolean value is true, the number is a palindrome, otherwise it is not.	
			if(is_palindrome==true){
				System.out.println("\nThe Number is a palindrome.");
			}else{
				System.out.println("\nThe Number is not a palindrome.");
			}
			
			
		//Ask to redo the check.	
		System.out.print("Want to try again?(y=1/n=0):");
		restarter= reader.nextInt();
		
		}
		//keep looping if the user puts in 1, terminate for anything else.
		while(restarter==1);
		
			reader.close();
			System.out.print("Thank you!");
	}
	
	
	
	//This method returns the result if the number is a palindrome to the main method
	public static boolean isPalindrome(int user_input){
		
		
		boolean whetherPal= false;
		
		// Call the method reverse() to get the reversed version of user_input
		int reversed= reverse(user_input);
		
		
		// If the original value and returned value are same, number is a palindrome
		 if(reversed==user_input){
			whetherPal= true;
		}else{
			whetherPal= false;
		}
		
		
		return whetherPal;
	}


	//This method is called from isPalindrome method to reverse and return the given integer.
	 
	public static int reverse(int user_input){
	
		//integer length stores the value returned by method lengthOfNumber(); with parameter as user_input.
		int length = lengthOfNumber(user_input);
		
		int reversed=0;
	
	/*Take the last digit of user_input by finding the remainder of its division with 10 and store it in 
	 * variable reversed. Now multiply reversed by 10 to create new unit's place. Eliminate the last 
	 * digit of user_input by dividing it with 10 and taking only the integer part. This is repeated as many
	 * times as the number of digits of the user_input. 
	 */
		for(int i=1; i<= length; i++){
				reversed= reversed*10;
				reversed+= user_input%10;
				user_input= user_input/10;
		}
		 
		return reversed;
	}

	
	
	//This method takes the value of integer stored in user_input and finds number of digits in it	

	public static int lengthOfNumber(int user_input){	
		
		int length=0;
		double comparison=0;
		
	/*Initially the comparison variable value is set zero and it will store the exponents of 10. The moment
	 * the exponent of 10 gets bigger than the input value, the loop stops and the earlier value of power of 
	 * 10 was the length of the number.
	 * */
			while(comparison<=user_input){
					comparison= Math.pow(10, length);
					length++;		
				}
		
					length= length-1;
	
			return length;
		
		}

}

