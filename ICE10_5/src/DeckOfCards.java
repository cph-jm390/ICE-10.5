import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DeckOfCards {
    ArrayList<Card> cards = new ArrayList<Card>();
    ArrayList<Card> OGcards = new ArrayList<Card>();
    Card card;

    String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    String[] suit = {"Clubs", "Spades", "Diamonds", "Hearts"};
    double[] cardValue = {0.5,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0,10.0,10.0,10.0};

    public DeckOfCards() {

        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < values.length; j++) {

                this.cards.add(new Card(suit[i], values[j], cardValue[j]));
            }
        }
    }

    public void giveFirstSet() {
        List<Double> resetter = new ArrayList<>();

        //shuffle the deck when its created
        OGcards = cards;
        Collections.shuffle(this.cards);
        int i = 0;
        for (Player player : Main.players) {
            Main.handCounter.add(cards.get(0).getCardValue());
            Main.players.get(i).setHandValue(Main.handCounter);
            Main.handCounter=resetter;
            System.out.println(Main.players.get(i).getName() + " recieves the following card: " + cards.get(0));
            cards.remove(0);
            i++;

        }

    }

    public void HitOrStand(boolean status) {
        Collections.shuffle(this.cards);
        List<Double> resetter = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String command;

        for (int i = 0; i < Main.players.size(); i++) {

            char c='a';
            if (Main.players.get(i).isDealer() == status) {
                if (Main.players.get(i).calculateHandValue(Main.players.get(i).getHandValue()) > 0) {
                    System.out.println(Main.players.get(i).getName() + " has " + Main.players.get(i).calculateHandValue(Main.players.get(i).getHandValue()));
                }
                for(int j=0;i<9;i++) {
                    do {
                        do {
                            System.out.print(Main.players.get(i).getName() + " (H)it or (S)tand? ");
                            command = scan.next();
                            c = command.toUpperCase().charAt(0);
                        } while (!(c == 'H' || c == 'S'));
                        if (c=='S'){
                            Main.handCounter=resetter;
                            break;
                        }
                        if (c == 'H') {
                            for (int k = 0; i < 9; i++) {

                                System.out.println(cards.get(0) + " was drawn");
                                Main.handCounter.add(cards.get(0).getCardValue());
                                cards.remove(0);
                                Main.players.get(i).setHandValue(Main.handCounter);
                                if(Main.players.get(i).calculateHandValue(Main.players.get(i).getHandValue())>10.5){
                                    System.out.println("You busted, noob");
                                    Main.handCounter=resetter;

                                    break;
                                }
                                break;
                            }


                            System.out.println(Main.players.get(i).getName() + " has " + Main.players.get(i).calculateHandValue(Main.players.get(i).getHandValue()));
                        }
                    } while (c != 'S' && Main.players.get(i).calculateHandValue(Main.players.get(i).getHandValue()) <= 10.5);
                    break;
                }

            }
        }

    }


    public ArrayList<Card> getDeck() {
        return cards;
    }

    public String[] getValues() {
        return values;
    }


}
