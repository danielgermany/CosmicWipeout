import java.util.ArrayList;
import java.util.Collections;

public class Round {
    int Score;
    int avail_cubes;
    ArrayList<String> setInfo;

    public Round() {
        this.setInfo = null;
        this.Score = 0;
        this.avail_cubes = 0;

    }

    public void CalculateScore() {
        int score = 0;
        int scoring_cubes = 0;
        int freq_5 = Collections.frequency(this.setInfo, "5");
        int freq_10 = Collections.frequency(this.setInfo, "10");

        scoring_cubes = freq_10 + freq_5;

        if (freq_5 >= 3) {
            score += 50;
            freq_5 -= 3;
        }
        if (freq_10 >= 3) {
            score += 100;
            freq_10 -= 3;
        }

        score = (freq_5 * 5) + (freq_10 * 10);
        this.Score += score;
        this.avail_cubes -= scoring_cubes;
    }
}
