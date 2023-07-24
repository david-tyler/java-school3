//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Claudine Rodriguez

//ArrayList of ints
//or
//array of ints

import java.util.ArrayList;
import static java.lang.System.*;

public class IntStack
{
	//pick your storage for the stack
	//you can use the an array or an ArrayList

	//option 1
	//private int[] rayOfInts;
	private int numInts;

	//option 2
	private ArrayList<Integer> listOfInts;

	public IntStack()
	{
		listOfInts = new ArrayList();
		numInts= 0;
	}

	public void push(int item)
	{
		numInts= item;
		listOfInts.add(numInts);
	}

	public int pop()
	{
		return listOfInts.remove(listOfInts.size()-1);
	}

	public boolean isEmpty()
	{
		return listOfInts.isEmpty();
	}

	public int peek()
	{
		return listOfInts.get(listOfInts.size()-1);
	}

	public String toString()
	{
		return listOfInts.toString();
	}
}