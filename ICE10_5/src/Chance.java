public class Chance {
    private int chanceNum;


    public Chance() {
    }

    public int chanceRoll(){
        chanceNum = (int) (6*Math.random() + 1);
        return chanceNum

    }


}
    //TODO math.random


