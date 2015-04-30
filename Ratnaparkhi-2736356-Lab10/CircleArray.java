/* -----------------------------------------------------------------------------
 * File Name: 		CircleArray.java
 * Author: 		Chinmay Ratnaparkhi, c732r120@ku.edu
 * Assignment:   	EECS-169 Lab10
 * Description:  	This program will draw ovals on the screen by taking th number
 * 					input from the user and every some time the oldest one will 
 * 					be replaced with a new one with new color and new positioin.
 * Last Modified	April 19th 2013
 ---------------------------------------------------------------------------- */

package edu.ku.eecs168.circleArray;

import android.os.Bundle;
import android.util.Log;

import java.util.Random;
import android.graphics.Color;
public class CircleArray extends AbsCircleArray {
	private Random random;
	
	
	private boolean first_execution=true;
	private int circleDiameter;
	private int x[];
	private int y[];
	private int color[];
	private int N_circles;

	
	
	public CircleArray() {
		N_circles=20;
		random = new Random();
		circleDiameter=200;
		
	}
	
	
	@Override
	public void paint(Graphics canvas) {
		canvas.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
			
		if(first_execution){
				
				first_execution= false;
				x= new int[N_circles];
				y= new int[N_circles];
				color= new int[N_circles];
				canvas.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
				canvas.setColor(Color.BLACK);		
				
				for(int i=0; i<x.length; i++){
					int myColor= rgbToColor(random.nextInt(256), random.nextInt(256),random.nextInt(256),255);
					
					x[i]= random.nextInt(canvas.getWidth()-circleDiameter);
					y[i]= random.nextInt(canvas.getHeight()-circleDiameter);
					color[i]=myColor;
					
					canvas.setColor(color[i]);
					canvas.fillOval(x[i], y[i], (circleDiameter/2), (circleDiameter/2));
					canvas.setColor(Color.BLACK);
					canvas.drawOval(x[i], y[i], (circleDiameter/2), (circleDiameter/2));
				
				}
		
		}
		
			
			for(int i=1; i<x.length; i++){
				
				canvas.setColor(color[i]);
				canvas.fillOval(x[i], y[i], (circleDiameter/2), (circleDiameter/2));
				canvas.setColor(Color.BLACK);
				canvas.drawOval(x[i], y[i], (circleDiameter/2), (circleDiameter/2));
				
				x[i-1]=x[i];
				y[i-1]=y[i];
				color[i-1]=color[i];	
				x[i]= x[i+1];
				y[i]=y[i+1];
				color[i]=color[i+1];	
				
		}
			int newColor= rgbToColor(random.nextInt(256), random.nextInt(256),random.nextInt(256),255);
			color[color.length-1]= newColor;
			x[x.length-1]= random.nextInt(canvas.getWidth()-circleDiameter);
			y[y.length-1]= random.nextInt(canvas.getHeight()-circleDiameter);
						
			canvas.setColor(color[color.length-1]);
			canvas.fillOval(x[x.length-1], y[y.length-1], (circleDiameter/2), (circleDiameter/2));
			canvas.setColor(Color.BLACK);
			canvas.drawOval(x[x.length-1], y[y.length-1], (circleDiameter/2), (circleDiameter/2));
			
	}
	
	@Override
	public void onDialogReturned(int num) {
		super.onDialogReturned(num);
		N_circles= num;	
		first_execution=true;
	}
	

	static public int rgbToColor(int red, int green, int blue, int alpha) {
		int color = 0;
		color += blue;
		color += 256*green;
		color += 256*256*red;
		color += 256*256*256*alpha;
		return color;
	}
}