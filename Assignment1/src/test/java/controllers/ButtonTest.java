package controllers;

import Model.Deck;
import Model.Game;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import ninja.NinjaTest;
import org.doctester.testbrowser.Request;
import org.doctester.testbrowser.Response;
import org.hamcrest.CoreMatchers;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by xxqqzzaa on 01/22/16.
 */
public class ButtonTest extends NinjaTest {
    @Test
    public void testButton() {

        Game TestGame = new Game();
        TestGame.DealFour();
        String response = ninjaTestBrowser.postJson("http://localhost:8080/AcesUp.json",TestGame.getColumns());

        Deck resultTL[] = null;
        try {
            resultTL[0] = new ObjectMapper().readValue(response, Deck.class);
            assertEquals("2",resultTL[0].getTopCard().getName());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

