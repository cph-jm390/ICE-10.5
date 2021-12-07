import java.util.Scanner;

public class Bet {
    private int bet;

    public Bet(int bet) {
        this.bet = bet;
    }

    public static int wagerBet()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Wager a bet(sips or shots): ");
        int bet = (int) in.nextDouble();
        System.out.println("You wagered " + bet);
        return bet;
    }

    public void rewardBet(int bet)
    {
        System.out.println("You win! You now have " + bet + "sips or shots to give out.");
    }

}

