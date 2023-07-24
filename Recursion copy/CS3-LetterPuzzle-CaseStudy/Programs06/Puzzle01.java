// Puzzle01.java    10-29-11 by Leon Schram
//
// Stage 01 of the puzzle shows that the correct cell is clicked by the mouse.


import java.awt.*;
import java.applet.*;


public class Puzzle01 extends Applet
{

	private Rectangle r11,r12,r13,r21,r22,r23,r31,r32,r33;


	public void init()
	{
		r11 = new Rectangle(100,100,200,200);
		r12 = new Rectangle(300,100,200,200);
		r13 = new Rectangle(500,100,200,200);
		r21 = new Rectangle(100,300,200,200);
		r22 = new Rectangle(300,300,200,200);
		r23 = new Rectangle(500,300,200,200);
		r31 = new Rectangle(100,500,200,200);
		r32 = new Rectangle(300,500,200,200);
		r33 = new Rectangle(500,500,200,200);
	}


	public void paint(Graphics g)
	{
		drawGrid(g);
	}


	public void drawGrid(Graphics g)
	{
		g.drawRect(100,100,600,600);
		g.drawLine(300,100,300,700);
		g.drawLine(500,100,500,700);
		g.drawLine(100,300,700,300);
		g.drawLine(100,500,700,500);
	}


	public boolean mouseDown(Event e, int x, int y)
	{
		if(r11.inside(x,y))
			System.out.println("Clicked inside Row 1, Col 1");
		else if(r12.inside(x,y))
			System.out.println("Clicked inside Row 1, Col 2");
		if(r13.inside(x,y))
			System.out.println("Clicked inside Row 1, Col 3");
		if(r21.inside(x,y))
			System.out.println("Clicked inside Row 2, Col 1");
		if(r22.inside(x,y))
			System.out.println("Clicked inside Row 2, Col 2");
		if(r23.inside(x,y))
			System.out.println("Clicked inside Row 2, Col 3");
		if(r31.inside(x,y))
			System.out.println("Clicked inside Row 3, Col 1");
		if(r32.inside(x,y))
			System.out.println("Clicked inside Row 3, Col 2");
		if(r33.inside(x,y))
			System.out.println("Clicked inside Row 3, Col 3");
		return true;
	}

}



