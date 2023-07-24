//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

public class PostFix
{
	private Stack<Double> stack;
	private String expression;
	private double result;

	public PostFix()
	{
		stack= new Stack();
		setExpression("");
		result = 0.0;
	}

	public PostFix(String exp)
	{
		stack= new Stack();
		expression = exp;
		result = 0.0;
	}

	public void setExpression(String exp)
	{
		expression=exp;
	}

	public double calc(double one, double two, char op)
	{
		if(op == '+')
			return one + two;
		if(op == '-')
			return two - one;
		if(op == '*')
			return one * two;
		if(op == '/')
			return two / one;
		return 0.0;
	}

	public void solve()
	{
		stack.clear();
		for(char c : expression.toCharArray())
		{
			if(c == ' ')
				continue;
			if(c <= '9' && c >= '0')
			{
				stack.push(Double.valueOf(c)-48);
			}
			else
			{
				double one = stack.pop();
				double two = stack.pop();
				stack.push(calc(one,two,c));
				//System.out.println(stack.peek() + " " + one + " " + two + " " +c+ "\n"); debug checking the result and numbers of each opeartion
			}
		}
		result = stack.peek();
		//System.out.println("result " + result); debug cheking the result
	}

	public String toString()
	{
		return expression + " = " + result;		
	}
}

