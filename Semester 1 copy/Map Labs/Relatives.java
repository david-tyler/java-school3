//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

public class Relatives
{
	private Map<String,Set<String>> map;

	public Relatives()
	{
		map = new TreeMap();
	}

	public void setPersonRelative(String line)
	{
		String[] personRelative = line.split(" ");
		if(map.get(personRelative[0])==null)
		{
			Set <String> relative = new TreeSet();
			map.put(personRelative[0], relative);
		}
		Set <String> relative = map.get(personRelative[0]);
		for(int x =1; x<personRelative.length;x++)
			relative.add(personRelative[x]);
		map.put(personRelative[0], relative);
			
	}


	public String getRelatives(String person)
	{
		return map.get(person).toString();
	}


	public String toString()
	{
		String output="";
		for(String s : map.keySet())
		{
			output+= s + " is related to ";
			for(String rel : map.get(s))
				output += rel + " ";
			output+="\n";		
		}

		return output;
	}
}