public class Die {
    private int die;

    public Die(){

    }

    public int throwDie(){
    die = (int) (6*Math.random() + 1);

    return die;
    }

    public int getDie() {
        return die;
    }

    public void setDie(int die) {
        this.die = die;
    }
}
