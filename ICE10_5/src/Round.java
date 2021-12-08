public class Round {
    public void newRoundStart(){
         for(int i = Main.MAX; i>=0;i--){
             if(i==0){
                 Main.players.get(i).setDealer(false);
                 i=Main.MAX;
                 Main.players.get(i).setDealer(true);
             }
             if(Main.players.get(i).isDealer()==true) {
                 Main.players.get(i).setDealer(false);
                 Main.players.get(i - 1).setDealer(true);
             }
         }
    }
}