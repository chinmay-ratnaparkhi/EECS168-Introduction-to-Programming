/* ---------------------------------------------------------------------------------------
 *
 * File Name:  		SelectionSortTest.java
 * Author: 			Chinmay Ratnaparkhi (c732r120@ku.edu)
 * Assignment:   	EECS-169 Lab-11
 * Description:  	This program will generate 10 random integers between 0 and 100
 * 					and have them sorted using the selection sort technique.
 * Date: 			April 25th 2013
 ----------------------------------------------------------------------------------------- */

public class SelectionSortTest {

	public static void main(String[] args){
		
		double temp;
		int[] myArray = new int[10];
		
		
		System.out.println("\n* Generating 10 random integers in range (0,100):\n");
		//Generate ten random numbers and assign them to indices of myArray from 0 to 9.
		for(int i=0; i<myArray.length; i++){
			temp= Math.random()*100;
			myArray[i]= (int)temp;
		}
		//Print on the screen, what numbers are generated in the order of indices.
		for(int i=0; i<myArray.length; i++){
		System.out.print(myArray[i]+" ");
		}
		
		//Start the sorting process by calling the selectionSort(); method and pass in the existing array to process in it.
		System.out.println("\n\n* Sorted numbers:");
		selectionSort(myArray);
		//indicate that you are done sorting.
		System.out.print("\nDone.");
				
	}

		public static void selectionSort(int[] arr) {

				int minIndex, tmp;
				int n = arr.length;
				
				//go through the array and locate smallest value
				for (int i = 0; i <n; i++) {
					minIndex = i ;
					for (int j = i + 1; j < n; j++){
						if (arr[j] < arr[minIndex])
                        minIndex = j ;
					} 
					
					//There is a smaller value NOT at the smallest index?
					if (minIndex != i) {
                  //swap two values
						tmp = arr[i];
						arr[i] = arr[minIndex];
						arr[minIndex] = tmp;
					}
					
					System.out.print("Round "+(i+1)+" :");				
						for(int k=0; k<arr.length; k++){
							System.out.print(arr[k]+" ");
							}
						System.out.print("\n");	
				}
		} 	
	}