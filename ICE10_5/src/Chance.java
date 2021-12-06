public class Chance {
    private int chanceNum;
    private int chanceNum2;

    public int Chance() {
        return 0;
    }

    public int chanceRoll(){
        chanceNum = (int) (6*Math.random() + 1);
        return chanceNum;

    }

    public int pickChanceCard(){
        chanceNum = (int) (50*Math.random() + 1);
        return chanceNum;
    }


}


