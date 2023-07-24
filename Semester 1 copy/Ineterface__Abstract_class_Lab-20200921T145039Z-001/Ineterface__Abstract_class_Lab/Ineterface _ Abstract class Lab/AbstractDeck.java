import java.util.ArrayList;

public abstract class AbstractDeck implements DeckInterface
{
	private ArrayList<Card> cards;
	private int size;
	public AbstractDeck()
	{
		cards = new ArrayList<Card>();
		size = 52;
		for(int x = 0; x<size; x++)
		{
			Card obj = new Card("Spades", "rank", 1);
			cards.add(obj);
			
		}
		shuffle(cards);
	}
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
	
	public int getSize()
	{
		return size;
	}
	public ArrayList<Card> getCards()
	{
		return cards;
	}
	public abstract String toString();
}