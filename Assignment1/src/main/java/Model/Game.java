package Model;

/**
 * Created by Cameron on 1/19/2016.
 */
public class Game {

    private Deck[] Columns;
    private Deck AcesUp;

    public Game(){
        Columns = new Deck[4];
        for(int i=0;i<4;i++){ Columns[i]=new Deck(); }
        AcesUp = new Deck(52);
    }

    public void DealFour(){
        for(int i=0;i<4;i++){
            Columns[i].addCard(AcesUp.Deal());
        }
    }

    public Deck getDeck() { return AcesUp; }

    public Deck[] getColumns(){
        return Columns;
    }

    public void move(int from, int to){
        Card moved=Columns[from].getTopCard();
        Columns[from].removeCard(moved);
        Columns[to].addCard(moved);

    }
}
