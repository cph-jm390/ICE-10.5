import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayGame {
    Chance chance;

    {
        try {
            chance = new Chance();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    UI ui = new UI();
    DeckOfCards deck = new DeckOfCards();
    Bet bet = new Bet();
    Round round=new Round();
    boolean challenger=false;
    boolean dealer=true;
    Scoreboard scores=new Scoreboard();


    public void startGame() { //DONE!!!
        List<Double> resetter=new ArrayList<>();
        ui.selectPlayerAmount();
        System.out.println("");
        ui.createPlayer(); //makes last player dealer
        System.out.println("");
        bet.wagerBet(); //kan genbruges til hver runde
        System.out.println("");
        //deck.giveFirstSet(); //kan genbruges til hver runde
        //System.out.println(Main.players.size()); //printer bare player size ikke andet
        deck.HitOrStand(challenger);
        Main.handCounter=resetter;
        System.out.println("");
        System.out.println("Dealers turn");
        deck.HitOrStand(dealer);
        round.setWinner(); //tjekker hvem der har vundet runden og ændrer status
        round.givePoints(); //giver vinder point og sætter dem til værende tabere efter
        scores.printScores();
        //
        round.roleSwap(); //skifter dealer/challenger role

    }

    public void dealFirstSet() {
        bet.wagerBet(); //kan genbruges til hver runde
        deck.giveFirstSet(); //kan genbruges til hver runde

        round.setWinner();
        round.givePoints();
        round.roleSwap();

    }

    public void checkTenAndAHalf() {


    }
    //card update on player

    //Hit or stand
    public void HitOrStand() {
        Scanner scan = new Scanner(System.in);
        String call;
        char c;
        for (int i = 0; i < Main.players.size(); i++) {
            if (Main.players.get(i).calculateHandValue(Main.players.get(i).getHandValue()) > 0) {
                System.out.println();
                System.out.println(Main.players.get(i).getName() + " has " + Main.players.get(i).calculateHandValue(Main.players.get(i).getHandValue()));
            }
            do{
                do{
                    System.out.print(Main.players.get(i).getName() + " (H)it or (S)tand? ");
                    call =scan.next();
                    c = call.toUpperCase().charAt(0);
                } while ( ! ( c == 'H' || c == 'S' ) );
            if ( c == 'H' ) {
                //Main.players.get(i).addCard;

                System.out.println(Main.players.get(i).getName() + " has " + Main.players.get(i).calculateHandValue(Main.players.get(i).getHandValue()));
            }
        } while (c != 'S' && Main.players.get(i).calculateHandValue(Main.players.get(i).getHandValue()) < 10.5 );
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
            //Main.players.get().isDealer();

        }
    }

    //reset hand
    // ;


//card update on player

//Checks for 10.5

    //ikke færdigt
    public void settleHands() {
        System.out.println();

        for (int i = 0; i < Main.MAX; i++) {
            for (int j = 0; j < Main.MAX; j++) {
                if (Main.players.get(i).calculateHandValue(Main.players.get(i).getHandValue()) > 10.5) {
                    System.out.println(Main.players.get(i).getName() + " has busted");

                } else if (Main.players.get(i).calculateHandValue(Main.players.get(i).getHandValue()) < Main.players.get(j).calculateHandValue(Main.players.get(j).getHandValue()) && Main.players.get(j).isDealer()==true) {
                    System.out.println(Main.players.get(i).getName() + " has lost");

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