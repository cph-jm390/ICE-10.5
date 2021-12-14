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
    Round round = new Round();
    boolean challenger = false;
    boolean dealer = true;
    Scoreboard scores = new Scoreboard();


    public void startGame() { //DONE!!!
        List<Double> resetter = new ArrayList<>();
        ui.selectPlayerAmount();
        System.out.println("");
        ui.createPlayer(); //makes last player dealer
        System.out.println("");
        scores.initiateScoreboard();
        bet.wagerBet(); //kan genbruges til hver runde
        System.out.println("");
        deck.HitOrStand(challenger);
        Main.handCounter = resetter;
        System.out.println("");
        System.out.println("Dealers turn");
        deck.HitOrStand(dealer);
        round.setWinner(); //tjekker hvem der har vundet runden og ændrer status
        round.givePoints(); //giver vinder point og sætter dem til værende tabere efter
        scores.printScores();
        chance.drawChance();
        //
        round.roleSwap(); //skifter dealer/challenger role

    }

    public void StartRound() {
       // for (int i = 0; i >= 15; i++) {
            System.out.println("Next Round");
            bet.wagerBet(); //kan genbruges til hver runde
            System.out.println("");
            deck.HitOrStand(challenger);
            Main.handCounter.clear();
            System.out.println("");
            System.out.println("Dealers turn");
            deck.HitOrStand(dealer);
            round.setWinner(); //tjekker hvem der har vundet runden og ændrer status
            round.givePoints(); //giver vinder point og sætter dem til værende tabere efter
            scores.printScores();
            chance.drawChance();
            //
            round.roleSwap(); //skifter dealer/challenger role

        }
    }



