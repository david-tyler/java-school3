//(c) A+ Computer Science
// www.apluscompsci.com

//hash set int example  

import java.util.Set;
import java.util.HashSet;

public class HashSetInt
{
	public static void main(String args[])
	{
		Set<Integer> vals;
		vals = new HashSet<Integer>();
		vals.add(3);
		vals.add(6);
		System.out.println(vals.add(3));
		vals.add(-5);
		System.out.println(vals);
	}
}