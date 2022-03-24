
package blackJack;



public enum Suit {

    Club("Clubs"),
    Diamond("Diamonds"),
    Heart("Hearts"),
    Spade("Spades"); //establishing the 4 suits

    String suitName;//seting up variable of object Suit

    Suit(String suitName) {//function to change the type of suit
        this.suitName = suitName;
    }

    public String toString(){//function to return us the name of the suit
        return suitName;
    }
}//end of enum Suit
