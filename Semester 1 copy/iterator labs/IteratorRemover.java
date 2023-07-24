//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemover
{
	private ArrayList<String> list;
	private String toRemove;

	public IteratorRemover(String line, String rem)
	{
		toRemove = rem;
		list = new ArrayList<String>(Arrays.asList(line.split(" ")));
		
	}
	
	public void remove()
	{
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			if(it.next().equals(toRemove))
			{
				
				it.remove();
			}
		}
	}

	public String toString()
	{
		String y = "";
		for(int x =0; x<list.size(); x++)
			y+= list.get(x)+ " ";
		return y;
		//return list.toString();
	}
}