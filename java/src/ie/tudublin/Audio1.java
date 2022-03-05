package ie.tudublin;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;

public class Audio1 extends PApplet
{
    Minim minim;
    AudioPlayer ap;
    AudioInput ai;
    AudioBuffer ab;

    public void settings()
    {
        size(1024, 500);
    }

    int which= 0;

    float[] lerpedBuffer;

    public void setup()
    {
        minim = new Minim(this);
        ap=minim.loadFile("heroplanet.mp3", width);
        ai = minim.getLineIn(Minim.MONO, width, 44100, 16);
        ab = ai.mix; 
        ap.play();
        colorMode(HSB);

        y = height / 2;
        //smoothedY = y;
    }

    public void keyPressed() {
		if (keyCode>='0' && keyCode<=6)
        {
            which = keyCode -'0';
        }
        if (keyCode == ' ')
        {
            if(ap.isPlaying())
            {
                ap.pause();
            }
            else{
                ap.rewind();
                ap.play();
            }
        }
        if(keyCode == UP)
        {
            twoCubes = ! twoCubes;
        }
	}

    private boolean twoCubes = false;

    public void draw()
    {
        background(0);
        stroke(255);
        float halfH = height / 2;
        float average = 0;
        float sum = 0;
        for(int i = 0 ; i < ab.size() ; i ++)
        {
            //float c = map(ab.get(i), -1, 1, 0, 255);
            //float c = map(i, 0, ab.size(), 0, 255);
            //stroke(c, 255, 255);
            //line(i, halfH, i, halfH + ab.get(i) * halfH);
            sum += abs(ab.get(i));
        }
        average= sum / (float) ab.size();

        stroke(255);
        fill(0, 255, 255);        
        lerpedA = lerp(lerpedA, average, 1.0f);//lerpedA= a+(b-a)*t=lerpedA+(average-lerpedA)*1.0f
        //circle(width / 2, halfH, lerpedA * 5000);

        //circle(100, y, 50);
        //y += random(-10, 10);
        //smoothedY = lerp(smoothedY, y, 0.1f);        
       // circle(200, smoothedY, 50);
       switch(which)
       {
           case 0:
           {
               for (int i =0 ; i<ab.size();i++)
               {
                   float c=map(i,0,ab.size(),0,255);
                   stroke(c,255,255);
                   lerpedBuffer[i]=lerp(i, ab.get(i), 0.1f);

                   line(i, halfH - lerpedBuffer[i] * halfH * 4, i, halfH + lerpedBuffer[i] * halfH * 4);
               }
           }
        

       }


    }
    
    float y;
    //float smoothedY;
    float lerpedA = 0;

    
}