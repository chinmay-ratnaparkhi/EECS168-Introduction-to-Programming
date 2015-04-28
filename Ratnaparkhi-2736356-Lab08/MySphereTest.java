/* -----------------------------------------------------------------------------
 *
 * File Name:  		MyShpehere.java
 * Author: 			Chinmay Ratnaparkhi (c732r120@ku.edu)
 * Assignment:   	EECS-169 Lab-08
 * Description:  	This program will test the MySphere object.
 * Date: 			April 4th 2013
 ---------------------------------------------------------------------------- */

import java.util.Scanner;
public class MySphereTest {

    public static void main(String[] args) {

        Scanner reader= new Scanner(System.in);
        
        //To be used in the condition of the loop to decide whether or not to keep going.
        int restarter=0;
        double myDiameter;

       //Do-while loop will execute the code at least one time and at the end, there will be a choice.
        do{

        //create a new object myBall as an instance of MySphere object
        MySphere myBall = new MySphere();

       
        System.out.print("Enter the diameter of the ball: ");
        myDiameter= reader.nextDouble();

       
        //call setDiameter method defined in the MySphere class to set the diameter.
        myBall.setDiameter(myDiameter);

               System.out.println("The diameter of the ball is " + myBall.getDiameter());

               
               /*Since the diameter is set for myBall, calculateVolume(); and calculateSurfaceArea(); methods are
                * run for the object myBall for the diameter value, returned and stored in respective double type
                * variables. 
                */
               double ballVolume = myBall.calculateVolume();
               double ballSurface = myBall.calculateSurfaceArea();

               
               //print both the volume and area on screen.
               System.out.printf("The volume is %7.2f\n", ballVolume);
               System.out.printf("The surface area is %7.2f\n", ballSurface);
   

               //Decide whether to execute the loop again.
               System.out.println("\nDo you want to try another ball?");
               System.out.print("Please enter 1 for Yes, 0 for No:");
               restarter= reader. nextInt();
              
               //go to new line.
               System.out.println();

        }while(restarter!=0);

              

        reader.close();

        System.out.println("Goodbye!");

    }

}