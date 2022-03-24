
package blackJack;

public enum Rank {

    Two("Two", 2),
    Three("Three", 3),
    Four("Four",4),
    Five("Five",5),
    Six("Six",6),
    Seven("Seven",7),
    Eight("Eight",8),
    Nine("Nine",9),
    Ten("Ten",10),
    Jack("Jack",10),
    Queen("Queen",10),
    King("King",10),
    Ace("Ace", 11);//establishing the 13 ranks
    
    String rankName;
    int rankValue;//setting up variables of object Rank

    Rank(String rankName, int rankValue){
        this.rankName = rankName;
        this.rankValue = rankValue;
    }

    public String toString(){
        return rankName;
    }
}