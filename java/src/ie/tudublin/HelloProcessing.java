package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(RGB);
	
		
	}


	public void draw()
	{	
		
		background(255,0,0);
	

		stroke(0);
		fill(255,255,0);
		circle(250,250,350);
		noFill();
		noStroke();
	
		fill(137,207,240);
		triangle(50, 400, 250, 30, 445, 400);//x1,y1,x2,y2,x3,y3#
		noFill();
		fill(244,194,194);
		ellipse(250,250,200,90);

		fill(0);
		circle(250,250,70);
		noFill();
		
	}
}
