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

    @Test
    public void testDeal(){
        Deck five = new Deck(52);
        Card delt;
        for(int i=0;i<52;i++) {
            delt = five.Deal();
            assertEquals((i/4)+2,delt.getValue());
            String expectedSuit;
            switch(i%4){
                case 0: expectedSuit="Clubs";
                    break;
                case 1: expectedSuit="Diamonds";
                    break;
                case 2: expectedSuit="Hearts";
                    break;
                case 3: expectedSuit="Spades";
                    break;
                default:
                    expectedSuit="NONE";
            }
            assertEquals(expectedSuit,delt.getSuit());
        }
        assertEquals("_",five.Deal().getName());//returns "blank" card if deck empty
    }
}
