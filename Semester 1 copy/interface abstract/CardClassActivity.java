// Unit Class - Card Class   test program


//  commnents below show a polymorphic approach

import java.util.ArrayList;

public class CardClassActivity
{
	public static void main(String[] args)
	{     
      System.out.println("Card Class tester");
      
	  Card myCard1 = new Card("Hearts", "Queen", 10);//CardInterface myCard1 = new Card("Hearts", "Queen", 10);
	  Card myCard2 = new Card("Clubs", "two", 2);//CardInterface myCard2 = new Card("Clubs", "Three", 3);
	  Card myCard3 = new Card("Hearts", "Queen", 10);//CardInterface myCard3 = new Card("Spades", "Ace", 11);
	  System.out.println(myCard1);
	  System.out.println();	
	  
	  ArrayList <Card> cards = new ArrayList <Card>(); //ArrayList <CardInterface> cards = new ArrayList <CardInterface>();
	  cards.add(myCard1);
	  cards.add(myCard2);
	  cards.add(myCard3);
	  
	  for(int i = 1; i <=9; i++)
	  	cards.add(new Card("Card" + i, "Suit" + i, i));
	  	
	  System.out.println(cards);
	
	  for(Card item:cards)//for(CardInterface item:cards)
	  	System.out.println(item);
	  	
	  System.out.println();
	  cards.set(0,cards.get(1));
	  
	  for(Card item:cards)//for(CardInterface item:cards)
	  	System.out.println(item);
	  	
	  System.out.println();
	  System.out.println("first card same as second card? " + cards.get(0).matches(cards.get(1)));
	  System.out.println("first card same as third card? " + cards.get(0).matches(cards.get(2)));	  
	}
}

