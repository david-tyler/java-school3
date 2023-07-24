//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class Acronyms
{
	private Map<String,String> acronymTable;

	public Acronyms()
	{
		acronymTable = new TreeMap();
	}

	public void putEntry(String entry)
	{
		String line[] = entry.split(" - ");
		acronymTable.put(line[0], line[1]);
	}

	public String convert(String sent)
	{
		String [] sntc = sent.split(" ");
		String output ="";
		for(String s : sntc)
		{
			int count = 0;
			if(s.charAt(s.length()-1) == '.')
			{
				s = s.substring(0,s.length()-1);
				count++;
			}
			if(acronymTable.get(s) == null)
				output+=s;
			else 
				output+=acronymTable.get(s);
			if(count == 1)
				output+=".";
			output+=" ";	
		}
		return output;
	}

	public String toString()
	{
		return acronymTable.toString().replaceAll(",","\n");
	}
}