import java.util.ArrayList;

public abstract class AbstractDeck implements DeckInterface
{
	private ArrayList<Card> cards;
	private int size;
	public AbstractDeck()
	{
		cards = new ArrayList<Card>();
		size = 0;
		shuffle(cards);
	}
	public  void shuffle(ArrayList<Card> Obj)
	{
		
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