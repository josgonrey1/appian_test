package tests.games;

import gameobjects.Card;
import games.Poker;
import junit.framework.TestCase;
import java.util.List;

import org.junit.Test;

/**
 * The Class Poker.
 *
 * @author jrgonzalezr
 */
public class PokerTest extends TestCase {
	
	/**
	 * Test to check the shuffle algorithm.
	 */
	
	@Test
	public void testShuffle() {
		Poker poker =  new Poker();
		List<Card> cardListAux = poker.getPokerDeck().getCardList();
		poker.shuffle();
		List<Card> cardListResult = poker.getPokerDeck().getCardList();
		
	    assertEquals(cardListAux.size(), cardListResult.size());
	}

	/**
	 * Test to check the dealOneCard method.
	 */

	@Test
	public void testDealOneCard() {
		Poker poker =  new Poker();
		int cardSize = poker.getPokerDeck().getCardList().size();
		poker.dealOneCard();
		List<Card> cardListResult = poker.getPokerDeck().getCardList();

		assertEquals(cardSize, cardListResult.size() + 1);
	}

}
