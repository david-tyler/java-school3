import java.util.ArrayList;

public abstract class AbstractDeck implements DeckInterface
{
	private ArrayList<Card> cards;
	private int size;
	public AbstractDeck()
	{
		cards = new ArrayList<Card>();
		size = 52;
		 for (int s = 0; s < 4; s++)
		 {
        	for (int r = 0; r < 13; r++)
        	{
           		Card temp = new Card(suits[s],ranks[r],values[r]);
           		cards.add(temp);
           	}
         }
		shuffle();
	}
	public void shuffle()
	{
		
   		for(int x=0; x<cards.size(); x++)
   		{
   			int a=(int) (Math.random() * 52);
   			Card element = cards.get(a);
   			cards.set(a, cards.get(x));
   			cards.set(x, element);
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