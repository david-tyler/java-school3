
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*;

public class MagicSquare
{
	private int[][] myMagic;

	public MagicSquare()
	{
		setSize(0);
	}

	public MagicSquare(int size)
	{
		setSize(size);
	}
	
	public void setSize(int size)
	{
		// initialize the matrix MyMagic here
		myMagic= new int [size][size];
	}

	public void createMagic()
	{
		int num = 1;
		myMagic[0][myMagic.length/2]= num;








	}

	public String toString( )
	{
		String output="";
		for(int r = 0; r < myMagic.length; r ++)
		{
			for(int c = 0; c < myMagic.length; c++)
			{
				output+=myMagic[r][c]+"\t";
			}
			output+="\n";
		}
		out.println();
		return output;
	}
}