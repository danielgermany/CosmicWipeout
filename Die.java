import java.util.ArrayList;
import java.util.List;

public class Die {
    //purpose: creates a final of the "die" we are going to use
    //pre-conditions: none
    //post-conditions: RULEINFO is created
    private static final List<Integer> RULEINFO = new ArrayList<Integer>(
            List.of(2, 3, 4, 5, 6, 10));
    Integer value;

    //purpose: constructs class
    //pre-conditions: none
    //post-conditions: Object is constructed
    public Die() {
        this.value = null;
    }
    //purpose: roll our die using RULEINFO
    //pre-conditions: none
    //post-conditions: the die is rolled
    // Rolls and returns one of the 6 strings into value of the object
    public void roll() {
        Integer value = RULEINFO.get((int) Math.floor(Math.random() * RULEINFO.size()));
        this.value = value;

    }
}
