/* ---------------------------------------------------------------------------------------
 *
 * File Name:  		KUStudent.java
 * Author: 			Chinmay Ratnaparkhi (c732r120@ku.edu)
 * Assignment:   	EECS-169 Lab-08
 * Description:  	This program will define get and set methods for the OldMacDonald object.
 * Date: 			April 4th 2013
 ----------------------------------------------------------------------------------------- */
public class OldMacDonald {

   private  Animal myAnimal;

   		//Go to the Animal class and get the type and sound of the defined animal and store in the appropriate strings
        public void setAnimal(Animal definedAnimal){
              myAnimal = definedAnimal;
         }
   
        
        public void sing(){
       	//print the song on the screen
        System.out.println("Old MacDonald had a farm, EE-I-EE-I-O");
        System.out.println("And on the farm he had a "+myAnimal.getType()+" EE-I-EE-I-O");
        System.out.println("With a "+ myAnimal.getSound()+"-"+myAnimal.getSound()+" here, and a "+
                           myAnimal.getSound()+"-"+myAnimal.getSound()+" there,");
        System.out.println("Here a "+myAnimal.getSound()+", there a "+myAnimal.getSound()+", everywhere a "+
                           myAnimal.getSound()+"-"+myAnimal.getSound()+",");
        System.out.println("Old MacDonald had a farm, EE-I-EE-I-O");
        
        //go to new line
        System.out.println();
      

    }

}