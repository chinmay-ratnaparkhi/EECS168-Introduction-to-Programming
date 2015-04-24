/*File Name: Triangles.java
*	Author: Chinmay Ratnaparkhi	
*   KUID: 2736356
*	Email Address: c732r120@ku.edu
*	Lab Assignment: Lab-06
*	Description: This application draws a pyramid of triangles after taking input from the user 
*	Last Changed: March 16th 2013
* 
*   
*/
package edu.ku.eecs168.triangles;


import java.util.Random;

import android.graphics.Color;
import android.os.Bundle;


public class Triangles extends AbsTriangles {

    private int numTriangles = 10; 
    private Random ranGen;
    private int colorType;
    
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ranGen = new Random();
	}
	
	@Override
	public void onDialogReturned(int num) {
		numTriangles = num;
		repaint();
	}
	

    @Override
    public void colorRows() {
    	 

    	colorType = 1;
        repaint();
    }

    @Override
    public void colorRandom() {
        colorType = 2;
        repaint();
    }

    @Override
    public void colorGradient() {
        colorType = 3;
        repaint();
    }
	
	
	public int rgbToColor(int red, int green, int blue, int alpha) {
		int color = 0;
		color += blue;
		color += 256*green;
		color += 256*256*red;
		color += 256*256*256*alpha;
		return color;
	}
	
	
	@Override
	public void paint(Graphics canvas) {
		//clear the screen before we draw
		canvas.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
		
		
		//base of each triangle
		int base= canvas.getWidth()/numTriangles;
		//height of each triangle
		int roof= canvas.getHeight()/numTriangles;
		
		//where you start drawing first triangle
		int x= 0;
		int y= canvas.getHeight();
		
		
		//Outer loop defines the row-number and the inner loop defines number of triangles in the row
				
		for(int i=1; i<=numTriangles; i++){
			
					//random color for every row
						if(colorType==1){
						int colorVal = rgbToColor(ranGen.nextInt(256), ranGen.nextInt(256), ranGen.nextInt(256), 255); 
						canvas.setColor( colorVal );
			}	
				for(int j=i; j<=numTriangles; j++){
						//random color for every triangle
						if(colorType==2){
						int colorVal = rgbToColor(ranGen.nextInt(256), ranGen.nextInt(256), ranGen.nextInt(256), 255); 
						canvas.setColor( colorVal );
						
						//Gradually changing color
						}else if(colorType==3){
							int percentX =   (255 * x )/  canvas.getWidth();
							int colorVal = rgbToColor(percentX, 20, 50, 255);
							canvas.setColor( colorVal );
						
						}
						canvas.drawIsoTriangle(x, y, base, roof);
						x+=base;
				
				}
				//while adding a row the beggining point shifts upwards by height of a triangle and shifts to right by half the base.
			y-= roof;
			x= i*(base/2);
		}
		
	
	
		
		//TODO Within the nested for loops, create if-statements for the colorType (EECS 169 only) DELETE this comment when completed
		
	}
	
}
