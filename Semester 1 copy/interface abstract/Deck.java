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

	public Deck() 
    {
    	System.out.println("Deck: \n" + getCards());
		Scanner obj = new Scanner(System.in);
		System.out.println("\n Do you want to reshuffle? (Yes/No) ");
		String input = obj.nextLine();
		if(input.equals("Yes"))
			shuffle();
	}
    
   	
   	
   	public void shuffle(ArrayList<Card> Obj)
   	{
   		ArrayList<Card> temp = new ArrayList<Card>();
   		for (int x = 0; x < getSize(); x++)
         temp.add(null);
   		for(int x=0; x<getSize(); x++)
   		{
   			int a=(int) (Math.random() * 52);
   			temp.set(a,getCards().get(x));
   		}
   		for (int x = 0; x < getSize(); x++)
      	{
        	getCards().set(x,temp.get(x));
      	} 
   	}
   
   
 	  
 	public String toString()
  	{
  	 	 String temp = "";
    	 for (int k = 0; k < getSize(); k++)
    	    temp = temp + getCards().get(k).toString() + "\n";
    	 return temp;   
  	}
 
}


