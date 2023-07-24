// Puzzle09.java   10-29-11 by Leon Schram
//
// This program uses the <getSubImage> method to create a second image object.
// After the original, complete picture is displayed, a square sub image is displayed
// on top of the picture.


import java.awt.*;
import java.awt.image.BufferedImage;
import java.applet.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;


public class Puzzle09 extends Applet
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
		g.drawImage(subImage,100,100,this);
	}

}









