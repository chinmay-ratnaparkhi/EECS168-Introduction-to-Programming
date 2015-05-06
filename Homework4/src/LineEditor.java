
public class LineEditor {

	private char [] text = new char[100];
	private int org_length;
	
	
	public void setText(String input){
		
		//store the original length
		org_length= input.length();
		//put the string characters in the array.
		for(int i=0; i<input.length(); i++){
			text[i]= input.charAt(i);			
		}
		
	}
	
	public void insert_text(int pointer, String insertion){

		//create a new char array and fill it up with the insetion.
		char[] newInsertion= new char[insertion.length()];
		for(int i=0; i<insertion.length(); i++){
			newInsertion[i]= insertion.charAt(i);			
		}
		
		//shift all the text to the right. Add the given stuff starting at pointer.
		for(int i=0; i<newInsertion.length; i++){
		text[org_length+(i+1)]=text[pointer+i];
		text[pointer+i]= newInsertion[i];
		}

		
	}
	
	public void printText(){
		for(int i=0; i<text.length; i++){
		System.out.print(text[i]);
		}
	}
	
}
