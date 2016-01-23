package Model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Cameron on 1/19/2016.
 */
public class CardTest {

    @Test
    public void testCard(){
        Card first = new Card(0,5);
        assertEquals(5,first.getValue());
        assertEquals("Clubs",first.getSuit());
        assertEquals("5",first.getName());
    }

}
