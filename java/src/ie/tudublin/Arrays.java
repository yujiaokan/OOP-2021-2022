package ie.tudublin;
 import processing.core.PApplet;
public class Arrays extends PApplet{
    
    int maxnu=0;
    int minnu=0;
    int mode=4;
    float sum =0;
    float[] a1 = new float[100];
    float[] a2;//if you get that one no point to memory
    String[] months = {"Jan","Feb","MAR","Apr","MAY","JAN","JULY","AGU","SPE","OCT","NOV","DER"};

    float[] rainfall = {45,37,55,27,38,50,79,48,104,31,100,58};
    //float k=0;
    public void settings(){
        //size(500, 500);
        size(400, 400);

    }
    public void setup(){
        
        
        for ( int i = 0;i<rainfall.length;i++){
            println(rainfall[i]+"\t"+ months[i]);
        }
        int j=0;
        for (float r:rainfall)
        {
            println(r+"\t"+months[j]);
        }

        for (int i= rainfall.length-1;i>=0;i--)
        {
            println(rainfall[i]+"\t"+months[i]);
        }
       
        for (int i= 0;i<rainfall.length;i++)
        {
            if (rainfall[i]<rainfall[minnu])
            {
                minnu=i;
            }
            else if (rainfall[i]>rainfall[maxnu])
            {
                maxnu=i;
            }
        }
        println(rainfall[minnu]+ months[minnu]);
        println(rainfall[maxnu]+ months[maxnu]);
        for (int i = 0; i < rainfall.length; i++)
        {
            sum =sum+rainfall[i];
        }
        
       // Float.MIN_VALUE;

    }
    public void draw(){

        switch (mode){
            case 0:
            {
                background(0);
                colorMode(HSB);
        
                //int bars = mouseX /20;
                float w = width/rainfall.length;
                noStroke();

                for (int i=0; i< rainfall.length;i++)
                {
                float x = map(i, 0, rainfall.length, 0, width);
                int c = (int)map(i, 0, rainfall.length, 0, 255);
			    fill(c,255,255);
                float h = map(rainfall[i], 0, rainfall[maxnu], 0, -height);
			    rect(x,height,w,h);
                fill(255);
                textAlign(CENTER,CENTER);
                text(months[i],x+(w/2),height-50);

                }
            }
            break;
            case 1:
            {
                background(0);
                colorMode(HSB);
                
                float border = width  * 0.1f;
                stroke(255);
                line(border, border, border, height-border);
                line(border, height-border, width-border, height-border);
                for (int i=0 ;i<=120;i=i+10)
                {
                    float y = map(i, 0, 120, height - border, border);
                    println(y);
                    line(border - 5, y, border, y);
                    
                    fill(255);
                    textAlign(CENTER, CENTER);
                    text(i, border / 2, y);
                    
                    
                }

                float w = (width - (border * 2.0f)) / (float)rainfall.length;
                
                for(int i = 0 ; i <rainfall.length; i ++)
                {
                    float x = map(i, 0, rainfall.length, border, width-border);
                    float c = map(i, 0, rainfall.length, 0, 255);
                    stroke(255);
                    fill(c, 255, 255);
                    float h = map(rainfall[i], 0, 120, 0, -height + (border * 2.0f)); 
                    
                    rect(x, height-border, w, h);
                    fill(255);
                    text(months[i], x + (w / 2), height - (border / 2));
    
                }
                
            }
            break;
            case 2:
            {
                background(0);
                colorMode(HSB);
                float j=10,k=0,l=0;
                float border = width  * 0.1f;
                //float w = (width - (border * 2.0f)) / (float)rainfall.length;
                stroke(255);
                line(border, border, border, height-border);
                line(border, height-border, width-border, height-border);
                for (int i=0 ;i<=120;i=i+10)
                {
                    float y = map(i, 0, 120, height - border, border);
                    line(border - 5, y, border, y);
                    
                    fill(255);
                    textAlign(CENTER, CENTER);
                    text(i, border / 2, y);
                    
                    
                }

               
                //float w = (width - (border * 2.0f)) / (float)rainfall.length;
                for(int i = 1 ; i < rainfall.length; i ++)
                {
                    //int x,y;
                    //float x1 = map(i, 0, rainfall.length, border, width-border);
                    //float x2 = map(i, 0, rainfall.length, border, width-border);
                    //float c = map(i, 0, rainfall.length, 0, 255);
                    
                    //fill(c, 255, 255);
                    float h1 = map(rainfall[i-1], 0, 120, 0, -height + (border * 2.0f)); 
                    float h2 = map(rainfall[i], 0, 120, 0, -height + (border * 2.0f)); 
                    float x1=border*i+j+k;
                    float y1=height+h1-50;
                    float x2=(border-15)*(2+i-1);
                    float y2=height+h2-50;
                    stroke(255);
                    line(x1, y1, x2, y2);
                    j=-30;
                    l=l+1;

                    if(l>1)
                    {
                        k=k+-15;
                    }



 
                    
                    //float h = map(rainfall[i], 0, 120, 0, -height + (border * 2.0f)); 
                    //rect(x, height-border, w, h);
                    //fill(255);
                    //text(months[i], x1 + (w / 2), height - (border / 2));
    
                }
                float w = (width - (border * 2.0f)) / (float)rainfall.length;
                for (int i=0;i<rainfall.length;i++)
                {
                    float x = map(i, 0, rainfall.length, border, width-border);
                    fill(255);
                    text(months[i], x + (w / 2), height - (border / 2));
    
                }

                
               
            }
            break;
            case 3:
            {
                
                background(0);
                /*float r = width * 0.3f;
                float cx = width / 2;
                float cy = height / 2;
                stroke(255);
                noFill();
                circle(cx, cy, r * 2.0f);
                //arc()
                arc(50, 55, 50, 50, 0, HALF_PI);
                //arc(a, b, c, d, start, stop, mode);
                ellipse(a, b, c, d);
                circle(x, y, extent);*/
                //size(400,400);
                //float x = width/2;
                //float y = height/2;
                //float d = width * 0.8f;
                //size(400,400);
                //arc(x, y, d, d, 0, QUARTER_PI);
                
                //arc(x, y, d-80, d-80, 0, HALF_PI);
                //size(400,400);
                //arc(x, y, d-160, d-160, 0, PI);
                //arc(x, y, d-240, d-240, 0, TWO_PI);
                //size(400, 400);
                //ellipse(100, 100, 200, 200);
                float deg = 45.0f;
                float rad = radians(deg);
                println(deg + " degrees is " + rad + " radians");
            }   

            break;
            case 4:
        
            {
                background(0);
                colorMode(HSB);
                /*float diameter = width*0.6f;
                
                
                for (int i = 0; i < rainfall.length; i++) {
                    int c = (int)map(i, 0, rainfall.length, 0, 255);
                    //int c = (int)map(i, 0, rainfall.length, 0, 255);
                    float angle = map(rainfall[i], 0, sum, 0, TWO_PI);
                    float lastAngle =0;
                    fill(c,255,255);
                    arc(width/2, height/2, diameter, diameter, lastAngle,angle+lastAngle);
                    lastAngle=lastAngle+angle;
                    //k=k+angle;
                    //lastAngle += radians(rainfall[i]);
                    }
                    */

                float border = width * 0.1f;                
                float thetaPrev = 0;
                float cx = width / 2;
                float cy = height / 2;
                for(int i = 0 ; i < rainfall.length ; i ++)
                {
                    float theta = map(rainfall[i], 0, sum, 0, TWO_PI);
                    textAlign(CENTER);
                    float thetaNext = thetaPrev + theta;
                    float radius = cx * 0.6f;       
                    float x = cx + sin(thetaPrev + (theta * 0.5f) + HALF_PI) * radius;      
                    float y = cy - cos(thetaPrev + (theta * 0.5f) + HALF_PI) * radius;
                    fill(255);
                    text(months[i], x, y);             
                    float c = map(i, 0, rainfall.length, 0, 255);
                    fill(c, 255, 255);       
                    stroke(255);
                    arc(cx, cy, cx, cy, thetaPrev, thetaNext);
                    thetaPrev = thetaNext;
                }
                fill(255);
                text("Rainfall piechart", width / 2, border / 2);
                }

            

        

        }
    }
}

