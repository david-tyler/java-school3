//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxCheckRunner
{
	public static void main ( String[] args )
	{
		SyntaxChecker a= new SyntaxChecker("(abc(*def)");
		System.out.println(a.toString());
		System.out.println("");
		
		SyntaxChecker b= new SyntaxChecker("[{}]");
		System.out.println(b.toString());
		System.out.println();
		
		SyntaxChecker c= new SyntaxChecker("[");
		System.out.println(c.toString());
		System.out.println();

		SyntaxChecker d= new SyntaxChecker("[{<()>}]");
		System.out.println(d.toString());
		System.out.println();
		
		SyntaxChecker e= new SyntaxChecker("{<html[value=4]*(12)>{$x}}");
		System.out.println(e.toString());
		System.out.println();
		
		SyntaxChecker f= new SyntaxChecker("[one]<two>{three}(four)");
		System.out.println(f.toString());
		System.out.println();
		
		SyntaxChecker g= new SyntaxChecker("car(cdr(a)(b)))");
		System.out.println(g.toString());
		System.out.println();	
			
		SyntaxChecker h= new SyntaxChecker("car(cdr(a)(b))");
		System.out.println(h.toString());
		System.out.println();	
	}
}