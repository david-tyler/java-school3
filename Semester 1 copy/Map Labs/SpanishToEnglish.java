//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class SpanishToEnglish
{
	private Map<String,String> pairs;

	public SpanishToEnglish()
	{
		pairs = new TreeMap();
	}

	public void putEntry(String entry)
	{
		String[] list = entry.split(" ");
		pairs.put(list[0], list[1]);
	}

	public String translate(String sent)
	{
		String [] sntc = sent.split(" ");
		String output ="";
		for(String s : sntc)
		{
			if(pairs.get(s) == null)
				output+=s;
			else 
				output+=pairs.get(s);
			output+=" ";	
		}
		return output;
	}

	public String toString()
	{
		return pairs.toString().replaceAll("\\,","\n");
	}
}