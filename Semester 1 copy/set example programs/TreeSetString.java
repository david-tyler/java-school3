//(c) A+ Computer Science
// www.apluscompsci.com

//treeset string example  

import java.util.Set;
import java.util.TreeSet;

public class TreeSetString
{
	public static void main(String args[])
	{
		Set<String> vals;
		vals = new TreeSet<String>();
		vals.add("aplus");
		vals.add("comp");
		vals.add("comp");		
		vals.add("sci");
		System.out.println(vals);
	}
}