import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;

public class stage4
{
	public static void main(String...args)
	{
		JFrame j = new JFrame();
		MyPanel4 m = new MyPanel4();
		j.setSize(m.getSize());
		j.add(m); //adds the panel to the frame so that the picture will be drawn
			      //use setContentPane() sometimes works better then just add b/c of greater efficiency. 
		
		j.setVisible(true); //allows the frame to be shown.
			
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes the dialog box exit when you click the "x" button. 
	} 
    
}

class MyPanel4 extends JPanel implements ActionListener
{
	private Timer time; 
	private int startX, startY;
	private int add; 
	private Car c;
	
	MyPanel4()
	{
		startX = startY = 10; 
		time = new Timer(15, this); //sets delay to 15 millis and calls the actionPerformed of this class. 
		setSize(500, 500);
		setVisible(true); //it's like calling the repaint method. 
		time.start();
		add = 1; 
		c = createCar("Car.gif");
	}
	
	private Car createCar(String fileName)
	{
		return new Car(fileName);
	}
	
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 500, 500);
		g.drawImage(c.getImage(), startX, 155, null);
		g.setColor(Color.BLACK);
		g.fillRect(startX, startY, 50, 50);
		g.fillOval(Math.abs(startX-450), startY, 50, 50);
	}
		
	public void actionPerformed(ActionEvent e)
	{
		startX+=add;
		startY+=add;
		if(startX==200 && startY==200)
			add*=-1;
		if(startX==10 && startY==10)
			add*=-1;
		
		repaint();
	}
	
	
}

class Car
{
	private Image car;
	
	Car(String fileName)
	{
		try
		{
			car = ImageIO.read(new File(fileName));
		}
		catch(Exception e)	{}
	}
	
	public Image getImage()
	{
		return car;
	}
	
	public void setImage(String fileName)
	{
		try
		{
			car = ImageIO.read(new File(fileName));
		}
		catch(Exception e)	{}
	}
}