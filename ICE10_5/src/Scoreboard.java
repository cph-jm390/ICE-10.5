import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Scoreboard {
    //TODO lav kommando !points eller !score for at få visuelt display op for player points


    public void printScores() {
        for (int i = 0; i <= Main.players.size() - 1; i++)
            try {
                if (Main.points.get(i) != null) {
                    System.out.println("");
                    System.out.println(Main.players.get(i).getName() + "         has " + Main.points.get(i) + " points");
                }
                }catch(Exception e){
                System.out.println("");
                    System.out.println(Main.players.get(i).getName() + "         has 0 points");
                }
            }
    }






