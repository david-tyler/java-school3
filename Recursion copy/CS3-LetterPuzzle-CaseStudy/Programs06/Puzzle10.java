// Puzzle10.java   10-29-11 by Leon Schram
//
// This program shows how a sub image can move around the applet window.
// A "delay" method is added to slow down the movement of the tile.


import java.awt.*;
import java.awt.image.BufferedImage;
import java.applet.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;


public class Puzzle10 extends Applet
{

	private BufferedImage imageFile;
	private BufferedImage subImage;

	public void init()
	{
		readImageFile();
		subImage = imageFile.getSubimage(300,300,200,200);
	}

	public void readImageFile()
	{
		try
        {
            imageFile = ImageIO.read(new File("Food.JPG"));
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
	}

	public void paint(Graphics g)
	{
		g.drawImage(imageFile,100,100,this);
		delay(5000);
		for (int y = 100; y <= 500; y+=200)
		{
			for (int x = 100; x <= 500; x+=200)
			{
				g.drawImage(subImage,x,y,this);
				delay(500);
			}
		}
	}

	public static void delay(int n)
	{
		long startDelay = System.currentTimeMillis();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.currentTimeMillis();
	}

}









