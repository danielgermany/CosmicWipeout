
public class CosmicWipeout {
    //purpose: Run the game
    //pre-conditions: None
    //post-conditions: The game has been ran
    public static void main(String[] args) {
        Player Player1 = new Player();
        UserResponseHandling usr = new UserResponseHandling();
        do{
            Round round = new Round();
            DiceSet set = new DiceSet(5);
            set.rollSet();
            round.setInfo = set.dieInfo;
            round.avail_cubes = round.setInfo.size();
            round.CalculateScore();
            Player1.Score += round.Score;
            System.out.println(Player1.Score);
            System.out.println(round.setInfo);
            if(usr.askToEnd()){
                System.out.println("Terminating Game");
                usr.closeReader();
                return;
            }
        }
        while (Player1.Score < 500);

    }
}
