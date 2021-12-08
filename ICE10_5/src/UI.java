import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static jdk.internal.org.jline.utils.Colors.s;

public class UI {
//TODO evt. smæk selectPlayerAmount + createPlayer sammen
    public void rules(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to 10 & a half!");
        System.out.println("Do you know the rules? y/n");
        System.out.println("");
        String input = scan.nextLine();

        if (input.equals("y")) {
            System.out.println("Nice! Lets play");
        } else {
            System.out.println("");
            System.out.println("  10 & a half: ");
            System.out.println("	-Each player bet a number of sips before the cards are dealt. You can bet from 1-100 sips each round.");
            System.out.println("	-Each player is dealt 1 card.");
            System.out.println("	-Cards are equal to their value with face cards being 10 and an Ace being 0.5");
            System.out.println("	-Players “Hit” to gain another card from the deck. Players “Stay” to keep their current card total.");
            System.out.println("	-The players cards are added up for their total.");
            System.out.println("	-Dealer “Hits” until they equal or exceed 8.");
            System.out.println("	-The goal is to have a higher card total than the dealer without going over 10.5.");
            System.out.println("	-If the player total equals the dealer total, it is a “Push” and the hand ends.");
            System.out.println("	-Players win their bet if they beat the dealer. And can then give the sips they have won out to the other players");
            System.out.println("	-Before the round ends the dealer takes a chance card which can be both good or bad for the dealer.");
            System.out.println("	-After the round the dealer role rotates and a new player is the dealer");
            System.out.println("");
            System.out.println("");

        }
    }

    public void selectPlayerAmount(){
        int i = 0;
        while(i<1 ){
            String input = getUserInput("Indtast mængden af spillere (eller Q for at quitte) ");
            if(input.equalsIgnoreCase("Q")){
                break;
            }

           Main.MAX=Integer.parseInt(input);
            break;
        }

    }
    public void createPlayer() {
        int i = 0;
        ArrayList<List<Double>> lists=new ArrayList<>();
        while(i<Main.MAX){
            String input = getUserInput("Navn? (eller Q for at quitte) ");
            if(input.equalsIgnoreCase("Q")){
                break;
           }
            List<Double> list=new ArrayList<>();
            lists.add(list);
            Main.players.add(new Player(input,i,false,lists.get(i)));
            i++;

        }
        Main.players.get(i-1).setDealer(true);



    }

    /**
     * Denne metode kan kaldes hver gang man have noget data ud af brugeren
     * @param msg
     * @return returnerer det input brugeren skriver i consollen
     */
    public String getUserInput(String msg){
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input;
    }

    public String startDialog(String msg){
        String input = getUserInput(msg);

        if(!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n" )){
            System.out.println("ugyldigt input");
            startDialog(msg);
        }
        return input;
    }

}

    //TODO man skal kunne skrive min 4 spillere in exeption hvis man er mindre en 4.



