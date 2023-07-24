// Puzzle05.java   10-29-11 by Leon Schram
//
// Stage 05 scrambles the letters in the matrix randomly.
// Letter "I" is used to indicate a blank square.


import java.awt.*;
import java.applet.*;
import java.util.Random;


public class Puzzle05 extends Applet
{

	private Rectangle r11,r12,r13,r21,r22,r23,r31,r32,r33;
	private boolean scramble[];
	private String matrix[][];
	private Random rnd;

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
		scramble = new boolean[10];
		for (int k = 1; k <=9; k++)
			scramble[k] = false;
		rnd = new Random();
		for (int r = 1; r <= 3; r++)
			for (int c = 1; c <= 3; c++)
				matrix[r][c] = getLetter();
	}

	public String getLetter()
	{
		String letter = "";
		boolean Done = false;
		while(!Done)
		{
			int rndNum = rnd.nextInt(9) + 1;
			if (scramble[rndNum] == false)
			{
				letter = String.valueOf((char) (rndNum+64));
				scramble[rndNum] = true;
				Done = true;
			}
		}
		return letter;
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
		if (letter.equals("I"))
			g.drawString("",offSetX,offSetY);
		else
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






