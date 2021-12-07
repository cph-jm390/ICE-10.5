public class Round {
    public int round(){
        for (int i = 0; i < Main.players.size();i++) {
            Scoreboard.players[i].becomeDealer();
            }
        return 0;
    }
    }
