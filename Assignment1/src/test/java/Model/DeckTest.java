package Model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Cameron on 1/19/2016.
 */
public class DeckTest {

    @Test
    public void testEmptyDeck(){
        Deck one = new Deck();
        assertEquals(0,one.getCards().size());
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
