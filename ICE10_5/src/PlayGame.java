public class PlayGame {
    UI ui = new UI();
    DeckOfCards deck = new DeckOfCards();
    Bet bet = new Bet();
    Round round=new Round();


    public void startGame() { //DONE!!!
        ui.selectPlayerAmount();
        ui.createPlayer(); //makes last player dealer
        bet.wagerBet(); //kan genbruges til hver runde
        deck.giveFirstSet(); //kan genbruges til hver runde

        round.givePoints();
        round.roleSwap(); //skifter dealer/challenger role

    }

    public void dealFirstSet() {
        bet.wagerBet(); //kan genbruges til hver runde
        deck.giveFirstSet(); //kan genbruges til hver runde

        round.givePoints();
        round.roleSwap();

    }

    public void checkTenAndAHalf() {


    }
    //card update on player

    //Hit or stand
    public void HitOrStand() {
        String command;
        char c;
        for (int i = 0; i < Main.players.size(); i++) {
            if (Main.players.size() < 0) {
            }
        }
    }

    //Dealers turn
    public void dealerTurn() {
        boolean isPlayersStillInTheGame = false;
        for (int i = 0; i < Main.players.size() && isPlayersStillInTheGame == false; i++) {
            if (Main.players.get(i).calculateHandValue(Main.players.get(i).getHandValue()) < 10.5) {
                isPlayersStillInTheGame = true;
            }
        }
        if (isPlayersStillInTheGame) {
            //dealer playes
        }
    }

    //reset hand
    // ;


//card update on player

//Checks for 10.5

    //ikke færdigt
    public void settleBets() {
        System.out.println();

        for (int i = 0; i < Main.MAX; i++) {
            for (int j = 0; j < Main.MAX; j++) {
                if (Main.players.get(i).calculateHandValue(Main.players.get(i).getHandValue()) > 10.5) {
                    System.out.println(Main.players.get(i).getName() + " has busted");

                } else if (Main.players.get(i).calculateHandValue(Main.players.get(i).getHandValue()) < Main.players.get(j).calculateHandValue(Main.players.get(j).getHandValue()) && Main.players.get(j).isDealer()==true) {
                    //kan ikke calle dealercalculateTotal() && dealer.calculateTotal() <= 10.5 ) {
                    System.out.println(Main.players.get(i).getName() + " has lost");

                } else if (Main.players.get(i).calculateHandValue(Main.players.get(i).getHandValue()) == 10.5) {
                    System.out.println(Main.players.get(i).getName() + " has won with 10.5!");

                } else {
                    System.out.println(Main.players.get(i).getName() + " has won");
                }
            }
        }
    }
}

//Hit or stand

//Dealer plays


//