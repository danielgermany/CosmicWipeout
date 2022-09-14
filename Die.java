import java.util.ArrayList;
import java.util.List;

public class Die {

    public static final List<String> RULEINFO = new ArrayList<String>(
            List.of("swirls", "triangular glyphs", "lighting bolts", "5", "starts", "10"));
    String value;

    // constructor
    public Die() {
        this.value = null;
    }

    // Rolls and returns one of the 6 strings into value of the object
    public void roll() {
        String value = RULEINFO.get((int) Math.floor(Math.random() * RULEINFO.size()));
        this.value = value;

    }
}
