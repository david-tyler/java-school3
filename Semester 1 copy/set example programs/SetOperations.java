//(c) A+ Computer Science
// www.apluscompsci.com  

//set operations

import java.util.Set;
import java.util.TreeSet;

public class SetOperations
{
	public static void main(String args[])
	{
		//[5, 7, 9]   U   [9, 11, 13]

		Set<Integer> one;
		one = new TreeSet<Integer>();
		one.add( 5 );
		one.add( 7 );
		one.add( 9 );
		
		Set<Integer> two;
		two = new TreeSet<Integer>();
		two.add( 9 );
		two.add( 11 );
		two.add( 13 );
		
		Set<Integer> three;
		three = new TreeSet<Integer>();
		three.addAll(one);
		three.addAll(two);
		System.out.println( three );     //set union  
		
		three.clear();
		three.addAll( one );
		three.retainAll( two );		
		System.out.println( three );		//set intersection  
		
		three.clear();
		three.addAll( one );
		three.removeAll( two );		
		System.out.println( three );		//set difference
	}
}