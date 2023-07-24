//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class IteratorReplacer
{
	private ArrayList<String> list;
	private String toRemove, replaceWith;

	public IteratorReplacer(String line, String rem, String rep)
	{
		list = new ArrayList<String>(Arrays.asList(line.split(" ")));
		toRemove = rem;
		replaceWith = rep;
	}


	public void replace()
	{
		ListIterator<String> it = list.listIterator();
		while(it.hasNext())
		{
			if(it.next().equals(toRemove))
			{
				it.remove();
				it.add(replaceWith);
			}
		}
	}

	public String toString()
	{
		return list.toString();
	}
}