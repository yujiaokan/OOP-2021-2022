package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{

	int mode =5;
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
	float offset =0;
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
					fill(map(i,0,bars,0,255),255,255);
					rect(map(i,0,bars,0,500), 0, w, height);
					

				}
				break;

			case 1:

				//map(2,10,90,200,233);
				//r1=c-b r2=e-d (a-b/r1)*r2+d
				background(0);
				int b=mouseX / 20;
				float h=width / (float)b;
				//float h=height / (float)b;

				for(int i=0;i<b;i++)
				{
					noStroke();
					fill(map(i,0,b,0,255),255,255);
					float x=map(i,0,b,0,width);
					rect(x,x,h,h);
					rect((width-h)-x,x,h,h);
					

				}
				break;
			case 2:
			{
				background(255);
				//int c=mouseX / 20;
				//float d=width / (float)c;
				int circle=(int)(mouseX/20.0f);
				offset += (mouseY/100.0f);
				float d= width/(float) circle;
				//float colorGap=255/(float) bars;
				/*for(int i=0;i<c;i++)
				{
					noStroke();
					fill(map(i,0,c,0,255),255,255);
					//ellipse(map(i,0,c-1,d/2,width-(d/2)), 30, d, d);
					
					circle(map(i,0,c-1,d/2,width-(d/2)), 30, d);
					
					
					
					

				}*/
			
				for (int j =0;j<circle;j++)
				{
					for(int i=0; i<circle;i++)
					{
						noStroke();
						float c = map(i+j, 0, circle*2, 0, 255);
						fill(c,255,255);
						float x =map(i,0,circle-1,d/2.0f,width-(d/2.0f));
						float y =map(j,0,circle-1,d/2.0f,width-(d/2.0f));
						circle(x, y, d);
					}
				}
			}
				break;
			case 3:
			{
			    background(255);
				int c=mouseX / 20;
				float d=width / (float)c;
				//float colorGap=255/(float) bars;
				for(int i=0;i<c;i++)
				{
					noStroke();
					fill(map(i,0,c,0,255),255,255);
					ellipse(map(i,0,c-1,d/2,width-(d/2)), 30, d, d);
					
					circle(map(i,0,c-1,d/2,width-(d/2)), 30, d);
					
					
					
					

				}
			}
				break;

			case 4:
			{
				background(0);
				colorMode(RGB);
				float border = width * 0.1f;
				for (int i = -5; i<=5;i++)
				{
					float x = map(i,-5,5,border,width - border);
					stroke(0,255,0);
					line(x,border,x,height-border);
					line(border,x,width-border,x);
					fill(255);
					text(i,x,border * 0.5f);
					text(i, border * 0.5f,x);
				}
			}

			break;

			case 5:
			{
				background(0);
				colorMode(RGB);
				stroke(255);
				float cx = width/2;
				float cy= height/2;
				float radius = 200;
				int sides = (int) map(mouseX,1,width,2,10);
				for (int i = 1; i <= sides;i++)
				{
					float theta1 =map(i-1,0,sides,0, TWO_PI);
					float x1 =cx + cos(theta1) * radius;
					float y1 = cy + sin(theta1) * radius;

					float theta2 =map(i,0,sides,0, TWO_PI);
					float x2 =cx + cos(theta2) * radius;
					float y2 = cy + sin(theta2) * radius;

					line(x1, y1, x2, y2);
					//line(x1, y1, z1, x2, y2, z2);
					

				}


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
