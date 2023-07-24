//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab01b
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner( new File("lab01b.dat") );
		int z = file.nextInt();
		file.nextLine();
		for( int x = 0; x < z; x++)
		{
			String line = file.nextLine();
			FancyWord one = new FancyWord(line);
			System.out.println( one );
		}



	}
}
