import java.applet.*;
import java.awt.*;

public class MovingText extends Applet implements Runnable{
    int x = 100, y = 100;   
    int dx = 1;       
    Thread t;
    boolean Flag;
    
    public void start() 
	{
		t = new Thread(this);
		Flag=false; 
		t.start();
    }
    public void paint(Graphics g ) {
        g.drawString("Hello World",x,y);
    }
    public void run()
    {
        while(true){
            if(Flag)
                break;
                if ((x + dx < 0) || (x + dx > getBounds().width)) 
                    x = 10;
                x += dx;
                try
			{
				Thread.sleep(5);
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
		Flag=true;
		t=null;
	}
}