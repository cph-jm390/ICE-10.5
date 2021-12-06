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
        chanceNum = (int) (52*Math.random() + 1);
        return chanceNum;
    }

    public int getChanceNum() {
        return chanceNum;
    }

    public void setChanceNum(int chanceNum) {
        this.chanceNum = chanceNum;
    }

    public int getChanceNum2() {
        return chanceNum2;
    }

    public void setChanceNum2(int chanceNum2) {
        this.chanceNum2 = chanceNum2;
    }
}


