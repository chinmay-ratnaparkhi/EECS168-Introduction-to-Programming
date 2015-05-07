/**File Name: 		FightClub.java
*	Author: 		Chinmay Ratnaparkhi
*	KUID: 			2736356
*	Email:			c732r120@ku.edu
*	Assignment: 	Homework03
*	Description: 	This code instanciates the Fighter.java class to
*					create Fighter objects. It also calls various methods
*					from the Fighter class to simulate a fight.
*	Last Changed: 	April 12th 2013
**/

import java.util.Random;
public class FightClub{
	
	public static void main(String[] args){
			
	
		//set functions called for the first instance of class fighter.
			System.out.println("Fighter 1 :\n");
				Fighter first_fighter= new Fighter();
				first_fighter.input();
		//set functions called for the second instance of class fighter.
			System.out.println("\nFighter 2 :\n");
			 	Fighter second_fighter= new Fighter();
			 	second_fighter.input();	
		//we are done recording information for both the fighters
		 		
	
		
	
	//Do loop will help restart if one of the fighter loses		
	do{
		
		Random random = new Random();
		double myNum=random.nextDouble(); 
		
		
//FIRST CASE, FIRST FIGHTER HITS FIRST.
	
				if(myNum<=0.5){
					//declare that first fighter will attack first.
					System.out.println("\n"+first_fighter.name()+" will attack first.\n");
			
					for(int i=1; i<=10; i++){
						System.out.println("Round "+i+" :");
				
						//FIRST FIGHTER	
						if((random.nextDouble()*(first_fighter.attackSpeed()))> (random.nextDouble()*(second_fighter.defenseLevel()))){
						System.out.print(first_fighter.name()+" hits "+ second_fighter.name()+". ");
						
								if(first_fighter.attack(second_fighter)){
									System.out.println(second_fighter.name()+" loses "+Fighter.loss+" hit points. "+second_fighter.name()+" was defeated!");
									break;
								}else{
									if(Fighter.choice==1){
										System.out.print(second_fighter.name()+" loses "+Fighter.loss+" hit points, and has "+second_fighter.hitPoints()+" left.\n");
									}else{
										System.out.print(second_fighter.name()+" has "+second_fighter.hitPoints()+" hit points left.\n");
										
									}
								}
			
						}else {
							System.out.print(first_fighter.name()+" attacks "+ second_fighter.name()+" but misses. "+second_fighter.name()+" has "+second_fighter.hitPoints()+" hit points left.\n");
							}
					
						//SECOND FIGHTER
						if((random.nextDouble()*(second_fighter.attackSpeed()))> (random.nextDouble()*(first_fighter.defenseLevel()))){
						System.out.print(second_fighter.name()+" hits "+ first_fighter.name()+". ");
					
							if(second_fighter.attack(first_fighter)){
								System.out.println(first_fighter.name()+" loses "+Fighter.loss +" hit points. "+first_fighter.name()+" was defeated!");
								break;
							}else{
								if(Fighter.choice==1){
									System.out.println(first_fighter.name()+" loses "+Fighter.loss+" hit points, and has "+first_fighter.hitPoints()+" left.\n");	
								}else{
									System.out.println(first_fighter.name()+" has "+first_fighter.hitPoints()+" hit points left.\n");
								}
								
							}
		
						}else {
							System.out.println(second_fighter.name()+" attacks "+ first_fighter.name()+" but misses. "+first_fighter.name()+" has "+first_fighter.hitPoints()+" hit points left.\n");
						}
					
					}
			
				}	
//OTHER CASE, SECOND FIGHTER HITS FIRST
		
				if(myNum>0.5){
				//Declare that second fighter will attack first.
				System.out.println("\n"+second_fighter.name()+" will attack first.\n");
				
				
					for(int i=1; i<=10; i++){
						System.out.println("Round "+i+" :");
				
						//SECOND FIGHTER
						if((random.nextDouble()*(second_fighter.attackSpeed()))> (random.nextDouble()*(first_fighter.defenseLevel()))){
					
							System.out.print(second_fighter.name()+" hits "+ first_fighter.name()+". ");
					
								if(second_fighter.attack(first_fighter)){
									System.out.println(first_fighter.name()+" loses "+Fighter.loss+" hit points. "+first_fighter.name()+" was defeated!");
									break;
								}else{
									if(Fighter.choice==1){
									System.out.println(first_fighter.name()+" loses "+Fighter.loss+" hit points, and has "+first_fighter.hitPoints()+" left.\n");
									}else{
										System.out.println(first_fighter.name()+" has "+first_fighter.hitPoints()+" hit points left.\n");
										
									}
								}
						}else{
							System.out.println(second_fighter.name()+" attacks "+ first_fighter.name()+" but misses. "+first_fighter.name()+" has "+first_fighter.hitPoints()+" hit points left.\n");
						}
				
						//FIRST FIGHTER	
						
						if((random.nextDouble()*(first_fighter.attackSpeed()))> (random.nextDouble()*(second_fighter.defenseLevel()))){
				
							System.out.print(first_fighter.name()+" hits "+ second_fighter.name()+". ");
						
								if(first_fighter.attack(second_fighter)){
									System.out.println(second_fighter.name()+" loses "+Fighter.loss+" hit points. "+second_fighter.name()+" was defeated!");
									break;
								}else{
									if(Fighter.choice==1){
										System.out.print(second_fighter.name()+" loses "+Fighter.loss+" hit points, and has "+second_fighter.hitPoints()+" .\n");	
									}else{
										System.out.print(second_fighter.name()+" has "+second_fighter.hitPoints()+" hit points left.\n");
									}
									
								}
			
						}else {
							System.out.print(first_fighter.name()+" attacks "+ second_fighter.name()+" but misses. "+second_fighter.name()+" has "+second_fighter.hitPoints()+" hit points left.\n");
						}
					
					}
			
			
				}
		
		if(first_fighter.hitPoints()<=0 && second_fighter.hitPoints()>0){
		
			second_fighter.setHitPoints(second_fighter.max_hit_points);
			System.out.println("\n"+second_fighter.name()+" was restored back to health.");
			System.out.println("Please add a new fighter :\n\n");
			first_fighter.input();
			
		}else if(first_fighter.hitPoints()>0 && second_fighter.hitPoints()<=0){
			second_fighter.setHitPoints(second_fighter.max_hit_points);
			System.out.println("\n"+first_fighter.name()+" was restored back to health.");
			System.out.println("Please add a new fighter :\n\n");
			second_fighter.input();
		}
		
	}while(first_fighter.hitPoints()>0 || second_fighter.hitPoints()>0);
		
		
		
	}
}
