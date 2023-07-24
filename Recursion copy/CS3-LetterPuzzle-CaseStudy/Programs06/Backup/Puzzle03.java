// Puzzle03.java   10-29-11 by Leon Schram
//
// Stage 03 combines the features of Stage 01 and Stage 02.
// This stage assumes that the letters are in a predetermined alphabetical sequence.
// Clicking any cell will display the letter at the cell in the black text window.


import java.awt.*;
import java.applet.*;


public class Puzzle03 extends Applet
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
		drawLetter(g,"A",100,100);
		drawLetter(g,"B",300,100);
		drawLetter(g,"C",500,100);
		drawLetter(g,"D",100,300);
		drawLetter(g,"E",300,300);
		drawLetter(g,"F",500,300);
		drawLetter(g,"G",100,500);
		drawLetter(g,"H",300,500);
		drawLetter(g,"I",500,500);
	}

	public void drawGrid(Graphics g)
	{
		g.drawRect(100,100,600,600);
		g.drawLine(300,100,300,700);
		g.drawLine(500,100,500,700);
		g.drawLine(100,300,700,300);
		g.drawLine(100,500,700,500);
	}

	public void drawLetter(Graphics g,String letter, int x, int y)
	{
		int offSetX = x + 30;
		int offSetY = y + 175;
		g.setFont(new Font("Arial",Font.BOLD,200));
		g.drawString(letter,offSetX,offSetY);
	}

	public boolean mouseDown(Event e, int x, int y)
	{
		if(r11.inside(x,y))
			System.out.println("Clicked A");
		else if(r12.inside(x,y))
			System.out.println("Clicked B");
		if(r13.inside(x,y))
			System.out.println("Clicked C");
		if(r21.inside(x,y))
			System.out.println("Clicked D");
		if(r22.inside(x,y))
			System.out.println("Clicked E");
		if(r23.inside(x,y))
			System.out.println("Clicked F");
		if(r31.inside(x,y))
			System.out.println("Clicked G");
		if(r32.inside(x,y))
			System.out.println("Clicked H");
		if(r33.inside(x,y))
			System.out.println("Clicked I");
		return true;
	}

}






