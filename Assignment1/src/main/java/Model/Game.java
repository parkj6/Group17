package Model;

/**
 * Created by Cameron on 1/19/2016.
 * Edited by Jong Park on 01/22/2016
 */
public class Game {

    private Deck[] Columns;
    private Deck AcesUp;

    public Game(){
        Columns = new Deck[4];
        for(int i=0;i<4;i++) {
            Columns[i] = new Deck();
        }
        AcesUp = new Deck(52);
    }
<<<<<<< HEAD
    public void DealOne(int i) {
        Columns[i].addCard((AcesUp.Deal()));
    }
    public void DealFour() {
        for (int i = 0; i < 4; i++) {
=======

    public void DealFour(){
        for(int i=0;i<4;i++){
>>>>>>> master
            Columns[i].addCard(AcesUp.Deal());
        }
    }
    public void removeCard(int high, int click) {
        if  (Columns[high].getTopCard().getSuit().equals(Columns[click].getTopCard().getSuit())) {
            if (Columns[high].getTopCard().getValue() > Columns[click].getTopCard().getValue()) {
                Columns[click].removeCard(Columns[click].getTopCard());
            }
        }
    }

    public Deck getDeck() {
    return AcesUp;
}

    public Deck[] getColumns() {
        return Columns;
    }
<<<<<<< HEAD


=======
>>>>>>> master
}
