/* ---------------------------------------------------------------------------------------
 *
 * File Name:  		Students.java
 * Author: 			Chinmay Ratnaparkhi (c732r120@ku.edu)
 * Assignment:   	EECS-169 Lab-11
 * Description:  	This program will define get and set methods for the Students object.
 * Date: 			April 26th 2013
 ----------------------------------------------------------------------------------------- */
public class Students {

    //create string variables to store firstname and ku-id.
		private String stud_name, stud_kuid;

   
	//Store firstname of the student in appropriate string variable. 
    public void set_name(String name){
        stud_name =name;

   }

  //Store ku-id appropriate string variables.
    public void set_kuid(String kuid){
    	stud_kuid =kuid;
    }


    //return firstname and ku-id through appropriate methods. 
    
    public String get_name(){
        return stud_name;
    }

  
    public String get_id(){
        return stud_kuid;
    }

   

}