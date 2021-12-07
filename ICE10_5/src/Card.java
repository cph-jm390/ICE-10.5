public class Card {


    private String suit;
    private int value;


    public Card(String suit, String value){
        this.suit = suit;
        this.value = value;
    }
    public Card(){}
    public String getSuit(){
        return suit;
    }
    public void setSuit(String suit){
        this.suit = suit;
    }
    public String getValue(){
        return value;
    }
    public void setValue(String value){
        this.value = value;
    }

    public String toString(){
        return "\n"+value + " of "+ suit;
    }

    public String getValueName(){

        String name = "Unknown";

        if (this.value == 1) {
            name = "A";
        }
        else if (this.value == 2) {
            name = "Two";
        }
        else if (this.value == 3) {
            name = "Three";
        }
        else if (this.value == 4) {
            name = "Four";
        }
        else if (this.value == 5) {
            name = "Five";
        }
        else if (this.value == 6) {
            name = "Six";
        }
        else if (this.value == 7) {
            name = "Seven";
        }
        else if (this.value == 8) {
            name = "Eight";
        }
        else if (this.value == 9) {

            name = "Nine";
        }
        else if (this.value == 10) {

            name = "Ten";
        }
        else if (this.value == 11) {

            name = "Jack";
        }
        else if (this.value == 12) {

            name = "Queen";
        }
        else if (this.value == 13) {

            name = "King";

        }
        return name;

    }
}