/* ---------------------------------------------------------------------------------------
 *
 * File Name:  		KUStudent.java
 * Author: 			Chinmay Ratnaparkhi (c732r120@ku.edu)
 * Assignment:   	EECS-169 Lab-08
 * Description:  	This program will define get and set methods for the Animal object.
 * Date: 			April 4th 2013
 ----------------------------------------------------------------------------------------- */


public class Animal {
	
	//privately declare string variables to store type and sound of the animal.
    private String ani_type, ani_sound;

   
    //set the type of the animal
    public void setType(String newType){
        ani_type = newType;
    }
    //set the sound of the animal
    public void setSound(String newSound){
        ani_sound = newSound;
    }
    
    
    
    //return type of the animal to the caller method.
    public String getType(){
        return ani_type;
    }
    //return sound of the animal to the caller method.
    public String getSound(){
        return ani_sound;
    }

}