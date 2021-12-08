import java.util.Scanner;
import java.util.*;

public class Bet {
    private int bet;

    public Bet() {

    }

    public void wagerBet() {
        for (int i = 0; i < Main.players.size(); i++) {
            if (Main.players.size() > 0) {
                if (Main.players.get(i).isDealer() == false) {
                    Scanner in = new Scanner(System.in);
                    do {
                        try {
                            System.out.print("How much do you want to a bet(sips):" + Main.players.get(i).getName() + "?");
                            int bet = (int) in.nextDouble();
                            System.out.println("You wagered " + bet);
                            //read num value from keyboard
                            bet = in.nextInt();
                            //read new line and ignore
                            in.nextLine();

                            if (bet < 0 || bet > 101)
                                throw new NumberOutOfRangeException
                                        ("Number out of range. Must be in 1..100 inclusive:" + bet);
                        } catch (InputMismatchException e) {
                            System.out.println("Input was not an integer");
                            //read new line and ignore
                            in.nextLine();
                        } catch (NumberOutOfRangeException e) {
                            System.out.println(e.getMessage());
                        } catch (Exception e) {
                            System.out.println(e);
                            System.exit(0);
                        }
                    } while (bet < 0 || bet > 101);
                    System.out.format("Thank you. You entered %d\n", bet);
                }

        }



}
        }


public void rewardBet(){

        // if round end = true print...
        System.out.println("You win! You now have "+bet+"sips or shots to give out.");
        }
/// ikke færdigt

public void rewardBets(){
        System.out.println();

        }




