
public class CosmicWipeout {
    public static void main(String[] args) {
        Player Player1 = new Player();

        while (Player1.Score < 500) {
            Round round = new Round();
            DiceSet set = new DiceSet(5);
            set.rollSet();
            round.setInfo = set.dieInfo;
            round.avail_cubes = round.setInfo.size();
            round.CalculateScore();
            Player1.Score += round.Score;
            System.out.println(Player1.Score);
            System.out.println(round.setInfo);
        }

    }
}
