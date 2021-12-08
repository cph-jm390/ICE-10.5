import java.util.List;

public class Dealer extends Player{
    public Dealer(String name, int playerNum,boolean isDealer, List<Double> handValue) {
        super(name, playerNum,isDealer,handValue);
    }

    // This automates the dealer's play
    public void dealerPlay(DeckOfCards deckOfCards){
        System.out.println();
        while (hand.calculateTotal() <= 16) {
            System.out.println("Dealer has " + hand.calculateTotal()+ " and hits");
            hand.addCard(deck.nextCard());
            System.out.println("Dealer " + this.getHandString(true, false));
        }
        if ( hand.calculateTotal() > 21) {
            System.out.println("Dealer busts. " + this.getHandString(true, false));
        } else {
            System.out.println("Dealer stands. " + this.getHandString(true, false));
        }
    }
}
