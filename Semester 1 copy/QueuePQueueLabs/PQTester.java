//(c) A+ Computer Science
//www.apluscompsci.com

//Name -  

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PQTester
{
	private Queue<String> pQueue;

	public PQTester()
	{
		pQueue = new PriorityQueue();
	}

	public PQTester(String list)
	{
		pQueue = new PriorityQueue();
		for(String s : list.split(" "))
			pQueue.add(s);
	}

	public void setPQ(String list)
	{
		pQueue = new PriorityQueue();
		for(String s : list.split(" "))
			pQueue.add(s);
	}
	
	public Object getMin()
	{
		return pQueue.peek();
	}
	
	public String getNaturalOrder()
	{
		String output="";
		while(!pQueue.isEmpty())
		{
			output+=pQueue.remove()+ " ";
		}
		return output;		
	}

	//write a toString method
	public String toString()
	{
		return pQueue.toString();
	}
}