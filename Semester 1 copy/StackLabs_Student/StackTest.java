//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Claudine Rodriguez

import java.util.Stack;
import static java.lang.System.*;

public class StackTest
{
	private Stack<String> stack;

	public StackTest()
	{
		stack= new Stack<String>();
		setStack("");
	}

	public StackTest(String line)
	{
		stack= new Stack<String>();
		setStack(line);
	}
	
	public void setStack(String line)
	{
		String [] a= line.split(" ");
		for (int k=0;k<a.length;k++)
		{
			stack.push(a[k]);
		}
	}

	public void popEmAll()
	{
		for(int x=0;x<stack.size();x++)
		{
			stack.pop();
		}
	}

	public String toString()
	{
		String output= "";
		while (!stack.isEmpty())
		{
			output+=stack.pop()+ " ";
		}
		return output;
	}
}