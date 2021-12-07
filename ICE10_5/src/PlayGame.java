public class PlayGame {
    UI ui= new UI();
    DeckOfCards deck=new DeckOfCards();


    public void startGame(){
        ui.selectPlayerAmount();
        ui.createPlayer(); //makes last player dealer
        //TODO Insert bet function here
        deck.giveFirstSet();

    }

    public void dealFirstSet(){

    }

    public void checkTenAndAHalf() {


    }
    //card update on player

//Hit or stand
    public void HitOrStand(){

    }

//Dealer plays
public void dealerPlay() {

}
    //reset hand
    public void resetHand() {

    }
}
//card update on player

//Hit or stand

//Dealer plays


// 