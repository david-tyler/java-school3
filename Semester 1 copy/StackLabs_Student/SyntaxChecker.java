//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Claudine Rodriguez

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxChecker
{
	private String exp;
	private Stack<Character> symbols;

	public SyntaxChecker()
	{
		exp= new String();
		symbols= new Stack<Character>();
		setExpression("");	
	}

	public SyntaxChecker(String s)
	{
		exp= new String();
		symbols= new Stack<Character>();
		setExpression(s);
	}
	
	public void setExpression(String s)
	{
		symbols.clear();
		for (int k=0;k<s.length();k++)
		{
			symbols.push(s.charAt(k));
		}
		exp=s;
	}

	public boolean checkExpression()
	{
		char[]chars = exp.toCharArray();
		String opening= "({[<";
		String closing= ")}]>";
		char temp1= ' ';
		boolean check= true;
		if(chars.length==1)
			check = false;
		for(int x=0; x<chars.length; x++)
		{
			if(opening.indexOf(Character.toString(chars[x]))!=-1)
				symbols.push(chars[x]);
			else if(closing.indexOf(Character.toString(chars[x]))!=-1)
			{
				if(!symbols.isEmpty())
				{
					temp1= symbols.pop();
					if(opening.indexOf(Character.toString(temp1))!=closing.indexOf(Character.toString(chars[x])))
					{check=false;}
				}
			}
		}
		return check;
	}

	public String toString()
	{
		return exp+" is "+checkExpression();
	}
}