public class PlayGame {
    UI ui= new UI();
    DeckOfCards deck=new DeckOfCards();
    Bet bet=new Bet();



    public void startGame(){ //DONE!!!
        ui.selectPlayerAmount();
        ui.createPlayer(); //makes last player dealer
        bet.wagerBet(); //kan genbruges til hver runde
        deck.giveFirstSet(); //kan gennbruges til hver runde

    }

    public void dealFirstSet(){

    }

    public void checkTenAndAHalf() {


    }
    //card update on player

//Hit or stand
    public void HitOrStand() {
        String command;
        char c;
        for (int i = 0; i < Main.players.size(); i++) {
            if (Main.players.size()) {
            }
        }
    }

//Dealer plays
public void dealerPlay() {

}
    //reset hand
    public void resetHand() {

    }

//card update on player

//Checks for 10.5

}
//Hit or stand

//Dealer plays


//