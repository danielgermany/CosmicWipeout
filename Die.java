import java.util.ArrayList;
import java.util.List;

public class Die {
    //purpose: creates a final of the "die" we are going to use
    //pre-conditions: none
    //post-conditions: RULEINFO is created
    public static final List<String> RULEINFO = new ArrayList<String>(
            List.of("swirls", "triangular glyphs", "lighting bolts", "5", "starts", "10"));
    String value;

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
        String value = RULEINFO.get((int) Math.floor(Math.random() * RULEINFO.size()));
        this.value = value;

    }
}
