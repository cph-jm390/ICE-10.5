import java.util.Scanner;

public class Bet {
    private int bet;

    public Bet(int bet) {
        this.bet = bet;
    }

    public int wagerBet() {
        for (int i = 0; i < Main.players.size(); i++) {
            if (Main.players.size() > 0) {
                Scanner in = new Scanner(System.in);
                System.out.print("How much do you want to a bet(sips or shots):" + Main.players.get(0).getName() + "?");
                int bet = (int) in.nextDouble();
                System.out.println("You wagered " + bet);
                for (int x = Main.players.size(); x >= 0; x--) {
                    if (x == 0) {
                        System.out.println("All bets have been wagered");
                    }
                }
            }
        }
        return bet;
    }


    public void rewardBet(int bet) {

        // if round end = true print...
        System.out.println("You win! You now have " + bet + "sips or shots to give out.");
    }
/// ikke færdigt
}

