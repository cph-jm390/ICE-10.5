import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Double> handCounter=new ArrayList<>();
    static ArrayList<Player> players = new ArrayList<Player>();
    static ArrayList<Integer> points=new ArrayList<>();
    static ArrayList<String> chanceCards=new ArrayList<>();



    //public static UI ui= new UI();
    static int MAX = 8;
    public static double maxTotalValue=10.5;
    public static Player currentPlayer;


    public static void main(String[] args) {

        PlayGame game1=new PlayGame();
        game1.startGame();


    }

    }





