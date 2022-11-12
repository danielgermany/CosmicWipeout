
public class CosmicWipeout {
    //purpose: Run the game
    //pre-conditions: None
    //post-conditions: The game has been ran
    public static void main(String[] args) {
        UserResponseHandling usr = new UserResponseHandling();
        Player ComPlayer = new Player("Daniel");
        Player Player = new Player(" "); //Creates player with placeholder name
        while(true){
            String playerName = usr.askName();
            if((!playerName.equals(ComPlayer.name))){
                Player.name = playerName;
                break;
            }
            else{
                System.out.println("Your name cannot be the same as the computer player's name");
            }
        }
                      
        
        while(true){
            Round roundPlayer = new Round();
            DiceSet setPlayer = new DiceSet(5);
            setPlayer.rollSet();
            roundPlayer.setInfo = setPlayer.dieInfo;
            roundPlayer.avail_cubes = roundPlayer.setInfo.size();
            roundPlayer.CalculateScore();
            Player.Score += roundPlayer.Score;

            System.out.println("Player Score:");
            System.out.println(Player.Score);
            System.out.println(roundPlayer.setInfo);


            Round roundComputer = new Round();
            DiceSet setComputer = new DiceSet(5);
            setComputer.rollSet();
            roundComputer.setInfo = setComputer.dieInfo;
            roundComputer.avail_cubes = roundComputer.setInfo.size();
            roundComputer.CalculateScore();
            ComPlayer.Score += roundComputer.Score;

            System.out.println("Computer Score:");
            System.out.println(ComPlayer.Score);
            System.out.println(roundComputer.setInfo);

            if(usr.askToEnd()){
                System.out.println("Terminating Game");
                usr.closeReader();
                return;
            }
            if(Player.Score > 500 || ComPlayer.Score > 500){
                if(usr.askReplay()){
                    Player.Score = 0;
                    ComPlayer.Score = 0;
                }
                else{
                    usr.closeReader();
                    return;
                }
            }
        }
        

        
    }
}
