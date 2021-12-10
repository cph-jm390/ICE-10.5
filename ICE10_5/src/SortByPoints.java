import java.util.Comparator;

public class SortByPoints implements Comparator<Player> {
    // Used for sorting in ascending order of
    // roll number
    @Override
    public int compare(Player o1, Player o2) {
        return o1.getPlayerScore() - o2.getPlayerScore();
    }
}
