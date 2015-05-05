
public class stars {

	public static void main(String args[]){
		
		int input= 5;
		for (int i=0; i<input; i++){
			
			if(i==0 || i== input-1){
				for(int j=0; j<input; j++){
					System.out.print("x ");
				}
				
			}else{
				for(int j=0; j<input; j++){
					if(j==0 || j==input-1){
						System.out.print("x ");
					}else System.out.print("  ");
				
				}
				
			}System.out.println();
			
		}
		
		
	}
	
	
}
