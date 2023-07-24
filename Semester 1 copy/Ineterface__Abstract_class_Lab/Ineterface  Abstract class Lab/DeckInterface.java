import java.util.ArrayList;


public interface DeckInterface
{
	String[] suits= new String[0];
	String [] ranks = new String[0];
	int [] values = new int[0];
	String toString();
	void shuffle(ArrayList<Card> Obj);
}