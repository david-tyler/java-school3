import java.util.ArrayList;


public interface DeckInterface
{
	String[] suits = new String[1];
	String [] ranks = new String[1];
	int [] values = new int[1];
	String toString();
	void shuffle(ArrayList<Card> Obj);
}