//(c) A+ Computer Science
// www.apluscompsci.com

//printing out a set with basic iterator loop  

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class SetOutput
{
	public static void main(String args[])
	{
		Set<Double> vals;
		vals = new TreeSet<Double>();
		vals.add( 2.9 );
		vals.add( 3.5 );
		vals.add( 6.6 );
		
		Iterator<Double> it;
		it = vals.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}