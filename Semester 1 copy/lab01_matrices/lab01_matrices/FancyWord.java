//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{
		mat=new char[0][0];
	}

   public FancyWord(String word)
	{
		mat = new char[word.length()][word.length()];
		for(int r=0; r<word.length(); r++)
		{
			for(int c=0;c<word.length();c++)
			{
				if(r==0 || r==word.length()-1)
				{
					mat[r][c] = word.charAt(c);
				}
				else if(r==c)
					mat[r][c]=word.charAt(c);
				else if(c==word.length()-r-1)
					mat[r][c]=word.charAt(c);
			}

		}




	}

	public String toString()
	{
		String output="";
		for(int r = 0; r < mat.length; r++)
		{
			for(int c = 0; c < mat.length; c++)
				output += mat[r][c];
			output += "\n";
		}
		return output;
	}
}