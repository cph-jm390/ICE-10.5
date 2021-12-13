import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DeckOfCards {
    ArrayList<Card> cards = new ArrayList<Card>();
    ArrayList<Card> OGcards = new ArrayList<Card>();
    Card card;

    String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    String[] suit = {"Clubs", "Spades", "Diamonds", "Hearts"};
    double[] cardValue = {};

    public DeckOfCards() {
        double cardValue;
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if (values[i] == "A") {
                    cardValue = 0.5;
                } else if (values[i] == "2") {
                    cardValue = 2.0;
                } else if (values[i] == "3") {
                    cardValue = 3.0;
                } else if (values[i] == "4") {
                    cardValue = 4.0;
                } else if (values[i] == "5") {
                    cardValue = 5.0;
                } else if (values[i] == "6") {
                    cardValue = 6.0;
                } else if (values[i] == "7") {
                    cardValue = 7.0;
                } else if (values[i] == "8") {
                    cardValue = 8.0;
                } else if (values[i] == "9") {
                    cardValue = 9.0;
                } else {
                    cardValue = 10.0;
                }
                this.cards.add(new Card(suit[i], values[j], cardValue));
            }
        }
    }

    public void giveFirstSet() {

        //shuffle the deck when its created
        OGcards = cards;
        Collections.shuffle(this.cards);
        int i = 0;
        for (Player player : Main.players) {

            System.out.println(Main.players.get(i).getName() + " recieves the following card: " + cards.get(0));
            cards.remove(0);
            i++;
        }

    }

    public void HitOrStand(boolean status) {

        List<Double> list = new ArrayList<>();
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
                            break;
                        }
                        if (c == 'H') {
                            for (int k = 0; i < 9; i++) {

                                System.out.println(cards.get(0) + " was drawn");
                                list.add(cards.get(0).getCardValue());
                                cards.remove(0);
                                Main.players.get(i).setHandValue(list);
                                if(Main.players.get(i).calculateHandValue(Main.players.get(i).getHandValue())>10.5){
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
