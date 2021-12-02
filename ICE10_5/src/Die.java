public class Die {
    private int die;

    public Die(){

    }

    public int throwDie(){
    die = (int) (6*Math.random() + 1);

    return die;
    }
}
//TODO get og setter