//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class PartList
{
	private TreeMap<Part, Integer> partsMap;
	
	public PartList()
	{
		partsMap = new TreeMap();

	}
	
	public PartList(String fileName)
	{
		this();
		try
		{
			Scanner file = new Scanner(new File("partinfo.dat"));
			//add code here to read from the file 
			//and add Parts to the map
			while(file.hasNext())
			{
				String sent = file.nextLine();
				Part x = new Part(sent);
				if(partsMap.get(x)==null)
					partsMap.put(x,0);
				partsMap.put(x,partsMap.get(x)+1);
			}




		}
		catch( IOException e )  //Most specific exceptions must be listed 1st
		{
			out.println(e);
		}
		catch( RuntimeException e )
		{
			out.println(e);
		}
		catch( Exception e )
		{
			out.println(e);
		}
		finally
		{
			//no code needed here
		}
	}
	
	public String toString()
	{
		String output="";
		for(Part p: partsMap.keySet())
			output+= p.toString() + "- " + partsMap.get(p) + "\n";
		return output;
	}
}