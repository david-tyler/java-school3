//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  - BlockTestOne

import static java.lang.System.*;
import java.awt.Color;

class BlockTestOne
{
	public static void main( String args[] )
	{
		Block one = new Block();
		out.println(one);

		Block two = new Block(50,50,30,30);
		out.println(two);

		Block three = new Block(350,350,15,15,Color.red);
		out.println(three);

		Block four = new Block(450,50,20,60, Color.green);
		out.println(four);
	}
}