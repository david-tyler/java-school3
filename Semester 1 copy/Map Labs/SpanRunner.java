//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class SpanRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("spantoeng.dat"));

		SpanishToEnglish test = new SpanishToEnglish();

		int num = file.nextInt();
		file.nextLine();
		for(int i = 0; i < num; i++)
		{
			test.putEntry(file.nextLine());
		}

		out.println("\n====\tMAP CONTENTS\t====\n\n");
		out.println(test+"\n\n");


		out.println("\n====\tREAD LINES\t====\n\n");
		while(file.hasNext())
		{
			String sent = file.nextLine();
			out.println(test.translate(sent));
		}
	}
}