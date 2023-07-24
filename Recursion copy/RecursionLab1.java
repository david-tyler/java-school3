// This is the Student Version of the GraphicsLab07 assignment.

// RecursionLab.java.The Disappearing Squares Program
// This is the student, starting version of the RecursionLab assignment.

import java.awt.*;
import java.awt.event.*;

public class RecursionLab1
{
		public static void main(String args[])
		{
				Windows win = new Windows();
				win.setSize(1000,750);
				win.addWindowListener(new WindowAdapter() {public void
				windowClosing(WindowEvent e) {System.exit(0);}});
				win.show();
		}
}

class Windows extends Frame
{
    public void paint(Graphics g)
    {
    		drawSquare(g, 10, 100, 200);
    		drawSquare2(g,800,550,200);
    }
    
    public void drawSquare(Graphics g, int x, int y, int size)
    {
    	if(x==10)
    		g.fillRect(x,y,size,size);
    	if(x<1000 && y<375)
    	{
    		x+=size+10;
    		double z = size*.75;
    		y=300-(int)z;
    		g.fillRect(x,y,(int)z,(int)z);
    		drawSquare(g,x,y,(int)z);
    	}
    }
   public void drawSquare2(Graphics g, int x, int y, int size)
    {
    	if(x==800)
    		g.fillRect(x,y,size,size);
    	if(x<1000 && y>=375)
    	{
    		double z = size*.75;
    		x-=(int)(z+10);
    		g.fillRect(x,y,(int)z,(int)z);
    		drawSquare2(g,x,y,(int)z);
    	}
    }
}
