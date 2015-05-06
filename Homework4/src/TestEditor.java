import java.util.Scanner;

public class TestEditor{
	
	public static void main(String args[]){
		
		String input, insertion;
		int selection;
		Scanner reader= new Scanner(System.in);
		LineEditor myEditor= new LineEditor();
		
		do{
		System.out.println("\n* Write the text you want (maximum length: 100):");
		input= reader.nextLine();
			if(input.length()<=100){
				myEditor.setText(input);
			}else System.out.println("\n* Operation failed: You exceeded the maximum length.");
		
		}while(input.length()>100);
		
		
		
		
		/*INSERTION
		System.out.println("\n* Enter the text you want to insert:");				
		insertion= reader.nextLine();
		System.out.println("\n* Enter the starting position:");
		int pointer= reader.nextInt();
		//call the insertion function.		
		myEditor.insert_text(pointer, insertion);
	*/
		
		
		/*DELETIOIN
		System.out.println("\n* Enter the starting and ending position for deletion.");				
		int begin= reader.nextInt();
		int end= reader.nextInt();
		//call the deletion function.		
		myEditor.delete_text(begin, end);
	*/
		
		
		myEditor.printText();

		
			
		
	/*	do{
			System.out.println("\n--------------------------------------\n");
			System.out.println("* Choose the menu:\n" +
					"1. Insert\n" +
					"2. Delete\n" + 
					"3. Replace\n" +
					"4. Quit"); 
			
			selection= reader.nextInt();
			
			//if(selection==1){
		
			/*}else if(selection==2){
				System.out.println("\n\n2");
			}else if(selection==3){
				System.out.println("\n\n3");
			}else if(selection==4){
				break;
			}else{
				System.out.println("\n\nInvalid input. Try again.");
				break;
			}*/
		
	//	}while(selection!=4);
		
		System.out.println("\n\nGood bye!");

	}
	
}