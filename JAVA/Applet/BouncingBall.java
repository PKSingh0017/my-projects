// This java applet program will show the bouncing balls

import java.applet.*;
import java.awt.*;

public class BouncingBall extends Applet implements Runnable 
{

	int x = 150, y = 150, r=20;   
	int dx = 11, dy = 7;          
	
	
	Thread t;
	boolean stopFlag;


	public void start() 
	{
		t = new Thread(this);
		stopFlag=false; 
		t.start();
	}


	public void paint(Graphics g) 
	{
		g.setColor(Color.red);
		g.fillOval(x-r, y-r, r*2, r*2);
	}


	public void run() 
	{
		while(true)
		{
			if(stopFlag)
				break;
			
			if ((x - r + dx < 0) || (x + r + dx > getBounds().width)) dx = -dx;
			if ((y - r + dy < 0) || (y + r + dy > getBounds().height)) dy = -dy;
	
			x += dx;  y += dy;

			try
			{
				Thread.sleep(50);
			}
			catch(Exception e)
			{
				System.out.println(e);
			};
			repaint();
		}
	}

	public void stop()
	{
		stopFlag=true;
		t=null;
	}
}
