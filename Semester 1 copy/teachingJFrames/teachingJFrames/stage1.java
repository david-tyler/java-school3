import java.awt.*;
import javax.swing.*;

public class stage1 
{
	public static void main(String...args)
	{
		JFrame j = new JFrame();
		MyPanel m = new MyPanel();
		j.setSize(500, 500);
		m.setSize(j.getSize());
		j.add(m); //adds the panel to the frame so that the picture will be drawn
		
		j.setVisible(true); //allows the frame to be shown.
		m.setVisible(true); //allows the panel to be shown.
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes the dialog box exit when you click the "x" button. 
	} 
    
}

class MyPanel extends JPanel
{
	//there is no need for a constructor in this class since there is only one function
	//drawing a picture.
	
	//use paintComponent instead of paint
	public void paintComponent(Graphics g)
	{
		g.fillRect(10, 10, 200, 200);
	}
}