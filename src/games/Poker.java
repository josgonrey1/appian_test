package games;

import gameobjects.Card;
import gameobjects.PokerDeck;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Poker extends CardGame {

    PokerDeck pokerDeck;

    final Integer shuffleComplexity = 100;

    public Poker() {
        this.pokerDeck = new PokerDeck();
    }

    @Override
    public void shuffle() {
        List<Card> cardListResult = new ArrayList<>();
        cardListResult.addAll(this.pokerDeck.getCardList());
        for (int complexity = 0; complexity < this.shuffleComplexity; complexity++) {
            Double randomValue = Math.random() * cardListResult.size();
            List<Card> subListOne = cardListResult.subList(randomValue.intValue(), cardListResult.size());
            Integer auxValue = randomValue.intValue() == 0 ? 0 : randomValue.intValue();
            List<Card> subListTwo = cardListResult.subList(0, auxValue);
            subListOne.addAll(subListTwo);
            cardListResult = new ArrayList<>();
            cardListResult.addAll(subListOne);
        }
        this.pokerDeck.setCardList(cardListResult);
    }

    @Override
    public Card dealOneCard() {
        Double randomValue = Math.random() * this.pokerDeck.getCardList().size();
        Card cardToReturn = this.pokerDeck.getCardList().remove(randomValue.intValue());

        return cardToReturn;
    }

    public PokerDeck getPokerDeck() {
        return pokerDeck;
    }

    public void setPokerDeck(PokerDeck pokerDeck) {
        this.pokerDeck = pokerDeck;
    }

    public Integer getShuffleComplexity() {
        return shuffleComplexity;
    }
}
