//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*;

public class SpiralMatrix
{
	private int[][] spiral;

	public SpiralMatrix()
	{
		spiral = new int[0][0];

	}

	public SpiralMatrix(int size)
	{
		spiral = new int[size][size];
		createSpiral(size);
	}
	
	public void setSize(int size)
	{
		spiral = new int[size][size];
	}

	public void createSpiral(int size)
	{
		
		int count=1;
		int r = 0; // row
		int c = 0; // column
		int x = 0; // controls for right to left
		int y = 0; // controls for up
		int a = size; // controls for down
		int b = size; // controls for left to right
		do
		{
			while(r<a) // go down
			{
				spiral[r][c] = count;
				count++;
				r++;
			}
			r--;
			c++;
			while(c<b) // left to right
			{
				spiral[r][c] = count;
				count++;
				c++;
			}
			c--;
			r--;
			while(r>=y) // go up
			{
				spiral[r][c] = count;
				count++;
				r--;					
			}
			r++;
			c--;
			while(c>x) // go right to left
			{
				//if(c != x)
				//{
					spiral[r][c] = count;
					count++;
					c--;
				//}
				
			}
			c++;
			r++;
			x++;
			y++;
			a--;
			b--;
		}while(count<=size*size);
	}

	public String toString()
	{
		String output="";
		for(int r = 0; r < spiral.length; r++)
		{
			for(int c = 0; c < spiral.length; c++)
			{
				output +=  spiral[r][c] + " ";
				if(spiral[r][c]<10)
					output+= " ";
			}
			output += "\n";
		}
		return output;
	}
}