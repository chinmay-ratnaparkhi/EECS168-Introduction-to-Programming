import java.util.Scanner;

/* -----------------------------------------------------------------------------
 *
 * File Name:  ConvertTemperature.java
 * Author: Chinmay Ratnaparkhi (c732r120@ku.edu)
 * Assignment:   EECS-168/169 Lab 2
 * Description:  This program will convert the input temperature from Fahrenheit to Celsius.
 * Date: date the program was last modified
 *
 ---------------------------------------------------------------------------- */
//Start your program.

public class ConvertTemperature{
	
	public static void main(String[] args ){

        //Declare the variables and constants.
		
	   double tempFahr;
	   double tempCelc;

        //Read the input from the keyboard.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit scale :");
        tempFahr= input.nextDouble();   //reads one real number from the keyboard

        tempCelc = (tempFahr-32)*5/9;
        
        //Display the output
        System.out.println(tempFahr + " degrees Fahrenheit is " + tempCelc + " degree Celsius.");
        input.close(); //I made the scanner stop listening
		
	}
	
	
}