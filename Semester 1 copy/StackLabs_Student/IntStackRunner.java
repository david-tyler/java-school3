//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

//ArrayList of ints
//or
//array of ints

import java.util.ArrayList;
import static java.lang.System.*;

public class IntStackRunner
{
	public static void main ( String[] args )
	{
		IntStack test = new IntStack();
		test.push(5);
		test.push(7);
		test.push(9);
		System.out.println(test);
		System.out.println(test.isEmpty());
		System.out.println(test.pop());
		System.out.println(test.peek());
		System.out.println(test.pop());
		System.out.println(test.pop());
		System.out.println(test.isEmpty());
		System.out.println(test);

		//expand the test cases to test the class more thoroughly
		
		IntStack test1 = new IntStack();
		test1.push(6);
		test1.push(8);
		test1.push(10);
		test1.push(12);
		System.out.println(test1);
		System.out.println(test1.isEmpty());
		System.out.println(test1.pop());
		System.out.println(test1.peek());
		System.out.println(test1.pop());
		System.out.println(test1.pop());
		System.out.println(test1.isEmpty());
		System.out.println(test1);
		

	}
}