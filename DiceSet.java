import java.util.ArrayList;

public class DiceSet {
    // instance variables
    int diceSetSize;
    ArrayList<String> dieInfo;

    //purpose: constructs class
    //pre-conditions: diceSetSize must be an int
    //post-conditions: Object is constructed
    public DiceSet(int diceSetSize) {
        this.diceSetSize = diceSetSize;
        ArrayList<String> dieInfo = new ArrayList<String>(diceSetSize);
        this.dieInfo = dieInfo;
    }
    //purpose: rolls an entire set of die
    //pre-conditions: None
    //post-conditions: an entire set of dice is rolled
    public void rollSet() {
        for (int i = 0; i < diceSetSize; i++) {
            Die die = new Die();
            die.roll();
            this.dieInfo.add(die.value);
        }
    }

}
