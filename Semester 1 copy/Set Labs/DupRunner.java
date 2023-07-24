//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;
import java.util.*;

public class DupRunner
{
	public static void main( String args[] )
	{
		String str = "a b c d e f g h a b c d e f g h i j k";
		System.out.println("Original: " + str);
		System.out.println("Uniques: " + UniquesDupes.getUniques(str));
		System.out.println("Dupes: " + UniquesDupes.getDupes(str));
	}
}