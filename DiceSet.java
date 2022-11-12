import java.util.ArrayList;

public class DiceSet {
    // instance variables
    int diceSetSize;
    ArrayList<Integer> dieInfo;

    //purpose: constructs class
    //pre-conditions: diceSetSize must be an int
    //post-conditions: Object is constructed
    public DiceSet(int diceSetSize) {
        this.diceSetSize = diceSetSize;
        ArrayList<Integer> dieInfo = new ArrayList<Integer>(diceSetSize);
        this.dieInfo = dieInfo;
        //this.dieInfo = new ArrayList<String>(List.of("5","5","5","5","5"));
    }
    //purpose: rolls an entire set of die
    //pre-conditions: None
    //post-conditions: an entire set of dice is rolled
    public void rollSet() {
        for (int i = 0; i < diceSetSize; i++) {
            Die die = new Die();
            die.roll();
            if(i == 5){
                if(die.value == 3){
                    die.value = 1;
                }
            }
            this.dieInfo.add(die.value);
        }
    }

}
