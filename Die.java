import java.util.Random;

public class Die {
    private int sides;
    private int value;

    public Die(int sides) {
        this.sides = sides;
        roll();
    }
    public void roll() {
        Random rand = new Random();
        this.value = rand.nextInt(sides) + 1;
        return;
    }

    public int getValue() {
        return value;
    }

    public int getSides() {
        return sides;
    }
}
