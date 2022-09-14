public class CosmicWipeout {
    public static void main(String[] args) {
        DiceSet set = new DiceSet(5);
        set.rollSet();
        Player Player1 = new Player(set.dieInfo);

    }

    public int CalculateScore(String[] set) {
        int score = 0;
        int counter_5 = 0;
        int counter_10 = 0;
        int scoringdie = 0;
        for (int i = 0; i < set.length; i++) {
            switch (set[i]) {
                case "5":
                    score += 5;
                    counter_5++;
                case "10":
                    score += 10;
                    counter_10++;
            }

        }
        if (counter_5 == 3) {
            score += 35;
        }
        if (counter_10 == 3) {
            score += 70;
        }
        scoringdie = counter_10 + counter_5;
        int diceleft = 6 - scoringdie;

        if (diceleft != 0) {

        }
        return score;
    }
}
