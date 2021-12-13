public class Round {
    public void roleSwap(){
       for(int i = Main.MAX-1; i>=0;i--){
            if(i==0){
                Main.players.get(i).setDealer(false);
                i=Main.MAX-1;
                Main.players.get(i).setDealer(true);
                break;
            }
            if(Main.players.get(i).isDealer()==true) {
                Main.players.get(i).setDealer(false);
                Main.players.get(i - 1).setDealer(true);
                break;
            }
        }for(int i=Main.MAX-1;i>=0;i--){
           Main.players.get(i).setHasWon(false);
    }

    }
    public void givePoints(){
        for (int i=Main.MAX-1;i>=0;i--){
            if (Main.players.get(i).isHasWon()==true){
                Main.points.add(i,1);
                Main.players.get(i).setHasWon(false);
            }
            Main.players.get(i).setHasWon(false);
        }
        for (int i=0;i<Main.players.size();i++){
            for(int j=Main.players.get(i).getHandValue().size()-1;j>=0;j--){
                if (Main.players.get(i).getHandValue().remove(j)==null){
                    break;
                }
                Main.players.get(i).getHandValue().remove(j);
            }break;
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