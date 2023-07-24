// Unit04vST.java by Leon Schram 07-19-10
//
// This is the student starting file of the Unit04 lab assignment.
// The starting file is actually the Puzzle09.java stage, which is the
// finished puzzle game for a 3 X 3 matrix.


import java.awt.*;
import java.applet.*;
import java.util.Random;
import javax.swing.*;



public class Unit04vST extends Applet
{
	
	Rectangle r11,r12,r13,r21,r22,r23,r31,r32,r33;
	boolean scramble[];
	String matrix[][];
	Random rnd;
	int blankR;
	int blankC;
	int playLevel;
	
	
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
		
		matrix = new String[5][5];
		scramble = new boolean[10];
		for (int k = 1; k <=9; k++)
			scramble[k] = false;
		rnd = new Random();
		
		for (int r = 0; r <= 4; r++)
			for (int c = 0; c <= 4; c++)
				matrix[r][c] = "#";	
		
		for (int r = 1; r <= 3; r++)
			for (int c = 1; c <= 3; c++)
			{
				matrix[r][c] = getLetter();
				if (matrix[r][c].equals("I"))
				{
					blankR = r;
					blankC = c;
				}
			}
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
	
	
	public void drawLetter(Graphics g, String letter, int x, int y)
	{
		int offSetX = x + 30;
		int offSetY = y + 175;
		g.setFont(new Font("Arial",Font.BOLD,200));
		if (letter.equals("I"))
		{
			g.setColor(Color.white);
			g.fillRect(x+1,y+1,198,198);
		}
		else
		{
			g.setColor(Color.black);
			g.drawString(letter,offSetX,offSetY);			
		}
	}
	
	
	public boolean mouseDown(Event e, int x, int y)
	{
		if(r11.inside(x,y) && okSquare(1,1))
			swap(1,1);
		else if(r12.inside(x,y) && okSquare(1,2))
			swap(1,2);
		else if(r13.inside(x,y) && okSquare(1,3))
			swap(1,3);
		else if(r21.inside(x,y) && okSquare(2,1))
			swap(2,1);
		else if(r22.inside(x,y) && okSquare(2,2))
			swap(2,2);
		else if(r23.inside(x,y) && okSquare(2,3))
			swap(2,3);
		else if(r31.inside(x,y) && okSquare(3,1))
			swap(3,1);
		else if(r32.inside(x,y) && okSquare(3,2))
			swap(3,2);
		else if(r33.inside(x,y) && okSquare(3,3))
			swap(3,3);					
		return true;
	}
	
	
	public boolean okSquare(int r, int c)
	{
		boolean temp = false;
		if (matrix[r-1][c].equals("I"))
			temp = true;
		else if (matrix[r+1][c].equals("I"))
			temp = true;
		else if (matrix[r][c-1].equals("I"))
			temp = true;
		else if (matrix[r][c+1].equals("I"))
			temp = true;
		return temp;	
	}
	
	
	public void swap(int r, int c)
	{
		matrix[blankR][blankC] = matrix[r][c];
		matrix[r][c] = "I";
		blankR = r;
		blankC = c;
		repaint();
	}
	
			
	public void update(Graphics g)
	{
		paint(g);
	}
	
		
}




	
	
