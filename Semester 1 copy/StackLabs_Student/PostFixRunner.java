//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Claudine Rodriguez

import java.util.Stack;
import static java.lang.System.*;

public class PostFixRunner
{
	public static void main ( String[] args )
	{
		PostFix a= new PostFix("2 7 + 1 2 + +");
		a.solve();
		System.out.println(a.toString());
		
		PostFix b= new PostFix("1 2 3 4 + + +");
		b.solve();
		System.out.println(b.toString());
		
		PostFix c= new PostFix("9 3 * 8 / 4 +");
		c.solve();
		System.out.println(c.toString());
		
		PostFix d= new PostFix("3 3 + 7 * 9 2 / +");
		d.solve();
		System.out.println(d.toString());
		
		PostFix e= new PostFix("9 3 / 2 * 7 9 * + 4 -");
		e.solve();
		System.out.println(e.toString());
		
		PostFix f= new PostFix("5 5 + 2 * 4 / 9 +");
		f.solve();
		System.out.println(f.toString());
	}
}