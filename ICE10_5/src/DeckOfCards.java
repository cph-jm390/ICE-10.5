import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCards {
    ArrayList<Card> cards = new ArrayList<Card>();
    ArrayList<Card> OGcards= new ArrayList<Card>();

    String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] suit = {"Club", "Spade", "Diamond", "Heart"};

    public DeckOfCards(){
        for (int i = 0; i<suit.length; i++) {
            for(int j=0; j<values.length; j++){
                this.cards.add(new Card(suit[i],values[j]));
            }
        }
        //shuffle the deck when its created
        OGcards=cards;
        Collections.shuffle(this.cards);
        int i=0;
        for(Player player:Main.players){

            System.out.println(Main.players.get(i)+" recieves the following card: "+cards.get(0));
            cards.remove(0);
            i++;
        }
    cards=OGcards;
    }

    public ArrayList<Card> getDeck(){
        return cards;
    }

    {

    }
}
