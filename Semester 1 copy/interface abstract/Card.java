// Card.java     12-26-14
// This is the "unit" class that stores information about a single card. 
// *********************************************************************
// The "Elevens" AP Lab is created for the College Board APCS
// curriculum by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Leon Schram has altered this "Elevens" AP Lab file to focus on 
// CS topics as the "Elevens" Lab is integrated into the curriculum.



public class Card extends AbstractCard
{

   public Card(String s, String r, int v)
   {
      super(s,r,v);
   }
   
 	
   public boolean matches(CardInterface otherCard) 
   {
		return otherCard.getSuit().equals(this.getSuit())
			 && otherCard.getRank().equals(this.getRank())
			 && otherCard.getValue() == this.getValue();
	}
  
   public String toString()
   {
      return "[" + getSuit() + ", " + getRank() + ", " + getValue() + "]" + "\n";
   }
}

