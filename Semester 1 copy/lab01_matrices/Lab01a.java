//© A+ Computer Science  -  www.apluscompsci.com
//Name - David
//Date -
//Lab  -

import static java.lang.System.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab01a
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab01a.dat"));
		
		while(file.hasNext())
		{
	      int size = file.nextInt();
		  PascalsTriangle test = new PascalsTriangle(size);
		  System.out.println(test);


	   }
	}
}