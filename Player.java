import java.util.ArrayList;

public class Player {
    int Score;
    int Round;
    ArrayList<String> setInfo;

    public Player(ArrayList<String> setInfo) {
        this.Score = 0;
        this.Round = 0;
        this.setInfo = setInfo;
    }
}
