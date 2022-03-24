package blackJack;

public class Card {

   private Suit suit;
   private Rank rank;//set up object variables of object card

  
   public Card(Suit suit, Rank rank){//constructor for suit, with 2 args for the relevant objects
      this.suit = suit;
      this.rank = rank;
   }//end of constructor of object Card

   public int getValue(){
      return rank.rankValue;
   }
//we need to be able to return our values for the Card's attributes. 
   public Suit getSuit(){
      return suit;
   }
//it is unneeded to create methods to modify a card's attributes. in a card game, an Ace of Spades does not randomly become a King of Hearts

   public Rank getRank(){      
      return rank;
   }

   public String toString(){
      return ("["+rank+" of "+ suit + "] ("+this.getValue()+")");
   }

}//end of class of Card