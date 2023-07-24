//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class StackTestRunner
{
	public static void main ( String[] args )
	{
		StackTest a= new StackTest("a b c d e f g h i");
		String aa="[a, b, c, d, e, f, g, h, i]";
		System.out.println(aa);
		System.out.println(a.toString());
		a.popEmAll();
		System.out.println("");
		StackTest b= new StackTest("1 2 3 4 5 6 7 8 9 10");
		String bb="[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]";
		System.out.println(bb);
		System.out.println(b.toString());
		b.popEmAll();
		System.out.println("");
		StackTest c= new StackTest("# $ % ^ * ( ) ) _");
		String cc="[#, $, %, ^, *, (, ), ), _]";
		System.out.println(cc);
		System.out.println(c.toString());
		c.popEmAll();		
	}
}
