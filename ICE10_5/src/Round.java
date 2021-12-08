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
        }
    }
}