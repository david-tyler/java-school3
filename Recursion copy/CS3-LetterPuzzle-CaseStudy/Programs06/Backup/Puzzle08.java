// Puzzle08.java   10-29-11 by Leon Schram
//
// This program reviews the <ImageIO> to read an external image file.


import java.awt.*;
import java.awt.image.BufferedImage;
import java.applet.*;
import java.io.*;
import javax.imageio.*;


public class Puzzle08 extends Applet
{

	private BufferedImage imageFile;


	public void init()
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
	}


}









