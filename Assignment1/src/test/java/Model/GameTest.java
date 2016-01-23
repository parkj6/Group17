package Model;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

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

}


