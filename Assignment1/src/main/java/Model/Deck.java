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

    public Deck(int num){
        cards = new ArrayList<>();
        int s,v;
        for(v=2;v<15;v++){
            for(s=0;s<4;s++){
                cards.add(new Card(s,v));
                num--;
                if(num==0){ break; }
            }
            if(num==0){ break; }
        }
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

    public Card getTopCard() {
        return cards.get(cards.size()-1);
    }

    public Card Deal() {
        if(cards.isEmpty())
            return new Card(0,0);
        Card dealt = cards.get(0);
        cards.remove(dealt);
        return dealt;
    }
}