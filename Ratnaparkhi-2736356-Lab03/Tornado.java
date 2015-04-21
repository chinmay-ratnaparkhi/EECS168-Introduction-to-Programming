import java.util.Scanner;

/* ---------------------------------------------------------------------------------------------------------------
 *
 * File Name: Tornado.java
 * Author: Chinmay Ratnaparkhi (c732r120@ku.edu)
 * Assignment:   EECS-168/169 Lab 03
 * Description:  This program will accept a value for speed of wind and determine the Fujita category. 
 * Date: February 14th 2013
 *
 -------------------------------------------------------------------------------------------------------------- */

public class Tornado {

	public static void main(String[] args){
		
		 //Declare the required variables and constants.
		double wind_speed;
		
		//Read the input from the keyboard.
        Scanner input = new Scanner(System.in); //sets up things to accept keyboard input
        System.out.println("Enter the wind speed:");
        wind_speed= input.nextDouble();   //reads one real number from the keyboard

        
        //Perform the checks and give output.
        
        if(wind_speed >= 40 && wind_speed <= 72){
		System.out.println("The tornado is an F-0 tornado");
       
        }else if(wind_speed > 72 && wind_speed <= 112){
		System.out.println("The tornado is an F-1 tornado");
       
        }else if(wind_speed > 112  && wind_speed <= 157 ){
		System.out.println("The tornado is an F-2 tornado");
       
        }else if(wind_speed > 157 && wind_speed <= 205 ){
		System.out.println("The tornado is an F-3 tornado");
       
        }else if(wind_speed > 205 && wind_speed <= 260){
		System.out.println("The tornado is an F-4 tornado");
       
        }else if(wind_speed > 260 && wind_speed <= 318){
		System.out.println("The tornado is an F-5 tornado");
       
        }else{
        	System.out.println("The entered value is out of range.");
        }
        
        input.close(); //I made the scanner stop listening
		
	}
	
	
}