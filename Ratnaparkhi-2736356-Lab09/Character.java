
/* -----------------------------------------------------------------------------
 * File Name: 		Character.java
 * Author: 			Chinmay Ratnaparkhi, c732r120@ku.edu
 * Assignment:   	EECS-169 Lab09
 * Description:  	This program will define methods for drawing a character, 
 * 					moving it on the canvas on keyboard events and change color 
 * 					on mouse click event.
 * Last Modified	April 11th 2013
 ---------------------------------------------------------------------------- */

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JComponent;

public class Character {
       
		private int x, y;
		private double speed;
		Color color= new Color(255, 0, 0);


       
		public Character(int x, int y, double speed){
		this.x= x;
		this.y=y;
		this.speed=speed;
			
			
		}		
		public void moveLeft(JComponent canvas){
			
			x-=speed;
			if(x<=0){
				x=0;	
			}
				
			
			
		}
		public void moveRight(JComponent canvas){
			x+=speed;
			if(x>= (canvas.getWidth()-348)){
				x=canvas.getWidth()-348;
			}
		}
		public void moveUp(JComponent canvas){
			y-=speed;
		if(y<=0){
				y=0;
				
			}
		}		
		public void moveDown(JComponent canvas){
		y+= speed;
			if(y>= (canvas.getHeight()-95)){
				y=canvas.getWidth()-95;
				
			}
		}		
		public void incSpeed(double val){

			speed= speed+val;
					
		}
		public void decSpeed(double val){
			if (speed<=0){
				speed=0;			
			}else{
				speed= speed-val;
			}
		}
		public void draw(Graphics canvas){
			
			//red background
			canvas.setColor(color);
			canvas.fillRect(x, y, 345, 80);		
			
			//set color to black and draw 
			canvas.setColor(Color.BLACK);
			canvas.drawRect(x, y, 345, 80);			
			
			//Backdoor
			canvas.fillRect(x+20, y+25, 30, 50);
			//windows
			canvas.fillRect(x+60, y+30, 35, 25);
			canvas.fillRect(x+105, y+30, 35, 25);
			canvas.fillRect(x+150, y+30, 35, 25);
			canvas.fillRect(x+195, y+30, 35, 25);
			canvas.fillRect(x+240, y+30, 35, 25);
			
			//Frontdoor
			canvas.fillRect(x+285, y+25, 30, 50);
			//FrontWindow
			canvas.setColor(Color.GRAY);
			canvas.fillRect(x+325, y+15, 20, 35);
			
			//Headlights
			canvas.setColor(Color.BLACK);
			canvas.drawRect(x+340, y+55, 7, 20);
			canvas.setColor(Color.YELLOW);
			canvas.fillRect(x+340, y+55, 7, 20);
			
			//First Wheel
			canvas.setColor(Color.BLACK);
			canvas.fillOval(x+60, y+65, 30, 30);
			canvas.setColor(Color.WHITE);
			canvas.fillOval(x+73, y+78, 5, 5);
			
			
			//Second Wheel
			canvas.setColor(Color.BLACK);
			canvas.fillOval(x+240, y+65, 30, 30);
			canvas.setColor(Color.WHITE);
			canvas.fillOval(x+253, y+78, 5, 5);
					
		}
	

		public void changeColors(){
			
			Random generator = new Random();
        	int red= generator.nextInt(256);
        	int blue= generator.nextInt(256);
        	int green= generator.nextInt(256);

        	
        	color = new Color(red,green,blue);
        	
			
		}
        
}
