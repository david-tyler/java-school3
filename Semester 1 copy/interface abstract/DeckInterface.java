import java.util.ArrayList;


public interface DeckInterface
{
	String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
	String [] ranks = {"Two","Three","Four","Five","Six","Seven",
   							"Eight","Nine","Ten","Jack","Queen","King","Ace"};
	int [] values ={2,3,4,5,6,7,8,9,10,10,10,10,11};
	String toString();
	void shuffle();
}