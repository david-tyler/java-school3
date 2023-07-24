//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MathSetRunner
{
	public static void main(String args[]) throws IOException
	{
		Scanner file = new Scanner(new File("mathsetdata.dat"));
		while(file.hasNext())
		{
			String a = file.nextLine();
			String b = file.nextLine();
			MathSet c = new MathSet(a, b);
			out.println("OFirst: " + a);
			out.println("OSecond: " + b);
			out.println();
			out.println("Union: " + c.union());
			out.println("Intersection: " + c.intersection());
			out.println("Difference A Minus B: " + c.differenceAMinusB());
			out.println("Difference B Minus A: " + c.differenceBMinusA());
			out.println("Symmetric Difference: " + c.symmetricDifference());
			out.println();
		}
		//add test cases
	}
}
