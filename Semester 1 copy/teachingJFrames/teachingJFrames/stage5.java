import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;

public class stage5
{
	public static void main(String...args)
	{
		JFrame j = new JFrame();
		MyPanel4 m = new MyPanel4();
		j.setSize(m.getSize());
		j.add(m); //adds the panel to the frame so that the picture will be drawn
			      //use setContentPane() sometimes works better then just add b/c of greater efficiency.

	    j.addKeyListener(m);
	    j.addMouseListener(m);
		j.setVisible(true); //allows the frame to be shown.

		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes the dialog box exit when you click the "x" button.
	}

}

class MyPanel4 extends JPanel implements ActionListener, MouseListener, KeyListener
{
	private Timer time;
	private int ox,oy,rx,ry;
	private int add;
	private int change;

	MyPanel4()
	{
		ox = oy = 10;
		rx=ry=300;
		time = new Timer(15, this); //sets delay to 15 millis and calls the actionPerformed of this class.
		setSize(2000, 1500);
		setVisible(true); //it's like calling the repaint method.
		time.start();
		add = 1;
		change=1;
	}


	public void paintComponent(Graphics g)
	{
		switch (change)
		{
			case 1: 	g.setColor(new Color(0, 150, 150)); break;
			case 2: 	g.setColor(new Color(150, 150, 0)); break;
			case 3: 	g.setColor(new Color(150, 0,150)); break;
		}

		g.fillRect(0, 0, 2000, 1500);

		myRect(g,rx,ry);
		myOval(g,ox,oy);

	    g.setColor(Color.DARK_GRAY);
		g.setFont(new Font ("Arial", Font.BOLD, 25));
        g.drawString("Click the mouse on the screem to move the square", 100,500);
 	    g.drawString("Press 1,2, or 3 to change background color", 100,600);
	}

	public void actionPerformed(ActionEvent e)
	{
		ox+=add;
		oy+=add;
		if(ox==200 && oy==200)
			add*=-1;
		if(ox==10 && oy==10)
			add*=-1;

		repaint();
	}

	public void myRect(Graphics g,int x, int y)
	{
		g.setColor(Color.DARK_GRAY);
		g.fillRect(x-20,y-20,115,115);
		g.setColor(Color.RED);
		g.fillRect(x, y, 75,75);
	}
	public void myOval(Graphics g,int x, int y)
	{
	    g.setColor(Color.DARK_GRAY);
		g.fillOval(x-20,y-20,115,115);
		g.setColor(Color.RED);
		g.fillOval(x, y, 75,75);
	}

	public void mouseClicked(MouseEvent e)
	{
		rx = e.getX();
		ry = e.getY();
	}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}


	public void keyPressed(KeyEvent e)
	{
		  int code = e.getKeyCode();

		  switch (code)
		  {
		  	case '1': change = 1; break;
		  	case '2': change = 2; break;
		  	case '3': change = 3; break;
		  }

       /**code == KeyEvent.VK_RIGHT for right arrow
        * code == KeyEvent.VK_LEFT for left arrow
        * code == KeyEvent.VK_SPACE
        **/

	}

	public void keyReleased(KeyEvent e)	{}
	public void keyTyped(KeyEvent e){}

}