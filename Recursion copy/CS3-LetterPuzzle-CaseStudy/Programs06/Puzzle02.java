// Puzzle02.java   10-29-11 by Leon Schram
//
// Stage 02 creates a "drawLetter" method to place letters in the matrix squares.


import java.awt.*;
import java.applet.*;


public class Puzzle02 extends Applet
{

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

	public void drawLetter(Graphics g, String letter, int x, int y)
	{
		int offSetX = x + 30;
		int offSetY = y + 175;
		g.setFont(new Font("Arial",Font.BOLD,200));
		g.drawString(letter,offSetX,offSetY);
	}

}




