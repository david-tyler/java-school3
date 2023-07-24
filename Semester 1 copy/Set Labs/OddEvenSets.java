//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenSets
{
	private Set<Integer> odds;
	private Set<Integer> evens;

	public OddEvenSets()
	{
		odds = new TreeSet();
		evens = new TreeSet();
	}

	public OddEvenSets(String line)
	{
		String [] arr = line.split(" ");
		odds = new TreeSet();
		evens = new TreeSet();
		for(String x: arr)
		{
			if(Integer.valueOf(x)%2 != 0)
				odds.add(Integer.valueOf(x));
			else if(Integer.valueOf(x)%2 == 0)
				evens.add(Integer.valueOf(x));
		}
		
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}
}