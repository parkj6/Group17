package Model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Cameron on 1/19/2016.
 */
public class DeckTest {

    @Test
    public void testDeck(){
        Deck one = new Deck();
        assertEquals(0,one.getCards().size());
    }

    @Test
    public void testFullDeck(){
        Deck full_deck = new Deck(52);
        assertEquals(52,full_deck.getCards().size());
        assertEquals("Clubs",full_deck.getCards().get(0).getSuit());
        assertEquals(2,full_deck.getCards().get(0).getValue());
        assertEquals("Spades",full_deck.getCards().get(51).getSuit());
        assertEquals(14,full_deck.getCards().get(51).getValue());
    }

    @Test
    public void testAddList(){
        Deck two = new Deck();
        Card three = new Card();
        two.addCard(three);
        Card four = new Card();
        two.addCard(four);
        assertEquals(2,two.getCards().size());

    }
}
