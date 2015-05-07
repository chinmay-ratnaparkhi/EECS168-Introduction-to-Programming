/**File Name: 		Fighter.java
*	Author: 		Chinmay Ratnaparkhi
*	KUID: 			2736356
*	Email:			c732r120@ku.edu
*	Assignment: 	Homework03
*	Description: 	This code takes defines all the set and get methods
*					for the character of a Fighter. The attack and input
*					methods perform action for computation of a round.
*	Last Changed: 	April 12th 2013
**/

import java.util.Scanner;
import java.util.Random;


public class Fighter{
	
	private String name;
	private int hitPoints;
	private int attackSpeed;
	private int defenseLevel;
	public static int loss;
	public static int choice;
	public int max_hit_points;
	
 	//set methods
		public void setName(String input_name){
			name= input_name;
		}
		public void setHitPoints(int input_hitPoints){
			hitPoints= input_hitPoints;
			max_hit_points= hitPoints;
		}
		public void setAttackSpeed(int input_attackSpeed){
			attackSpeed= input_attackSpeed;
		}
		public void setDefenseLevel(int input_defenseLevel){
			defenseLevel= input_defenseLevel;
		}
		
	//Get methods
		public String name(){
			return name;
		}
		public int hitPoints(){
			return hitPoints;
		}
		public int attackSpeed(){
			return attackSpeed;
		}
		public int defenseLevel(){
			return defenseLevel;
		}
		
	//Required methods
	
		@SuppressWarnings("resource")
		public void input(){
			
			Scanner reader= new Scanner(System.in);
			
			System.out.print("Please give a name for fighter: ");
				setName(reader.next());
	
				System.out.print("What are the hit points of the fighter? ");
				setHitPoints(reader.nextInt());	
				while(hitPoints<=0 || hitPoints()>50){	
					System.out.print("Hit points should be less than or equal to 50, please re-enter: ");
					setHitPoints(reader.nextInt());
				}
			
				System.out.print("what is the attack speed of the fighter? ");
					setAttackSpeed(reader.nextInt());
					while(attackSpeed<1){
						System.out.print("Attack Speed must be equal to or great than 1. Reenter : ");
						setAttackSpeed(reader.nextInt());						
					}
				System.out.print("what is the defense level of the fighter? ");
					setDefenseLevel(reader.nextInt());
					while(defenseLevel<1){
						System.out.print("Defense Level must be equal to or great than 1. Reenter : ");
						setDefenseLevel(reader.nextInt());						
					}
					
					while((attackSpeed()+defenseLevel())>50){
							System.out.println("Attack speed and defense level together should not exceed 50.");								System.out.print("what is the attack speed of the fighter? ");
								setAttackSpeed(reader.nextInt());
							System.out.print("what is the defense level of the fighter? ");
								setDefenseLevel(reader.nextInt());
							}
			
					
			}
	
		public boolean attack(Fighter opponent){
			
		
			@SuppressWarnings("resource")
			Scanner newRead= new Scanner(System.in);
				//Choose from the actions and perform likewise.
				System.out.println("Please enter the corresponding number to choose move.");
				System.out.println("1. Attack		2. Increase Attack Speed		3. Increase Defense");
				choice= newRead.nextInt();
				
			
				if (choice==1){
						Random random= new Random();
						loss= (int)(attackSpeed*(random.nextDouble()));
						opponent.setHitPoints(opponent.hitPoints()-loss);
								if(opponent.hitPoints()<=0){
									return true;
								}
								else{ 
									return false;
								}
				}else if(choice==2){
						setAttackSpeed(attackSpeed+5);
						System.out.print(name()+"'s Attack Speed was increased by 5 points. ");
						return false;
				
				}else if(choice ==3){
						setDefenseLevel(defenseLevel+5);				
						System.out.print(name()+"'s Defense Level was increased by 5 points. ");
						return false;
				}else{
						System.out.println("Invalid Entry. Try Again later.");
						return false;
				}
			
			
		}
	

}
