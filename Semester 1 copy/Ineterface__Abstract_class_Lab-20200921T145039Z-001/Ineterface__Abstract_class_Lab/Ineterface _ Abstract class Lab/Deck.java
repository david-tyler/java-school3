// Deck03.java     12-26-14
// The <display> method is now replaced by the <toString> method.
// This version is implemented with "dynamic arrays".
// ********************************************************************
// The "Elevens" AP Lab is created for the College Board APCS
// curriculum by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Leon Schram has altered this "Elevens" AP Lab file to focus on 
// CS topics as the "Elevens" Lab is integrated into the curriculum.

import java.util.ArrayList;
import java.util.Scanner;

public class Deck extends AbstractDeck
{
	private ArrayList<Card> cards;
	private int size;

	public Deck(ArrayList<Card> c, int s) 
    {
		super();
		Scanner obj = new Scanner(System.in);
		System.out.println(cards + "\n Do you want to reshuffle? ");
		String input = obj.nextLine();
		if(input.equals("yes"))
			shuffle(c);
	}
    
   	public int getSize()   {  return size;  }
   
   	public boolean isEmpty()   {  return size == 0;  }
   	
   	public void shuffle(ArrayList<Card> Obj)
   	{
   		Card element;
   		for(int x=0; x<cards.size(); x++)
   		{
   			element = Obj.get(x);
   			Obj.remove(x);
   			Obj.add(element);
   		}
   	}
   
   	public void add(String suit, String rank, int value)
   	{
  	    Card temp = new Card(suit,rank,value);
   	   	cards.add(temp);
 	    size++;
  	}
 	  
 	public String toString()
  	{
  	 	 String temp = "";
    	 for (int k = 0; k < size; k++)
    	    temp = temp + cards.get(k).toString() + "\n";
    	 return temp;   
  	}
 
}


