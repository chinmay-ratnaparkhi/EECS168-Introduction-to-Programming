/* -----------------------------------------------------------------------------
 *
 * File Name:  		MyShpehere.java
 * Author: 			Chinmay Ratnaparkhi (c732r120@ku.edu)
 * Assignment:   	EECS-169 Lab-08
 * Description:  	This program will test the KUStudent object.
 * Date: 			April 4th 2013
 ---------------------------------------------------------------------------- */

import java.util.Scanner;
public class KUStudentTest{

   public static void main(String[] args){

    	Scanner reader = new Scanner(System.in);
    

        //create a new KUStudent object
        KUStudent NewStudent = new KUStudent();
     

        //Set first and last name of the student.
        System.out.println("Please input the student's name (firstname lastname):");
        NewStudent.set_name(reader.next(), reader.next());
       

        //Set KUID and Department Name of the student.
        System.out.println("Please input the student's KUID and department:");   
        NewStudent.set_kuinfo(reader.next(), reader.next());

       
        reader.close();

        //print the information about NewStudent on the screen.
        System.out.println();
        System.out.println("Student: " + NewStudent.get_fname()+" "+NewStudent.get_lname());
        System.out.println("KUID : " + NewStudent.get_id());
        System.out.println("KUID : " + NewStudent.get_dept());

       

    }

   

}