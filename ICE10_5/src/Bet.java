import java.util.Scanner;
import java.util.*;

public class Bet {
    private int bet;

    public Bet() {

    }

    public void wagerBet() {
        int bet=0;
        for (int i = 0; i < Main.players.size(); i++) {
            if (Main.players.size() > 0) {
                if (Main.players.get(i).isDealer() == false) {
                    Scanner in = new Scanner(System.in);
                    do {
                        try {
                            System.out.print("How much do you want to a bet(sips):" + Main.players.get(i).getName() + "?");
                            bet = (int) in.nextDouble();
                            System.out.println(Main.players.get(i).getName() +" wagered " + bet+" sips");
                            //read num value from keyboard

                            //read new line and ignore


                            if (bet <= 0 || bet >= 101)
                                throw new NumberOutOfRangeException
                                        ("Number out of range. Must be in 1..100 inclusive:" + bet);
                        } catch (InputMismatchException e) {
                            System.out.println("Input needs to be a number between 1-100");
                            //read new line and ignore
                            in.nextLine();
                        } catch (NumberOutOfRangeException e) {
                            System.out.println(e.getMessage());
                        } catch (Exception e) {
                            System.out.println(e);
                            System.exit(0);
                        }
                    } while (bet < 0 || bet > 101);

                }

            }


        }
    }


    public void rewardBet() {


        System.out.println("You win! You now have " + bet + "sips or shots to give out.");
    }

}




