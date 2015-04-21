import java.util.Scanner;

/* ---------------------------------------------------------------------------------------------------------------
 *
 * File Name: Color.java
 * Author: Chinmay Ratnaparkhi (c732r120@ku.edu)
 * Assignment:   EECS-168/169 Lab 03
 * Description:  This program will accept a value for wavelength in nm and give out the color that it represents. 
 * Date: February 14th 2013
 *
 *My program includes the lower limit to give out the color. The upper limit is included in the subsequent color
 *as the lower limit value.
 *EXCEPTION : wavelength 750 is included in the last color i.e. Red.
 -------------------------------------------------------------------------------------------------------------- */

public class Color {

	public static void main(String[] args){
		
		 //Declare the required variables and constants.
		double wave_nm;
		
		//Read the input from the keyboard.
        Scanner input = new Scanner(System.in); //sets up things to accept keyboard input
        System.out.println("Enter a wavelength in nm :");
        wave_nm= input.nextDouble();   //reads one real number from the keyboard

        
        //Perform the checks and give output.
        
        if(wave_nm >= 380 && wave_nm < 450){
		System.out.println("The color is Violet.");
       
        }else if(wave_nm >= 450 && wave_nm < 495){
		System.out.println("The color is Blue.");
       
        }else if(wave_nm >= 495  && wave_nm < 570 ){
		System.out.println("The color is Green.");
       
        }else if(wave_nm >= 570 && wave_nm < 590 ){
		System.out.println("The color is Yellow.");
       
        }else if(wave_nm >= 590 && wave_nm < 620){
		System.out.println("The color is Orange.");
       
        }else if(wave_nm >= 620 && wave_nm <= 750){
		System.out.println("The color is Red.");
       
        }else{
        	System.out.println("The entered wavelength is not a part of the visible spectrum.");
        }
        
        input.close(); //I made the scanner stop listening
		
	}
}
