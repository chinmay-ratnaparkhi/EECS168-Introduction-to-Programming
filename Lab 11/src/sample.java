import java.util.Random;
public class sample {
	
	public static void main(String[] args){
	double temp;
	int[] myArray = new int[10];
	
	for(int i=0; i<myArray.length; i++){
		temp= Math.random()*100;
		myArray[i]= (int)temp;
	}
	}
	
	public static void selectionSort(int[] arr) {


	      int minIndex, tmp;
	      int n = arr.length;

	      for (int i = 0; i <n; i++) {
	            minIndex = ____ ;

	            for (int j = i + 1; j < n; j++)
	            {      if (arr[j] < arr[minIndex])
	                        minIndex = ___ ;
	            } 
	            if (minIndex != i) {
	                  //swap two values
	                  tmp = arr[i];
	                  arr[i] = ____________ ;
	                  ____________ = ______ ;
	            }
	      }
	}
}
