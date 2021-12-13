import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Chance {
    private int chanceNum;
    private int chanceNum2;

    public int Chance() {
        return 0;
    }

    public int chanceRoll(){
        chanceNum = (int) (6*Math.random() + 1);
        return chanceNum;

    }

    public int pickChanceCard() {
        Collections.shuffle();

    }

    public void fileReaderChance() throws FileNotFoundException {
        Scanner s = new Scanner(new File("src/chancecard.txt"));
        ArrayList<String> chanceCard = new ArrayList<String>();
        String line = "";
        while (s.hasNext()){
            line = s.nextLine();
            line.split("-");
            chanceCard.add(s.next());
        }
        s.close();
        System.out.println(chanceCard);
    }


    /* for (int i = 0; i < chanceCard.size(); i++)
            {
            // generating the index using Math.random()
            int index = (int)(Math.random() * chanceCard.size());

            System.out.println("Your Chance is :"
            + chanceCard.get(index));
    */
    public int getChanceNum() {
        return chanceNum;
    }

    public void setChanceNum(int chanceNum) {
        this.chanceNum = chanceNum;
    }

    public int getChanceNum2() {
        return chanceNum2;
    }

    public void setChanceNum2(int chanceNum2) {
        this.chanceNum2 = chanceNum2;
    }
}


