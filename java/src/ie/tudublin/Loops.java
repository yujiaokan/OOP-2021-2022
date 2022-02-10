package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{

	int mode =0;
	public void settings()
	{
		size(500, 500);
		//size(width, height);
	}

	public void setup() {
		colorMode(HSB);
		//background(0);
		
	}
	public void keyPressed()
	{
		if (key >= '0' && key <='9')
		{
			mode = key - '0';
		}
		println(mode);
	}
	/*float magicMap(float a, float b,float c,float d,float e)
	{
		float output;
		a -=b;
		c -=b;
		e -=d;

		output =((a/c)*e)+d;
		return output;

	}
	
	float magicMap1(float a, float b,float c,float d,float e)
	{
		float r1 = c-b;
		float r2 =e-d;
		float howFar= a-b;

		return d+((howFar/r1)*r2);
	}*/
	public void draw()
	{	
		switch(mode)
		{
			case 0:
				background(0);

				int bars=mouseX / 20;
				float w=width / (float)bars;
				//float colorGap=255/(float) bars;
				for(int i=0;i<bars;i++)
				{
					noStroke();
					rect(map(i,0,bars,0,500), 0, w, height);
					fill(map(i,0,bars,0,255),255,255);

				}
				break;

				

		}
		

		/*noStroke();
		fill(255,0,0);
		rect(0, 0, 50, 600);
		noFill();
		noStroke();
		fill(255,128,0);
		rect(50, 0, 50, 600);
		noFill();
		noStroke();
		fill(255,191,0);
		rect(100, 0, 50, 600);
		noFill();
		noStroke();
		fill(128,255,0);
		rect(150, 0, 50, 600);
		noFill();
		noStroke();
		fill(0,255,0);
		rect(200, 0, 100, 600);
		noFill();
		noStroke();
		fill(0,255,128);
		rect(300, 0, 50, 600);
		noFill();
		noStroke();
		fill(0,255,255);
		rect(350, 0, 50, 600);//（ ，，宽度，高度）
		noFill();
		noStroke();
		fill(0,128,255);
		rect(400, 0, 50, 600);
		noFill();
		noStroke();
		fill(0,0,255);
		rect(450, 0, 50, 600);*/

		/*noStroke();
		fill(255,0,0);
		rect(0, 0, 50, 50);
		noFill();
		noStroke();
		fill(255,128,0);
		rect(50, 50, 50, 50);
		noFill();
		noStroke();
		fill(255,191,0);
		rect(100, 100, 50, 50);
		noFill();
		noStroke();
		fill(128,255,0);
		rect(150, 150, 50, 50);
		noFill();
		noStroke();
		fill(0,255,0);
		rect(200, 200, 50, 50);
		noFill();
		noStroke();
		fill(0,255,128);
		rect(250, 250, 50, 50);
		noFill();
		noStroke();
		fill(0,255,255);
		rect(300, 300, 50, 50);//（ ，，宽度，高度）
		noFill();
		noStroke();
		fill(0,128,255);
		rect(350, 350, 50, 50);
		noFill();
		noStroke();
		fill(0,0,255);
		rect(400, 400, 50, 50);
		noFill();
		noStroke();
		fill(255,0,191);
		rect(450, 450, 50, 50);*/

		/*fill(244,194,194);
		ellipse(25,30,50,50);
		noFill();
		fill(244,194,194);
		ellipse(75,30,50,50);
		noFill();
		fill(244,194,194);
		ellipse(125,30,50,50);
		noFill();
		fill(244,194,194);
		ellipse(175,30,50,50);
		noFill();
		fill(244,194,194);
		ellipse(225,30,50,50);
		noFill();
		fill(244,194,194);
		ellipse(275,30,50,50);
		noFill();
		fill(244,194,194);
		ellipse(325,30,50,50);
		noFill();
		fill(244,194,194);
		ellipse(375,30,50,50);
		noFill();
		fill(244,194,194);
		ellipse(425,30,50,50);
		noFill();
		fill(244,194,194);
		ellipse(475,30,50,50);
		noFill();

		//ellipse(a, b, c, d);*/


		
		
	}
}
