// Unit04vST.java by Leon Schram 07-19-10
//
// This is the student starting file of the Unit04 lab assignment.
// The starting file is actually the Puzzle09.java stage, which is the
// finished puzzle game for a 3 X 3 matrix.


import java.awt.*;
import java.awt.image.BufferedImage;
import java.applet.*;
import java.util.Random;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;



public class Unit04vS extends Applet
{
	
	Rectangle r11,r12,r13,r14,r21,r22,r23,r24,r31,r32,r33,r34,r41,r42,r43,r44;
	Rectangle[][] rect;
	boolean scramble[];
	String matrix[][];
	int matpic[][];
	Random rnd;
	int blankR;
	int blankC;
	int playLevel;
	int size;
	int length;
	String blankletter;
	BufferedImage pic;
	boolean ispic = false;
	int pr, pc;


	public void init()
	{
		String output = (String) (JOptionPane.showInputDialog(new JFrame(),"Enter Play Level \n3 - 3X3 Grid \n4 - 4X4 Grid \n5 - 5X5 Grid"));
		size = Integer.valueOf(output);
			ispic = true;
		if(ispic)
		{
			String imagefile = (String) (JOptionPane.showInputDialog(new JFrame(),"Enter the name of the file you would like to use: \n(Must be a 600x800 image)"));
			try
			{
				pic = ImageIO.read(new File(imagefile));
			}
			catch(Exception e)	{}
		}
	

		length = 800/size;
		if(ispic)
		{
			pr = pic.getHeight()/size;
			pc = pic.getWidth()/size;
		}
		blankletter = String.valueOf((char) (size*size-2+64));
		rect = new Rectangle[size+1][size+1];
		for(int i = 1; i <= size; i++)
		{
			for(int j = 1; j <= size; j++)
				rect[i][j] = new Rectangle(100+(i-1)*length,100+(j-1)*length,length,length);
		}

		matrix = new String[size+2][size+2];
		matpic = new int[size+2][size+2];
		scramble = new boolean[size*size+1];
		for (int k = 1; k <=size*size; k++)
			scramble[k] = false;
		rnd = new Random();

		for (int r = 0; r <= size+1; r++)
			for (int c = 0; c <= size+1; c++)
				matrix[r][c] = "#";

		for (int r = 1; r <= size; r++)
			for (int c = 1; c <= size; c++)
			{
				matrix[r][c] = getLetter();
				if (matrix[r][c].equals(blankletter))
				{
					blankR = r;
					blankC = c;
					if(ispic)
						matpic[r][c] = -1;
				}
				else if(ispic)
				{
					matpic[r][c] = (int)(matrix[r][c].charAt(0))-65; 
				}
			}
		
	}

	public String getLetter()
	{
		String letter = "";
		boolean Done = false;
		while(!Done)
		{
			int rndNum = rnd.nextInt(size*size) + 1;
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
		if(ispic)
		{
			g.drawImage(pic,0, 0, 100, 100, 0, 0, 600, 600, null);
			for(int i = 1; i <= size; i++)
			{
				for(int j = 1; j <= size; j++)
					drawPic(g,matpic[i][j],100+(i-1)*length,100+(j-1)*length);
			}
		}
		else
		{
			for(int i = 1; i <= size; i++)
			{
				for(int j = 1; j <= size; j++)
					drawLetter(g,matrix[i][j],100+(i-1)*length,100+(j-1)*length);
			}
		}
	}


	public void drawGrid(Graphics g)
	{
		g.setColor(Color.black);
		for(int i = 1; i <= size; i++)
		{
			for(int j = 1; j <= size; j++)
				g.drawRect(100+(i-1)*length,100+(j-1)*length,length,length);
		}
	}


	public void drawLetter(Graphics g, String letter, int x, int y)
	{
		int offSetX = x + 30 - (size-4)*10;
		int offSetY = y + 175 - (size-4)*35;

		g.setFont(new Font("Arial",Font.BOLD,length-20));
		if (letter.equals(blankletter))
		{
			g.setColor(Color.white);
			g.fillRect(x+1,y+1,length-1,length-1);
		}
		else
		{
			g.setColor(Color.black);
			g.drawString(letter,offSetX,offSetY);
		}
	}

	public void drawPic(Graphics g, int num, int x, int y)
	{
		int r = num/size;
		int c = num%size;

		if(num == -1)
		{
			g.setColor(Color.white);
			g.fillRect(x+1,y+1,length-1,length-1);
		}
		else
		{
			 g.drawImage(pic, x, y, x+length, y+length, r*pr, c*pc, (r+1)*pr, (c+1)*pc, null);
		}
	}


	public boolean mouseDown(Event e, int x, int y)
	{
		for(int i = 1; i <= size; i++)
		{
			for(int j = 1; j <= size; j++)
				if(rect[i][j].inside(x,y) && okSquare(i,j))
					swap(i,j);
		}
		return true;
	}


	public boolean okSquare(int r, int c)
	{
		boolean temp = false;
		if (matrix[r-1][c].equals(blankletter))
			temp = true;
		else if (matrix[r+1][c].equals(blankletter))
			temp = true;
		else if (matrix[r][c-1].equals(blankletter))
			temp = true;
		else if (matrix[r][c+1].equals(blankletter))
			temp = true;
		return temp;
	}

	public void swap(int r, int c)
	{
		matrix[blankR][blankC] = matrix[r][c];
		matrix[r][c] = blankletter;
		if(ispic)
		{
			matpic[blankR][blankC] = matpic[r][c];
			matpic[r][c] = -1;
		}
		blankR = r;
		blankC = c;
		repaint();
	}

	public void update(Graphics g)
	{
		paint(g);
	}
	
		
}




	
	
