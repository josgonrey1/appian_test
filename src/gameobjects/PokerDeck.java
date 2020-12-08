package gameobjects;

import java.util.ArrayList;
import java.util.List;

public class PokerDeck {

    List<Card> cardList;

    enum Suit { DIAMONDS, HEARTS, SPADES, CLUBS}

    public PokerDeck() {
        cardList = new ArrayList<>();
        for (int number = 1; number < 13; number++) {
            Card cardDiamonds = new Card(number, Suit.DIAMONDS);
            Card cardSpades = new Card(number, Suit.SPADES);
            Card cardHearts = new Card(number, Suit.HEARTS);
            Card cardClubs = new Card(number, Suit.CLUBS);
            cardList.add(cardDiamonds);
            cardList.add(cardSpades);
            cardList.add(cardHearts);
            cardList.add(cardClubs);
        }
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }
}
