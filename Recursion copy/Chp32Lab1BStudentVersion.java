// Lab32bst.java
// The student version of the Lab32 "Square Fractal" assignment.


import java.awt.*;
import java.awt.event.*;
 

public class Chp32Lab1BStudentVersion
{
	public static void main(String args[])
	{
		GfxApp gfx = new GfxApp();
		gfx.setSize(1920,1080);
		gfx.addWindowListener(new WindowAdapter() {public void
		windowClosing(WindowEvent e) {System.exit(0);}});
		gfx.show();
	}
}


class GfxApp extends Frame
{
	public void paint (Graphics g)
	{
		drawSquare1(g,480,270);
	}
	public void drawSquare1(Graphics g, int maxX, int maxY)
	{
		int x = 720;
		int y = 405;
		g.fillRect(x,y,maxX,maxY);
		drawTL(g,x,y,maxX,maxY);
		drawTR(g,x,y,maxX,maxY);
		drawBL(g,x,y,maxX,maxY);
		drawBR(g,x,y,maxX,maxY);
			
	}
	public void drawTL(Graphics g, int x, int y, int maxX, int maxY)
	{
		if(maxX<2 || maxY<2)
			return;
		x-=(maxX/2);
		y-=(maxY/2);
		maxX/=2;
		maxY/=2;
		g.fillRect(x,y,maxX,maxY);
		drawTL(g,x,y,maxX,maxY);
		drawTR(g,x,y,maxX,maxY);
		drawBL(g,x,y,maxX,maxY);
		
		
	}
	public void drawTR(Graphics g, int x, int y, int maxX, int maxY)
	{
		if(maxX<2 || maxY<2)
			return;
		else
		{
			x+=maxX;
			y-=(maxY/2);
			maxX/=2;
			maxY/=2;
			g.fillRect(x,y,maxX,maxY);
			drawTR(g,x,y,maxX,maxY);
			drawTL(g,x,y,maxX,maxY);
			drawBR(g,x,y,maxX,maxY);
		}
	}
	public void drawBL(Graphics g, int x, int y, int maxX, int maxY)
	{
		if(maxX<2 || maxY<2)
			return;
		else
		{
			x-=(maxX/2);
			y+=maxY;
			maxX/=2;
			maxY/=2;
			g.fillRect(x,y,maxX,maxY);
			drawBL(g,x,y,maxX,maxY);
			drawTL(g,x,y,maxX,maxY);
			drawBR(g,x,y,maxX,maxY);
		}
	}
	public void drawBR(Graphics g, int x, int y, int maxX, int maxY)
	{
		if(maxX<2 || maxY<2)
			return;
		else
		{
			x+=maxX;
			y+=maxY;
			maxX/=2;
			maxY/=2;
			g.fillRect(x,y,maxX,maxY);
			drawBR(g,x,y,maxX,maxY);
			drawBL(g,x,y,maxX,maxY);
			drawTR(g,x,y,maxX,maxY);
		}
	}
	private void delay(double n)
	{
		for (double k = 1; k < n; k+=0.001);
	}
			
}


