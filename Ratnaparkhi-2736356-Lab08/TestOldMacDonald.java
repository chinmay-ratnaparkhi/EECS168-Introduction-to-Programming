/* -----------------------------------------------------------------------------
 *
 * File Name:  		MyShpehere.java
 * Author: 			Chinmay Ratnaparkhi (c732r120@ku.edu)
 * Assignment:   	EECS-169 Lab-08
 * Description:  	This program will test the Animal and OldMacDonald object
 * Date: 			April 4th 2013
 ---------------------------------------------------------------------------- */

import java.util.Scanner;
public class TestOldMacDonald {
   
    public static void main(String[] args){
      
    	Scanner reader= new Scanner(System.in);
    	
    	//Create 2 string variables to store type and sound of the animal.
    	String animal_sound, animal_type;
    	
    	//Ask user to input appropriate values for both.
    	System.out.println("Please name the animal:");
    	animal_type= reader.next();
    	System.out.println("Please describe how the animal sounds :");
    	animal_sound= reader.next();
    	
    	//go to second next line
    	System.out.println("\n");
    	reader.close();
    	
    	
        //Create an animal and an OldMacDonald object
         Animal animalA = new Animal();
         OldMacDonald md = new OldMacDonald();
        
         //Tell the animal what type it is and what sound it makes
         animalA.setSound(animal_sound);
         animalA.setType(animal_type);

         
         //Tell OldMacDonald which animal to sing about
         md.setAnimal(animalA);

         //Tell OldMacDonald to sing
         md.sing();
        }

}