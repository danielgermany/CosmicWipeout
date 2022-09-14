public class CosmicWipeout {
    public String[] Ruleset(int[] set) {
        String[] correctedSet = new String[6];

        for (int i = 0; i < set.length; i++) {
            switch (set[i]) {
                case 1:
                    correctedSet[i] = "Swirls";
                case 2:
                    correctedSet[i] = "triangular glyphs";
                case 3:
                    correctedSet[i] = "lighting bolts";
                case 4:
                    correctedSet[i] = "5";
                case 5:
                    correctedSet[i] = "starts";
                case 6:
                    correctedSet[i] = "10";
            }
        }
        return correctedSet;
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
