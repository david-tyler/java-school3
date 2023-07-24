//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*;

public class Rational implements Comparable<Rational>
{

	private int myNumerator;
	private int myDenominator;

	public Rational()
	{
		myNumerator = myDenominator = 1;
	}

	public Rational(int numerator, int denominator)
	{
		myNumerator = numerator;
		myDenominator = denominator;

	}

	public void setNumerator(int numerator)
	{
		myNumerator = numerator;
	}

	public void setDenominator(int denominator)
	{
		myDenominator = denominator;
	}

	public void add( Rational  rhs)
	{
		this.setNumerator(this.getNumerator()*rhs.getDenominator() + this.getDenominator()*rhs.getNumerator());
		this.setDenominator(this.getDenominator()*rhs.getDenominator());
	}

	public Rational clone( )
	{
		return new Rational(this.getNumerator(),this.getDenominator());
	}


	public boolean equals( Object  o)
	{
		Rational rhs = (Rational)o;
		this.reduce();
		rhs.reduce();
		if(this.getNumerator()==rhs.getNumerator() && this.getDenominator()==rhs.getDenominator())
			return true;
		return false;
	}

	public int compareTo( Rational rhs)
	{
		//How do you compare fractions?
		//convert the fraction to a decimal
		//compare the decimal values
		Double x = this.getNumerator()/(double)this.getDenominator();
		Double y = rhs.getNumerator()/(double)rhs.getDenominator();
		if(x-y>0)
			return 1;
		return -1;
	}

	public int getNumerator()
	{
		return myNumerator;
	}

	public int getDenominator()
	{
		return myDenominator;
	}

	public String toString()
	{
	   return getNumerator() + "/" + getDenominator();
	}

	private void reduce()
	{
		int GCD = gcd(this.getNumerator(), this.getDenominator());
		this.setNumerator(this.getNumerator()/GCD);
		this.setDenominator(this.getDenominator()/GCD);
	}

	private int gcd(int one, int two)
	{
		int GCD = 0;
		for(int x = 1; x<=one && x<= two; x++)
		{
			if(one%x==0 && two%x==0)
				GCD = x;
		}
		return GCD;
	}
}