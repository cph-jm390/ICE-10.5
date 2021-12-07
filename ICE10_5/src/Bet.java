import java.util.Scanner;

public class Bet {
    private int bet;

    public Bet() {

    }

    public void wagerBet() {
        for (int i = 0; i < Main.players.size(); i++) {
            if (Main.players.size() > 0) {
                if (Main.players.get(i).isDealer()==false) {
                    Scanner in = new Scanner(System.in);
                    System.out.print("How much do you want to a bet(sips):" + Main.players.get(i).getName() + "?");
                    int bet = (int) in.nextDouble();
                    System.out.println("You wagered " + bet);
                }
                /*for (int x = Main.players.size(); x >= 0; x--) {
                    if (x == 0) {
                        System.out.println("All bets have been wagered");
                    }
                }*/
            }
        }
    }


    public void rewardBet() {

        // if round end = true print...
        System.out.println("You win! You now have " + bet + "sips or shots to give out.");
    }
/// ikke færdigt

    public void rewardBets() {
        System.out.println();

                }
            }
        }

    }
}



