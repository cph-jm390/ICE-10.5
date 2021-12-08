import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCards {
    ArrayList<Card> cards = new ArrayList<Card>();
    ArrayList<Card> OGcards= new ArrayList<Card>();
    //cards=OGcards;
    String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] suit = {"Clubs", "Spades", "Diamonds", "Hearts"};
    double[] cardValue = {};
    public DeckOfCards() {
        double cardValue=0.5;
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if(values[i]=="Ace"){
                    cardValue=0.5;
                }else if(values[i]=="2"){
                    cardValue=2;
                }else if(values[i]=="3"){
                    cardValue=3;
                }else if(values[i]=="4"){
                    cardValue=4;
                }else if(values[i]=="5"){
                    cardValue=5;
                }else if(values[i]=="6"){
                    cardValue=6;
                }else if(values[i]=="7"){
                    cardValue=7;
                }else if(values[i]=="8"){
                    cardValue=8;
                }else if(values[i]=="9"){
                    cardValue=9;
                }else{
                    cardValue=10;
                }
                this.cards.add(new Card(suit[i], values[j],cardValue));
            }
        }
    }

    public void giveFirstSet(){

        //shuffle the deck when its created
        OGcards=cards;
        Collections.shuffle(this.cards);
        int i=0;
        for(Player player:Main.players){

            System.out.println(Main.players.get(i).getName()+" recieves the following card: "+cards.get(0));
            cards.remove(0);
            i++;
        }

    }

    public ArrayList<Card> getDeck(){
        return cards;
    }

    public String[] getValues() {
        return values;
    }

    {



    }
}

