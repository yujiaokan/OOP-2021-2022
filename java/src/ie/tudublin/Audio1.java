package ie.tudublin;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;

public class Audio1 extends PApplet {
    Minim minim;
    AudioPlayer ap;
    AudioInput ai;
    AudioBuffer ab;

    public void settings(){
        size(1024,500);
        
    }

    public void setup(){
        //colorMode(HSB);
        minim = new Minim(this);
        ai = minim.getLineIn(Minim.MONO,width,44100,16);
        ab = ai.mix;
    }

    public void draw(){
        background(0);
        colorMode(HSB);
        stroke(255);
        float halfh = height /2;
        for(int i= 0;i<ab.size();i++)
        {
            float c = map(i, 0, ab.size(), 0, 255);
            stroke(c,255,255);
            line(i, halfh,i,halfh+ab.get(i)*halfh);
        }

    }
}

