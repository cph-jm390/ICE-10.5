import java.util.Arrays;

public class PlayingCards {
   private int suit;
   private float value;
    private String[] _cardValues = {null, "Ace", "2", "3", "4","5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"};
    private String[] _cardSuits = {null, "Clubs", "Diamonds", "Hearts", "Spades"};


    public PlayingCards(int suit, float value) {
        this.suit = suit;
        this.value = value;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PlayingCards{" +
                "suit=" + suit +
                ", value=" + value +
                '}';
    }
}
