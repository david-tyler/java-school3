import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;

public class importingimage
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

	MyPanel4()
	{
		time = new Timer(15, this); //sets delay to 15 millis and calls the actionPerformed of this class.
		setSize(1500, 1500);
		setVisible(true); //it's like calling the repaint method.
		time.start();

	}


	public void paintComponent(Graphics g)
	{

		try
		{
			Image car = ImageIO.read(new File("Car.gif"));
			g.drawImage(car, 150, 155, null);
		}
		catch(Exception e)	{}


	}

	public void actionPerformed(ActionEvent e)	{}


}
