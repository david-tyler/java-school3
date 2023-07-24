//(c) A+ Computer Science
// www.apluscompsci.com  

//tree set int example

import java.util.Set;
import java.util.TreeSet;

public class TreeSetInt
{
	public static void main(String args[])
	{
		Set<Integer> vals;
		vals = new TreeSet<Integer>();
		vals.add( 11 );
		vals.add( 3 );
		System.out.println(vals.add( 3 ));
		vals.add( 99 );
		System.out.println(vals);
	}
}