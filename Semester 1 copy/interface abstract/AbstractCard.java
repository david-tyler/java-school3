public abstract class AbstractCard implements CardInterface
{
	private String suit;
	private String rank;
	private int value;
	
	public AbstractCard(String s, String r, int v)
	{
		suit = s;
		rank = r;
		value = v;
	}
	
	public String getSuit() {return suit;}
	public String getRank() {return rank;}
	public int getValue() {return value;}
	
	public void setSuit(String s) {suit = s;}
	public void setRank(String r) {rank = r;}
	public void setValue(int v)	  {value = v;}
	
	public abstract boolean matches(CardInterface otherCard);
	public abstract String toString();
}