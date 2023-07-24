public interface CardInterface
{
	String getSuit();
	String getRank();
	int getValue();
	void setSuit(String s);
	void setRank(String r);
	void setValue(int v);
	String toString();
	boolean matches(Card otherCard);
}