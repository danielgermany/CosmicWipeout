public class DiceSet {
    int roll() {
        int value = (((int) Math.random()) % 6) + 1;
        return value;
    }

    public int[] rollSet() {
        int[] set = new int[5];
        for (int i = 0; i < set.length; i++) {
            set[i] = this.roll();
        }
        return set;
    }

    public int[] rereollSet(int diceleft) {
        int[] set = new int[diceleft];
        for (int i = 0; i < set.length; i++) {
            set[i] = this.roll();
        }
        return set;
    }
}
