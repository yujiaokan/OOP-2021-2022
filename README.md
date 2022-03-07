# DT228/DT282 Object Oriented Programming 2021-2022

# Teams Links for online classes:

- [Join the class on Teams](https://teams.microsoft.com/l/meetup-join/19%3ameeting_MTE2YWIwOTAtNmVmOS00MmIyLWIzYjYtZDBmN2QzYzI2Y2Ix%40thread.v2/0?context=%7b%22Tid%22%3a%22766317cb-e948-4e5f-8cec-dabc8e2fd5da%22%2c%22Oid%22%3a%2261aab78b-a857-4647-9668-83d4cca5de03%22%7d)

Resources
---------
- [Install the software you will need for this module](install.md)
* [The Java Tutorial from Oracle](http://docs.oracle.com/javase/tutorial/)
* [Games Fleadh](http://www.gamesfleadh.ie/)
* [The Nature of Code](http://natureofcode.com/)
* [The git manual - read the first three chapters](http://git-scm.com/documentation)
* [A video tutorial all about git/github](https://www.youtube.com/watch?v=p_PGUltnB6w)
* [The Processing language reference](http://processing.org/reference/)

## Contact the lecturer
* Email: bryan.duggan@tudublin.ie
* Web: http://bryanduggan.org

# Assessments

- [Assignments](assignments.md)

- Week 5 - Teams Submission
- Week 11 Lab Test 20% 
- Week 13 Assignment Submission - 30%
- End of Year exam - 50%

# Last years course
- https://github.com/skooter500/OOP-2020-2021

# Previous Years Lab Tests
- https://github.com/skooter500/OOP-LabTest-2020-Starter
- https://github.com/skooter500/OOP-LabTest-2020/
- https://github.com/skooter500/OOP-Test-2019-Starter
- https://github.com/skooter500/OOP-Test-2019-Solution
- https://github.com/skooter500/OOP-2018-Lab-Test-2
- https://github.com/skooter500/OOP_Labtest1_2017_Starter
- https://github.com/skooter500/OOP-LabTest1-2016

## Week 6 - Audio

### Lecture
- [Recording of the class](https://tudublin-my.sharepoint.com/:v:/g/personal/bryan_duggan_tudublin_ie/EVB4djPnFFtGhai0WdDX6fQBd9bUDVTcj-9jVwMzGCi0TA?e=xqOyVj)

### Lab
### Learning Outcomes
- Practice for loops
- Demonstrate an understanding of how digital audio works
- Practice computational thinking and problem solving
- Have fun making beautiful things 

Update your forks and have a look at Audio1.java this is the code we wrote on Monday with some modifications. Checkout the ```keyPressed``` function. This starts and restarts the audio file when you press space. Also it sets the value of the ```which``` variable to be the numbers 0-5 when you press the appropriate key on the keyboard. If your computer wont play the audio file for some reason,you can uncomment the code to read audio from the microphone instead or use a .wav file instead.

Also the code use the MP3 file in the repo and also the visualisation uses a buffer where each element is lerped. This is similar to how we lerped the amplitude on Monday

Ok now check out this video of 5 visuals you can make today. Pressing the keys 0-4 on the keyboard should change the visual in your sketch.

[![YouTube](http://img.youtube.com/vi/xF7VrXZqLko/0.jpg)](https://www.youtube.com/watch?v=xF7VrXZqLko)

- 0 - The wavy lines visual - To make this, flip the order of the x2, y2 parameters on the line
- 1 - The waveform
- 2 - The waveform drawn down the 4 sides of the screen
- 3 - The circle - Use the lerped amplitude to control the size of the circle
- 4 - The square - Again use the lerped amplitude to control the size of the square. You can also use rectMode(CENTER) to make the x and y parameters of the rect function determine the center of the rect rather than the coordinates of the top left corner
- 5 - There is no visual associated with 5 in the video, so come up with your own!

## Week 5 - Arrays
### Lecture
- [Recording of the class](https://tudublin-my.sharepoint.com/:v:/g/personal/bryan_duggan_tudublin_ie/Edw1fm7vefhMhbZWVnyJQT4BBfXQPzTg2soHMppqoV51BQ?e=PpPRit)
- [Recording of the Tutorial](https://tudublin-my.sharepoint.com/:v:/g/personal/bryan_duggan_tudublin_ie/ETzVZfvOpPlFkkY1DOatswcBnXHqOdvz8izb37PwlJIwMQ?e=wi4SVu)

### Lab
### Learning Outcomes
- Practice iterating over arrays
- Practice computational thinking

Check out this video of the assignment I wrote in GWBasic for the statistics module in first year WMT in Kevin St in 1990 (click the image for video):

[![YouTube](http://img.youtube.com/vi/p3Vui6q_wPw/0.jpg)](https://www.youtube.com/watch?v=p3Vui6q_wPw)

And here is the [source code](https://github.com/skooter500/StatsAssignment) in case you are interested!

Inspired by the video, see if you can write code to generate the following graphs of the rainfall data. Start with the file Arrays.java. You will find these *much easier* if you use the [map function](https://processing.org/reference/map_.html) we learned in Monday's class. 

When you are doing these, make sure your code works even if you change the size of the drawing window or change the values in the array.

- A bar chart:

  ![Sketch](images/p37.png)

  Start by drawing the axis, then draw the ticks and print the text, then draw the bars. You can use ```textAlign(CENTER, CENTER)``` to align the text
  Use the HSB color space to assign different colors to each bar

- A trend line:

	![Sketch](images/p38.png)

  This one is a bit trickier because you have to calculate the start xy and end xy for each line. Your for loop for drawing the trend lines can start at 1 instead of 0 and then you can get the previous value for the start of each line by taking rainfall[i - 1].

- A pie chart 

	![Sketch](images/p39.png)

	You can use the the [arc function](https://processing.org/reference/arc_.html) to draw arcs and sin & cos to calculate the x and y coordinates to print the text. This one is the most challenging. Remember that a pie chart shows the proportion of each data point in the sum of all the data, so you will have to calculate the sum of all the rain fall and figure out how much each month is relative to the sum. It's best to draw the segments first and then draw the labels. Your map function might look something like this:

	```Java
	float angle = map(rainfall[i], 0, sum, 0, TWO_PI);
	```

Don't forget to update your forks of the repository from my master branch and create a new branch for your work today!!

## Week 4 - Loops
### Lecture
- [Recording of the class](https://tudublin-my.sharepoint.com/:v:/g/personal/bryan_duggan_tudublin_ie/EdUrk_7Hf3hDvXYbJuwQcvkBrEkzVq0Wrn9aJQk5XL2jcw?e=mWbyOj)

### Lab
Keep working on the exercises from last week. If you have them all completed, you can try out [this lab about using git and github](gitlab.md).

## Week 3

### Lab

Update your forks and creat a branch on your repos for your work today:

Today you can edit the file Loops.java and try out these procedural drawing exercises. The variable ```mode``` will have the value of 0-9 depending on which number key is pressed. You can use it to switch the pattern being drawn:

### if statement 

- 3 exercises. Click the image for video:

[![YouTube](http://img.youtube.com/vi/18kMOeygmHA/0.jpg)](https://www.youtube.com/watch?v=18kMOeygmHA)

### for loops:

Use a loop, rect and the HSB colour space:

![Sketch](images/p31.png)

Use a loop, rect and the HSB colour space:

![Sketch](images/p35.png)

Use a loop, rect and the HSB colour space:

![Sketch](images/p36.png)

Use a loop, ellipse, and the HSB colour space:

![Sketch](images/p34.png)

Use a loop, ellipse and the HSB color space to draw this:

![Sketch](images/p33.png)

Use a nested loop to draw this:

![Sketch](images/p32.png)

Try and draw this using ONE for loop. You will need the [text](https://processing.org/reference/text_.html) and [textAlign](https://processing.org/reference/textAlign_.html) functions:

![Sketch](images/p27.png)

Use a nested loop to draw this:

![Sketch](images/p23.png)

Use sin and cos to draw this:

![Sketch](images/p30.png)

Use line, sin and cos to draw regular polygons like squares, pentagons, octogons etc:

![Sketch](images/p10.png)

Draw a procedural star like these:

![Sketch](images/p5.png)

### Lecture

- [Read the git manual](https://git-scm.com/docs/user-manual.html)
- The if statement
- While loops
- For loops
- [Video of the class](https://tudublin-my.sharepoint.com/:v:/g/personal/bryan_duggan_tudublin_ie/EVR0aklCcWhDqiFV5czKiRgBviepYTmsqh4ya2zXNV01rw?e=aiexCW)

## Procedural drawing exercises:

### if statement 

- 3 exercises. Click the image for video:

[![YouTube](http://img.youtube.com/vi/18kMOeygmHA/0.jpg)](https://www.youtube.com/watch?v=18kMOeygmHA)

### for loops:

Use a loop, rect and the HSB colour space:

![Sketch](images/p31.png)

Use a loop, rect and the HSB colour space:

![Sketch](images/p35.png)

Use a loop, rect and the HSB colour space:

![Sketch](images/p36.png)

Use a loop, ellipse, and the HSB colour space:

![Sketch](images/p34.png)

Use a loop, ellipse and the HSB color space to draw this:

![Sketch](images/p33.png)

Use a nested loop to draw this:

![Sketch](images/p32.png)

Try and draw this using ONE for loop. You will need the [text](https://processing.org/reference/text_.html) and [textAlign](https://processing.org/reference/textAlign_.html) functions:

![Sketch](images/p27.png)

Use a nested loop to draw this:

![Sketch](images/p23.png)

Use sin and cos to draw this:

![Sketch](images/p30.png)

Use line, sin and cos to draw regular polygons like squares, pentagons, octogons etc:

![Sketch](images/p10.png)

Draw a procedural star like these:

![Sketch](images/p5.png)

# Week 2

## Tutorial
- [BugZap Solution Video](https://tudublin-my.sharepoint.com/:v:/g/personal/bryan_duggan_tudublin_ie/EcBPzbh_BABHuhy-1Ep8RdYB8YPppi9-veboOAvVpN9TOg?e=64fMfu)

## Lecture
- [Video of Monday's class](https://tudublin-my.sharepoint.com/:v:/g/personal/bryan_duggan_tudublin_ie/EZC_GTlzu_NNoSCF6yvaZ7sB5qwT4X8Wi_Zodj0Fmj8p0Q?e=9By4UN)

## Lab

## Learning Outcomes
- Practice drawing stuff and working out co-ordinates
- Practice using variables and if statements in Java

This is a video of a silly game called Bugzap made in Java using the Processing libraries. Today we can make a part of this game in order to get some practice using variables in Java. 

[![YouTube](http://img.youtube.com/vi/s6PA8jtWneQ/0.jpg)](https://www.youtube.com/watch?v=s6PA8jtWneQ)

How you should do it:

Ok let's get the main game working first and not worry about the splash screen and the game over screen

- Update your fork of the repository from the master branch. To do this, cd to the folder where you have cloned *your* repository, (or clone it somewhere if you need to) and type:

```bash
git checkout master
git pull upstream master
```

- Create a branch for your work today by typing:

```
git checkout -b lab2
```

- Create a new class called BugZap.java in the ie.tudublin folder. Make it extend ```PApplet``` and add the ```settings```, ```setup``` and ```draw``` methods. Check out HelloProcessing2.java if you need examples for these. This class also has examples of the drawing methods with comments. You can also check out the [Processing reference]() if you are unsure about any of the methods.
- Call ```size``` in ```settings``` to set the size of the drawing window. 
- Edit the file Main.java so that it starts the BugZap class instead of the HelloProcessing2 class. I'll let you figure out how to do this :-)
- Make sure everything works by compiling and running your program before continuing!

Now we can draw the bug.

- Make fields of type ```float``` in the BugZap class for ```playerX```, ```playerY``` and ```playerWidth``` and give these default values. You can decide what these should be. There are built in variables called ```width``` and ```height``` that give the width and height of the drawing window. These only get assigned after size has been called, so if you want to use these to give values to playerX, playerY etc. put the code into the *setup* method. 
- Write a method called void ```void drawPlayer(float x, float y, float w)``` that draws the player character, centered around the parameters x, y. You can use the line method to do this. You can pass variables as parameters to this method and also things like ```x + 20```, ```w * 0.5f``` etc. I made an extra variable in this method called h for the height and set it to be half the w parameter. Don't forget to set the stroke color!
- Call this method from ```draw```, passing in the parameters playerX, playerY and playerWidth.
- Compile and run everything to make sure it's working before continuing.
- If everything is working ok, you should see the bug on the screen

Now lets get the player moving in response to the keys

Add this method to BugZap.java:

```Java
public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			System.out.println("Left arrow pressed");
		}
		if (keyCode == RIGHT)
		{
			System.out.println("Right arrow pressed");
		}
		if (key == ' ')
		{
			System.out.println("SPACE key pressed");
		}
	}	
```

- If you compile and run the program again you will see that some messages get printed out when you press various keys. If you are running in Visual Studio Code, you will see these messages appear in the Debug Console
- Modify this method to increment and decrement the playerX variable instead and you should be able to get the player to move left and right
- You might want to add if statements to this method to stop the player moving off the left and right side of the screens. If statements in Java are almost the same as in C!
- When the player presses SPACE you will want to draw a line for the player's laser.

The Bug

- In a similar way to how you made the player, make the Bug. Make variables and drawBug method. Don't forget to call the method from draw()
- To move the bug you can add a random amount to it's x coordinate on intervals. To generate a random number you can use the [random](https://processing.org/reference/random_.html) function.  
- One way to make stuff happen on an interval rather than every frame is to use the frameCount variable. This variable is a field in PApplet and it gets incremented automatically every time draw is called. Because draw gets called 60 times a second, you can do something every second with this code:

```Java
if ((frameCount % 60) == 0)
{
    // Do something
}
```

- You can print text to the screen using the [text](https://processing.org/reference/text_.html) function.

Ok you should now have the basics working. See if you can figure out how to check to see if the player hits the bug, add scoring, splash screen, game over screen and sound.


# Week 1 - Introduction

## Lecture
- [Introduction Slides](https://tudublin-my.sharepoint.com/:p:/g/personal/bryan_duggan_tudublin_ie/EYXKcGlJFllBoLfJ_GjdH8ABu2OQCKyRsXuqlPqb3yXMtA?e=7hN0YC)
- [Recording of the class](https://tudublin-my.sharepoint.com/personal/bryan_duggan_tudublin_ie/_layouts/15/onedrive.aspx?id=%2Fpersonal%2Fbryan%5Fduggan%5Ftudublin%5Fie%2FDocuments%2FRecordings%2FOOP%20Class%2D20220124%5F123041%2DMeeting%20Recording%2Emp4&parent=%2Fpersonal%2Fbryan%5Fduggan%5Ftudublin%5Fie%2FDocuments%2FRecordings)

## Tutorial
- [Coding Bat](https://codingbat.com/)
- [Recording of the tutorial](https://tudublin-my.sharepoint.com/:v:/g/personal/bryan_duggan_tudublin_ie/Ef4FQNmY0_RPhfThsQXdeA4B2KK_au45dNApXjVrfJkbZQ?e=JFDIGG)


## Lab
## Learning outcomes
- Set up Java, Visual studio code and the Java Extensions
- Fork the repo, configure the upstream remotes
- Write your first Java code using command line tools
- Test out Visual Studio Code

## Part 1 - Installing Java

Install the software you will need for this module and set up your path to the Java Development Kit. [This document explains what you need](install.md).

## Part 2 - Forking the repo

Firstly fork *this* repository by clicking the fork button above, so that you get your own copy of the course repo to work on this semester. Now create a new empty folder on your computer somewhere right click on the folder and choose git bash here. Alternatively you can start the bash and cd to the new folder. To clone the repository for your fork:

```bash
git clone https://github.com/YOURGITUSERNAME/OOP-2021-2022
```

Replace YOURGITUSERNAME with your github username. You can also copy the URL to the repo from your browser and paste it into the console. To paste into the bash on Windows is right click. You can use Cmd + C, Cmd + V on the Mac.

Now cd into the repo and check the origin and upstream remotes are set up correctly

```bash
cd OOP-2021-2022
git remote -v
```

You should see something like this:

```bash
origin  https://github.com/YOURGITUSERNAME/OOP-2021-2022 (fetch)
origin  https://github.com/YOURGITUSERNAME/OOP-2021-2022 (push)
upstream  https://github.com/skooter500/OOP-2021-2022 (fetch)
upstream  https://github.com/skooter500/OOP-2021-2022 (push)
```

If you don't see the upstream remote, you can set it up by typing

```bash
git remote add upstream https://github.com/skooter500/OOP-2021-2022
```
You can read more about forking a git repository and setting up the upstream remote in [this article](https://help.github.com/en/github/getting-started-with-github/fork-a-repo)

Once the upstream is setup, you will be able to push code to your own repo and also keep it up to date with the master branch of the changes I make each class.

If you already forked the repo before the lab, you may need to update your master branch from my master branch to get the changes I made:

```bash
git fetch
git checkout master
git pull upstream master
git push
```

## Part 3 - Compiling & running Java

Open the OOP-2021-2022 folder in Visual Studio Code. You can run your program by choosing Run | Start Debugger. *Important for users of the Lab computers* In the labs you should use the shell scripts ```compile.sh``` and ```run.sh``` located in the Java folder to compile and run your code. You can run these from the Bash. 

You should see

```
Hello world
Tara
Tara
```

On the terminal. If you do, then congratulations! You have successfully compiled and run your first Java program. Now create a branch to store your changes today. Best not to modify the master branch so you can keep it up to date with my changes:

```bash
git checkout -b lab1
```

- Make a private ```int``` field on the Cat class called numLives.
- Write public accessors for the field (see how I did this for the name field on the Animal class)
- Set the value of this field to 9 in the Cat constructor  
- Write a method (functions are called methods in Java) on the Cat class called kill. It should subtract 1 from numLives if numLives is > 0 and print the message "Ouch!". If numLives is 0, you should just print the message "Dead"
- Create a new instance of the Cat class like this

    ```Java
    Cat ginger = new Cat("Ginger");
    ```
- In the Main class in a loop, call kill on ginger until ginger is dead.
- Compile and run your program until you have no bugs and you get the desired output.

Commit and push your changes:

```bash
git add .
git commit -m "killing the cat"
git push --set-upstream origin lab1
```

The "--set-upstream origin lab1" option is only required the first time you commit onto a new branch. After that you can just type "git push"

## Part 4 - Hello Processing

Checkout the branch HelloProcessing by typing

```
git checkout HelloProcessing from the bash
```

Press F5 and if all goes well, you should see something that looks like this:

![Hello Processing](images/hello.png)

Use the shell scripts I mentioned above if you are using a lab computer.

If you are done check out the references for classes, packages, constructors and accessors below.

Also! [Read the first three chapters of the git manual](https://git-scm.com/docs/user-manual).

## Lecture
- [Introduction slides](https://tudublin-my.sharepoint.com/:p:/g/personal/bryan_duggan_tudublin_ie/EYXKcGlJFllBoLfJ_GjdH8ABu2OQCKyRsXuqlPqb3yXMtA?e=V9lhl6)
- [hello world](java/src/ie/tudublin)
- [Classes](https://docs.oracle.com/javase/tutorial/java/concepts/class.html)
- [Packages](https://docs.oracle.com/javase/tutorial/java/package/packages.html)
- [Constructors](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)
- [Accessors](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)

Some assignments from previous years:

- https://www.youtube.com/playlist?list=PL1n0B6z4e_E7Iwc8Uud1YlA_gOQXnmP3I

- https://www.youtube.com/watch?v=NGQbYEESZEg&list=PL1n0B6z4e_E7I2bIWWpH8NAa6kPx95sw5

- https://www.youtube.com/watch?v=zLXon_nlibY

- https://www.youtube.com/watch?v=vecMCz1eB1s

- https://www.youtube.com/watch?v=xlEudfLH6Fg

- https://www.youtube.com/watch?v=uykz5mCjV0w

- https://www.youtube.com/watch?v=sPjZSRCmt1U