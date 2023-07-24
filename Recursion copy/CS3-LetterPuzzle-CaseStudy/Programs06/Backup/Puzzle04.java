// Puzzle04.java   10-29-11 by Leon Schram
//
// Stage 04 appears similar to Stage 03, but a matrix array is now used to store the letter values.


import java.awt.*;
import java.applet.*;


public class Puzzle04 extends Applet
{

	private Rectangle r11,r12,r13,r21,r22,r23,r31,r32,r33;
	private String matrix[][];


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
		matrix = new String[4][4];
		matrix[1][1] = "B";
		matrix[1][2] = "C";
		matrix[1][3] = "D";
		matrix[2][1] = "E";
		matrix[2][2] = "F";
		matrix[2][3] = "G";
		matrix[3][1] = "H";
		matrix[3][2] = "I";
		matrix[3][3] = "A";
	}


	public void paint(Graphics g)
	{
		drawGrid(g);
		drawLetter(g,matrix[1][1],100,100);
		drawLetter(g,matrix[1][2],300,100);
		drawLetter(g,matrix[1][3],500,100);
		drawLetter(g,matrix[2][1],100,300);
		drawLetter(g,matrix[2][2],300,300);
		drawLetter(g,matrix[2][3],500,300);
		drawLetter(g,matrix[3][1],100,500);
		drawLetter(g,matrix[3][2],300,500);
		drawLetter(g,matrix[3][3],500,500);
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
			System.out.println("Clicked " + matrix[1][1]);
		else if(r12.inside(x,y))
			System.out.println("Clicked " + matrix[1][2]);
		if(r13.inside(x,y))
			System.out.println("Clicked " + matrix[1][3]);
		if(r21.inside(x,y))
			System.out.println("Clicked " + matrix[2][1]);
		if(r22.inside(x,y))
			System.out.println("Clicked " + matrix[2][2]);
		if(r23.inside(x,y))
			System.out.println("Clicked " + matrix[2][3]);
		if(r31.inside(x,y))
			System.out.println("Clicked " + matrix[3][1]);
		if(r32.inside(x,y))
			System.out.println("Clicked " + matrix[3][2]);
		if(r33.inside(x,y))
			System.out.println("Clicked " + matrix[3][3]);
		return true;
	}

}






