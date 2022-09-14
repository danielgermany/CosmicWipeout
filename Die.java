import java.util.ArrayList;
import java.util.List;

public class Die {

    public static final List<String> RULEINFO = new ArrayList<String>(
            List.of("swirls", "triangular glyphs", "lighting bolts", "5", "starts", "10"));
    String value;

    public Die(String value) {
        this.value = value;
    }

    public String roll() {
        String value = RULEINFO.get((int) Math.floor(Math.random() * RULEINFO.size()));
        return value;

    }

    public static void main(String[] args) {
        Die TestDie = new Die(null);
        System.out.println(TestDie.roll());
    }
}
