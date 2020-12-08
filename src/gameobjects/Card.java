package gameobjects;

public class Card {

    Integer number;

    PokerDeck.Suit suit;

    public Card(Integer number, PokerDeck.Suit suit) {
        this.number = number;
        this.suit = suit;
    }

    public Integer getNumber() { return number; }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public PokerDeck.Suit getSuit() {
        return suit;
    }

    public void setSuit(PokerDeck.Suit suit) {
        this.suit = suit;
    }
}
