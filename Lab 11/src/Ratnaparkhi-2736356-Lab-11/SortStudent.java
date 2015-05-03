/* ---------------------------------------------------------------------------------------
 *
 * File Name:  		SortStudent.java
 * Author: 			Chinmay Ratnaparkhi (c732r120@ku.edu)
 * Assignment:   	EECS-169 Lab-11
 * Description:  	This program will take student names and ids as input and have them
 * 					sorted using the bubble sort technique according to ids and names.
 * Date: 			April 26th 2013
 ----------------------------------------------------------------------------------------- */
import java.text.Collator;
	import java.util.Scanner;


	public class SortStudent {

	    public static void main (String[] args){	
		int numOfStu;
	
		Scanner reader= new Scanner(System.in);
		
		System.out.println("Enter the number of students:");
		numOfStu= reader.nextInt();
		
		//create an array of students with the length given by user which has type Students.
		Students student[] = new Students[numOfStu];
		
		//collect information for each student by looping through a for loop.
		for(int i=0; i<student.length; i++){
		System.out.print("Enter student's name and id number: ");
		//create a temporary student object
		Students temp_student= new Students();
			temp_student.set_name(reader.next());
			temp_student.set_kuid(reader.next());	
		//store the temporary student object in the array of students.
		student[i]= temp_student;
		}
		
		reader.close();
		
	
	       	System.out.println("*Sort by name:");
	       		bubbleSort(student, 1);
	       		//output sorted array
	       		System.out.println("\n");
	        
	       	System.out.println("*Sort by id:");	
	       		bubbleSort(student, 0);
	       		//output sorted array
	    
	    }
	       		
	       		
	   
	    public static void bubbleSort(Students[] arrb, int sortType){
	    	if(sortType==0){
	    		//sort by id
    			int j=0;
    			boolean swapped= true;
    		
    			while(swapped){
    	            swapped = false;
    	            j++;
    	            	for (int i = 0; i < arrb.length - j; i++) {  
    	            		
    	            		//take ids of both the students and turn them into double values to compare.
    	            		double kuid1_double = Double.parseDouble(arrb[i].get_id());
    	            		double kuid2_double = Double.parseDouble(arrb[i+1].get_id());
    	            		
    	            		//if id of the current student is bigger than the next one, swap them.
    	            		if(kuid1_double>kuid2_double){
    	            			Students temp_student = new Students();
    	            			temp_student= arrb[i];
    	            			arrb[i]=arrb[i+1];
    	            			arrb[i+1]= temp_student;
    	            			//if there was any swapping this time, check one more time.
    	            			swapped = true;
    	            		}
    		
    	            	}
    			}
    			//print the array sorted by id
            	for(int i=0; i<arrb.length; i++){
	       			System.out.println(arrb[i].get_name()+" "+arrb[i].get_id());
	       			}
	    		
	    	}else{
	    		//sort by name
	    			Collator myCollator = Collator.getInstance();
	    			int j=0;
	    			boolean swapped= true;
	    		
	    			while(swapped){
	    	            swapped = false;
	    	            j++;
	    	            	for (int i = 0; i < arrb.length - j; i++) {  
	    	            		//check if name of the first one comes alphabetically later than next one
	    	            		if(myCollator.compare(arrb[i].get_name(), arrb[i+1].get_name()) > 0 ){
	    	            			Students temp_student = new Students();
	    	            			//if yes, swap!
	    	            			temp_student= arrb[i];
	    	            			arrb[i]=arrb[i+1];
	    	            			arrb[i+1]= temp_student;
	    	            			//if there was any swapping this time, check once more.
	    	            			swapped = true;
	    	            		}
	    		
	    	            	}
	    				}
	    			
	    			//print the array sorted by names
	            	for(int i=0; i<arrb.length; i++){
		       			System.out.println(arrb[i].get_name()+" "+arrb[i].get_id());
		       			}
	    		}
	    }
}
