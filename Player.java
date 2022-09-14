import java.util.ArrayList;
import java.util.Collections;

public class Player {
    int Score;
    int Round;
    ArrayList<String> setInfo;

    public Player(ArrayList<String> setInfo) {
        this.Score = 0;
        this.Round = 0;
        this.setInfo = setInfo;
    }

    public void CalculateScore() {
        int score = 0;

        int freq_5 = Collections.frequency(this.setInfo, "5");
        int freq_10 = Collections.frequency(this.setInfo, "10");

        score = (freq_5 * 5) + (freq_10 * 10);

        this.Score = score;
    }
}
