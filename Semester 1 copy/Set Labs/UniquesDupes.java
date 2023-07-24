//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;

public class UniquesDupes
{
	public static Set<String> getUniques(String input)
	{
		Set<String> uniques = new TreeSet<String>();
		String[] list = input.split(" ");
		for(String x: list)
			uniques.add(x);
		//add code

		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		//add code
		Set<String> uniques = new TreeSet<String>();
		Set<String> dupes = new TreeSet<String>();
		String[] list = input.split(" ");
		for(String x: list)
			if(uniques.add(x)==false)
				dupes.add(x);
		return dupes;
	}
}