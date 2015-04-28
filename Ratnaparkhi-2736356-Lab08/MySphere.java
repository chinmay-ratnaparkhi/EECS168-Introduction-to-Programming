/* -------------------------------------------------------------------------------------------
 *
 * File Name:  		MyShpehere.java
 * Author: 			Chinmay Ratnaparkhi (c732r120@ku.edu)
 * Assignment:   	EECS-169 Lab-08
 * Description:  	This program will define get and set methods for the object MySphere
 * Date: 			April 4th 2013
 -------------------------------------------------------------------------------------------- */
public class MySphere {

   

   //Define the constant PI.
   private final double PI = 3.141592;

   //The MySphere class has one instance variable, diameter
   private double diameter;

           

   //This method assigns a diameter to the MySphere object
   public void setDiameter(double newDiameter){
       diameter = newDiameter ;
   }

       
 //This method returns the diameter of the MySphere object
  public double getDiameter() {
       return diameter;
   }

   
//This method calculates volume of the MySphere object
   public double calculateVolume() {

        double volume = 0.0;
        volume= PI*(diameter*diameter*diameter)/6;

        //volume is retuned to the caller method.
        return volume;

   }

       
  //This method calculates surfaceArea of the MySphere object
   public double calculateSurfaceArea() {

        double surfaceArea = 0.0;
        surfaceArea = PI*(diameter*diameter);

      //surfaceArea is retuned to the caller method.
        return surfaceArea;

   }

}

