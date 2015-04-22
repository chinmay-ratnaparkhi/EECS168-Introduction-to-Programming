package edu.ku.eecs168.lab4;

import android.graphics.Color;
import android.util.Log;
import edu.ku.swingemu.AndroidJApplet;

public class Lab4 extends AndroidJApplet {
	//The value of counter has been initialized to help keep track of current frame

	public int counter=0;

	public void paint(Graphics canvas) {

                //increments the counter value by one (recall increment decrement operator in previous lab
		counter++;
                
                //the value of counter is now 1; so the following lines draws the smiley face on screen when counter=1 is true
		if(counter==1){
			canvas.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
			
			//set color and draw yellow background
			canvas.setColor(Color.YELLOW);
			canvas.fillOval(100, 50, 400, 400);		
			
			//set color to black and draw a smiley face
			canvas.setColor(Color.BLACK);
			canvas.drawOval(100, 50, 400, 400);			
			
			//eyes
			canvas.fillOval(220, 180, 25, 35);
			canvas.fillOval(360, 180, 25, 35);		
			//smile
			canvas.drawArc(185, 295, 230, 70, 180, 180);
		}else if(counter==2){
			
			canvas.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
			

			//set color and draw yellow background
			canvas.setColor(Color.YELLOW);
			canvas.fillOval(750, 50, 400, 400);		

			//set color to black and draw a face
			canvas.setColor(Color.BLACK);
			canvas.drawOval(750, 50, 400, 400);			
			
			//eyes
			canvas.fillOval(870, 180, 25, 35);
			canvas.fillOval(1010, 180, 25, 35);		
			//	Frown
			canvas.drawArc(835, 295, 230, 70, 180, -180);		
			
			counter=0;
		}

        

		
	}

}

