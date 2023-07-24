//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class Histogram
{
	private Map<String,Integer> histogram;

	public Histogram()
	{
		histogram = new TreeMap();
	}

	public Histogram(String sent)
	{
		histogram = new TreeMap();
		String list[] = sent.split(" ");
		for(String s : list)
		{
			if(histogram.get(s)==null)
				histogram.put(s,0);
			histogram.put(s,histogram.get(s)+1);
		}
	}
	
	public void setSentence(String sent)
	{
		histogram = new TreeMap();
		String list[] = sent.split(" ");
		for(String s : list)
		{
			if(histogram.get(s)==null)
				histogram.put(s,0);
			histogram.put(s,histogram.get(s)+1);
		}
		
	}

	public String toString()
	{
		String output="char    1---5----01---5";
		
		for(String s : histogram.keySet())
		{
			String allStars="";
			for(int x = 0; x<histogram.get(s);x++)
			{
				allStars+="*";
			}
			output+="\n" +s+"       "+allStars;
			
		}
		return output;
	}
}