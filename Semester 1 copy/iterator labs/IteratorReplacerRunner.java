//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class IteratorReplacerRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		String word = "a b c a b c";
		IteratorReplacer a = new IteratorReplacer(word, "a", "+");
		System.out.println("original: " + a);
		a.replace();
		System.out.println("modified: " +a);
	}
}