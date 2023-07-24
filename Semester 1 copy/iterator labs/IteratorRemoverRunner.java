//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemoverRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		String line = "a b c a b c a     a";
		IteratorRemover a = new IteratorRemover(line, "a");
		System.out.println("original list: [" + a + "]");
		a.remove();
		System.out.println("modified list: [" + a + "]" + "\n");
		
		System.out.println();
		System.out.println("set 2: \n");
		
		line = "1 2 3 4 5 6 a b c a b c     b";
		IteratorRemover b = new IteratorRemover(line, "b");
		System.out.println("original list: [" + b + "]");
		b.remove();
		System.out.println("modified list: [" + b + "]" + "\n");
		
	}
}