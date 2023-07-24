//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import static java.lang.System.*;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet()
	{
		one = new TreeSet();
		two = new TreeSet();
	}

	public MathSet(String o, String t)
	{
		one = new TreeSet();
		two = new TreeSet();
		String [] first = o.split(" ");
		String [] second = t.split(" ");
		for(String x : first)
			one.add(Integer.valueOf(x));
		for(String y : second)
			two.add(Integer.valueOf(y));	
		
	}

	public Set<Integer> union()
	{
		Set<Integer> all = new TreeSet<Integer>();
		all.addAll(one);
		all.addAll(two);
		
		return all;
	}

	public Set<Integer> intersection()
	{
		Set<Integer> res = new TreeSet<Integer>();
		res.addAll(one);
		res.retainAll(two);
		return res;
	}

	public Set<Integer> differenceAMinusB()
	{
		Set<Integer> res = new TreeSet<Integer>();
		res.addAll(one);
		res.removeAll(two);
		return res;
	}

	public Set<Integer> differenceBMinusA()
	{
		Set<Integer> res = new TreeSet<Integer>();
		res.addAll(two);
		res.removeAll(one);
		return res;
	}
	
	public Set<Integer> symmetricDifference()
	{		
		Set<Integer> res = new TreeSet<Integer>();
		Set<Integer> help = new TreeSet<Integer>();
		help.addAll(one);
		help.retainAll(two);
		res.addAll(one);
		res.addAll(two);
		res.removeAll(help);
		return res;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}