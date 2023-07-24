//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

public class RelativesRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("relatives.dat"));

		Relatives test = new Relatives();

		int num = file.nextInt();
		file.nextLine();
		for(int x = 0; x < num; x++)
		{
			test.setPersonRelative(file.nextLine());
		}

		out.println(test);

		String person = file.next();
		out.println(person+" is related to "+test.getRelatives(person));
	}
}