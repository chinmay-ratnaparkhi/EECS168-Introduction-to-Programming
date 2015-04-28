/* ---------------------------------------------------------------------------------------
 *
 * File Name:  		KUStudent.java
 * Author: 			Chinmay Ratnaparkhi (c732r120@ku.edu)
 * Assignment:   	EECS-169 Lab-08
 * Description:  	This program will define get and set methods for the KUStudent object.
 * Date: 			April 4th 2013
 ----------------------------------------------------------------------------------------- */
public class KUStudent {

    //create string variables to store firstname, lastname, ku-id and department name.
		public String stud_fname, stud_lname, stud_kuid, stud_dpt;

   
	//Store firstname and lastname of the student in appropriate string variables. 
    public void set_name(String fname, String lname){
        stud_fname =fname;
        stud_lname =lname;
   }

  //Store ku-id and name of the department in appropriate string variables.
    public void set_kuinfo(String kuid, String dpt){

    	stud_kuid =kuid;
        stud_dpt =dpt;
    }


    /*return firstname, lastname, ku-id and name ofthe department respectively
     * through appropriate methods. 
     */
    
    public String get_fname(){
        return stud_fname;
    }

    public String get_lname(){   
        return stud_lname;
    }

    public String get_id(){
        return stud_kuid;
    }

    public String get_dept(){
        return stud_dpt;
    }

   

}