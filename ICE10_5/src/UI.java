import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UI {
//TODO evt. smæk selectPlayerAmount + createPlayer sammen
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



