//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue;
	private Stack<String> stack;

	public PalinList()
	{
		setList("");
	}

	public PalinList(String list)
	{
		queue = new LinkedList();
		stack = new Stack();
		setList(list);
	}

	public void setList(String list)
	{
		queue = new LinkedList();
		stack = new Stack();
		for(String s: list.split(" "))
		{
			stack.push(s);
			queue.add(s);
		}
	}

	public boolean isPalin()
	{
		while(!queue.isEmpty())
		{
			if(!queue.remove().equals(stack.pop()))
				return false;
		}
	
		return true;
	}


	//write a toString method
	public String toString()
	{
		return queue.toString();
	}
}