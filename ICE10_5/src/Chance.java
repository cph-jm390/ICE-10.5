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

        for (int i = 0; i < holderarr2.size() - 1; i += 3) {
            lastQuestion = holderarr2.get(i) + "\r\n" + holderarr2.get(i + 1)+ "\r\n"+ holderarr2.get(i + 2)+"\r\n";
            Main.chanceCards.add(lastQuestion);

            //picking a random Q's
        }

    }

    public void drawChance() {
        Collections.shuffle(Main.chanceCards);
        System.out.println("");
        System.out.println("Drawing chance card...");
        System.out.println("");
        System.out.println(Main.chanceCards.get(0));

    }
}




