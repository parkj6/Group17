package Model;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Cameron on 1/22/2016.
 */
public class GameTest {

    @Test
    public void TestBlankGame(){
        Game Aces = new Game();
        assertEquals(52,Aces.getDeck().getCards().size());
        assertEquals(true,Aces.getColumns()[0].getCards().isEmpty());
    }

    @Test
    public void TestGameDeal(){
        Game Aces = new Game();
        Aces.DealFour();
        Aces.DealFour();
        assertEquals(44,Aces.getDeck().getCards().size());
        for(int i=0;i<4;i++) {
            assertEquals(2,Aces.getColumns()[i].getCards().size());
        }
    }

    @Test
    public void Testremove() {
        Game Aces = new Game();
        Aces.DealOne(1);
        Aces.DealOne(1);
        Aces.DealOne(1);
        Aces.DealOne(1);
        Aces.DealOne(2);
        Aces.DealOne(2);
        Aces.DealOne(2);
        Aces.DealOne(2);
        assertEquals(Aces.getColumns()[1].getTopCard().getSuit(),Aces.getColumns()[2].getTopCard().getSuit());
        Card a = Aces.getColumns()[1].getTopCard();
        Card b = Aces.getColumns()[2].getTopCard();
        assertNotEquals(a, b);
        Aces.removeCard(2,1);
        assertNotEquals(a,Aces.getColumns()[1].getTopCard());
        assertEquals(b,Aces.getColumns()[2].getTopCard());
    }

}


