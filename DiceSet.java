import java.util.ArrayList;

public class DiceSet {
    // instance variables
    int diceSetSize;
    ArrayList<String> dieInfo;

    // Constructor
    /**
     * @param diceSetSize
     * @param dieInfo
     */
    public DiceSet(int diceSetSize) {
        this.diceSetSize = diceSetSize;
        ArrayList<String> dieInfo = new ArrayList<String>(diceSetSize);
        this.dieInfo = dieInfo;
    }

    public void rollSet() {
        for (int i = 0; i < diceSetSize; i++) {
            Die die = new Die();
            die.roll();
            this.dieInfo.add(die.value);
        }
    }

}
