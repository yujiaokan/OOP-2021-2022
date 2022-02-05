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
		//background(0);

		/*x1 = random(0, width);
		x2 = random(0, width);
		y1 = random(0, height);
		y2 = random(0, height);

		float range = 5;

		x1dir = random(-range, range);
		x2dir = random(-range, range);
		y1dir = random(-range, range);
		y2dir = random(-range, range);

		smooth();*/
		
	}

	/*float x1, y1, x2, y2;
	float x1dir, x2dir, y1dir, y2dir;
	float c = 0;*/
	
	public void draw()
	{	
		//stroke(255);
		background(255,0,0);
		//line(10,10,200,200);//x1,y1,x2,y2
		//circle(250,250,400);//xc,yc,r
		//ellipse(50,200,90,200);//cx,cy,w,h

		stroke(0);
		fill(255,255,0);
		circle(250,250,350);
		noFill();
		noStroke();
		//rectMode(CENTER);
		//rect(300, 20, 100, 20);//tlx,tly,w,h

		//rectMode(CORNER);
		//rect(200,20,100,20);//tlx,tly,w,h

		//point(20,300);
		fill(137,207,240);
		triangle(50, 400, 250, 30, 445, 400);//x1,y1,x2,y2,x3,y3#
		noFill();
		fill(244,194,194);
		ellipse(250,250,200,90);

		fill(0);
		circle(250,250,70);
		noFill();
		/*strokeWeight(2);
		stroke(c, 255, 255);
		c = (c + 1f) % 255;
		line(x1, y1, x2, y2);

		x1 += x1dir;
		x2 += x2dir;
		y1 += y1dir;
		y2 += y2dir;
		
		if (x1 < 0 || x1 > width)
		{
			x1dir = - x1dir;
		}
		if (y1 < 0 || y1 > height)
		{
			y1dir = - y1dir;
		}

		if (x2 < 0 || x2 > width)
		{
			x2dir = - x2dir;
		}
		if (y2 < 0 || y2 > height)
		{
			y2dir = - y2dir;
		}*/
	}
}
