//(c) A+ Computer Science
// www.apluscompsci.com

//tree set remove example  

import java.util.Set;
import java.util.TreeSet;

public class TreeSetRemove
{
	public static void main(String args[])
	{
		Set<Double> vals;
		vals = new TreeSet<Double>();
		vals.add( .7 );
		vals.add( 1.1 );
		vals.add( 3.5 );
		System.out.println(vals);
		vals.remove( 2.2 );
		vals.remove( 0.7 );
		System.out.println(vals);
	}
}