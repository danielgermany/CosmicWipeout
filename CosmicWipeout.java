
public class CosmicWipeout {
    public static void main(String[] args) {
        DiceSet set = new DiceSet(5);
        set.rollSet();
        Player Player1 = new Player(set.dieInfo);
        Player1.CalculateScore();
        System.out.println(Player1.setInfo);
        System.out.println(Player1.Score);
    }
}
