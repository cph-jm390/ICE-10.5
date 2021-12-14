import java.util.ArrayList;
import java.util.List;

public class Round {
    public void roleSwap(){
       for(int i = Main.MAX-1; i>=0;i--){
            if(i==0){
                Main.players.get(i).setDealer(false);
                i=Main.MAX-1;
                Main.players.get(i).setDealer(true);
                System.out.println(Main.players.get(i).getName()+" is now the dealer");
                break;
            }
            if(Main.players.get(i).isDealer()==true) {
                Main.players.get(i).setDealer(false);
                Main.players.get(i - 1).setDealer(true);
                System.out.println(Main.players.get(i - 1).getName()+" is now the dealer");
                break;
            }
        }for(int i=Main.MAX-1;i>=0;i--){
           Main.players.get(i).setHasWon(false);
    }

    }


    public void givePoints(){
        List<Double> resetter=new ArrayList<>();

        for (int i=0;i<Main.players.size();i++){
            for (int k=0;k<Main.players.size();k++) {
                if ((Main.players.get(i).isDealer() == true) && (Main.players.get(i).calculateHandValue(Main.players.get(i).getHandValue()) > 10.5)&&Main.players.get(k).calculateHandValue(Main.players.get(k).getHandValue()) <= 10.5) {
                    Main.players.get(k).setHasWon(true);
                }
            }
            if (Main.players.get(i).isHasWon()==true){

                Main.points.add(i,Main.points.get(i)+1);
                Main.players.get(i).setHasWon(false);

            }/*else if(Main.players.get(i).isHasWon()==false){
                if (Main.points.get(i)==null){
                    Main.points.add(i,0);
                }*/

            Main.players.get(i).setHasWon(false);
        }
        for (int i=0;i<Main.players.size();i++){
            //for(int j=Main.players.get(i).getHandValue().size()-1;j>=0;j--){
                /*if (Main.players.get(i).getHandValue().size()==0){
                    break;
                }*/
                //Main.players.get(i).getHandValue().remove(0);
                Main.players.get(i).setHandValue(resetter);
                /*System.out.println(Main.players.get(i).getHandValue());
            }break;*/
        }
    }
    public void setWinner(){
        for (int i = 0; i < Main.MAX; i++) {
            for (int j = 0; j < Main.MAX; j++) {
                if (Main.players.get(i).calculateHandValue(Main.players.get(i).getHandValue()) > 10.5) { //tjekker om player er over 10,5
                    Main.players.get(i).setHasWon(false);

                } else if (Main.players.get(i).calculateHandValue(Main.players.get(i).getHandValue()) < Main.players.get(j).calculateHandValue(Main.players.get(j).getHandValue()) && Main.players.get(j).isDealer()==true) {
                    Main.players.get(i).setHasWon(false);
                }else if (Main.players.get(i).isDealer()==true){
                    Main.players.get(i).setHasWon(false);


            }else{
                    Main.players.get(i).setHasWon(true);
                }
        }
        }
    }
    //end round
}