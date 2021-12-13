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

    public Chance() throws FileNotFoundException {
        ArrayList<String[]> holderarr1 = new ArrayList<>();
        File file = new File("src/chancecard.txt");
        Scanner s = new Scanner(file);
        ArrayList<String> holderarr2 = new ArrayList<>();
        String line = "";
        while (s.hasNext()) {
            line = s.nextLine();
            holderarr1.add(line.split("-"));
        }
        s.close();
        String saver = "";
        for (String[] arr : holderarr1) {
            for (String str : arr) {
                holderarr2.add(str);
            }

        }
        String lastQuestion = "";

        for (int i = 0; i < holderarr2.size() - 1; i += 2) {
            lastQuestion = holderarr2.get(i) + "\r\n" + holderarr2.get(i + 1);
            Main.chanceCards.add(lastQuestion);
        }
    }

    /*public int chanceRoll() {
        chanceNum = (int) (6 * Math.random() + 1);
        return chanceNum;

    }

    public int pickChanceCard() {
        Collections.shuffle();

    }

    public void fileReaderChance() throws FileNotFoundException {
        ArrayList<String[]> holderarr1 = new ArrayList<>();
        File file = new File("src/chancecard.txt");
        Scanner s = new Scanner(file);
        ArrayList<String> holderarr2 = new ArrayList<>();
        String line = "";
        while (s.hasNext()) {
            line = s.nextLine();
            holderarr1.add(line.split("-"));
        }
        s.close();
        String saver = "";
        for (String[] arr : holderarr1) {
            for (String str : arr) {
                holderarr2.add(str);
            }

        }
        String lastQuestion = "";

        for (int i = 0; i < holderarr2.size() - 1; i += 2) {
            lastQuestion = holderarr2.get(i) + "\r\n" + holderarr2.get(i + 1);
            Main.chanceCards.add(lastQuestion);
        }




    /* for (int i = 0; i < chanceCard.size(); i++)
            {
            // generating the index using Math.random()
            int index = (int)(Math.random() * chanceCard.size());

            System.out.println("Your Chance is :"
            + chanceCard.get(index));
    */
       /* public int getChanceNum () {
            return chanceNum;
        }

        public void setChanceNum ( int chanceNum){
            this.chanceNum = chanceNum;
        }

        public int getChanceNum2 () {
            return chanceNum2;
        }

        public void setChanceNum2 ( int chanceNum2){
            this.chanceNum2 = chanceNum2;
        }
    }*/
}


