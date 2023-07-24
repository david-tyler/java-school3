//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import static java.lang.System.*;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Collection;

public class Part implements Comparable<Part>
{
	private String make, mode, rest;
	private int year;

	public Part(String line) 
	{
		String[] list = line.split(" ");
		make = list[list.length-3];
		mode = list[list.length-2];
		year = Integer.valueOf(list[list.length-1]);
		rest ="";
		for(int x =0; x<list.length-3;x++)
			rest+=list[x] +" ";
	}

	//have to have compareTo if implements Comparable
	public int compareTo( Part rhs )
	{
		if(!this.make.equals(rhs.make))
			return this.make.compareTo(rhs.make);
		if(!this.mode.equals(rhs.mode))
			return this.mode.compareTo(rhs.mode);
		if(!this.rest.equals(rhs.rest))
			return this.rest.compareTo(rhs.rest);
		if(this.year!=rhs.year)
			return this.year-rhs.year;			
		return 0;
	}

	public String toString()
	{
		
		return make + " " + mode + " " + year + " " + rest;
	}
}