package Model;

import java.util.ArrayList;

/**
 * Created by Cameron on 01/19/2016.
 * Edited by Jong Park on 01/22/2016
 */
public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addCard(Card new_card) {
        cards.add(new_card);
    }

    public void removeCard(Card remove_card) {
        cards.remove(remove_card);
    }


}
