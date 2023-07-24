//(c) A+ Computer Science
// www.apluscompsci.com

//hash set remove example  

import java.util.Set;
import java.util.HashSet;

public class HashSetRemove
{
	public static void main(String args[])
	{
		Set<Double> vals;
		vals = new HashSet<Double>();
		vals.add( .3 );
		vals.add( 1.2 );
		vals.add( 2.6 );
		System.out.println(vals);
		vals.remove( 9.1 );
		vals.remove( 0.3 );
		System.out.println(vals);
	}
}