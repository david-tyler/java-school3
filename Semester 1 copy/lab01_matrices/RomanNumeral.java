//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral implements Comparable<RomanNumeral>
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS = {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		roman = str;
		number = changeTonr(str);
	}

	public RomanNumeral(Integer orig)
	{
		number = orig;
		roman = changeTorn(orig);
	}
	
	public int changeTonr(String rom)
	{
		int sum = 0;
		int x=-1;
		while(rom.length()>0)
		{
			x++;
			if(rom.contains(LETTERS[x]))
			{
				sum+=NUMBERS[x];
				rom = rom.substring(LETTERS[x].length());
				x--;
			}
		}
		return sum;
	}
	public String changeTorn(int num)
	{
		String result = "";
		int x=-1;
		while(num>0)
		{
			x++;
			if(num/NUMBERS[x]>0)
			{
				result+=LETTERS[x];
				num -= NUMBERS[x];
				x--;
			}
		}
		return result;
	}

	public void setNumber(Integer num)
	{
		number = num;
		roman = changeTorn(num);
	}

	public void setRoman(String rom)
	{
		roman = rom;
		number = changeTonr(rom);
	}

	public Integer getNumber()
	{
		return number;
	}

	public int compareTo(RomanNumeral r)
	{
		return this.number - r.number;
	}

	public String toString()
	{
		return roman;
	}
}