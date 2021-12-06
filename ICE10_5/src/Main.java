import java.util.ArrayList;

public class Main {
    static ArrayList<Player> players = new ArrayList<Player>();
    static ArrayList<Integer> points=new ArrayList<>();



    public static UI ui= new UI();
    static int MAX = 8;
    public static Player currentPlayer;


    public static void main(String[] args) {
        ui.selectPlayerAmount();
        ui.createPlayer();



    }
    }
}

//TODO for each loop
