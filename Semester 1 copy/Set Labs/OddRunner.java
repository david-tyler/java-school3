//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class OddRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("oddevent.dat"));
		while(file.hasNext())
		{
			String str = file.nextLine();
			OddEvenSets a = new OddEvenSets(str);
			out.println(a);
		}
		//more test cases
				
	}
}