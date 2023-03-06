import java.util.Random;

public class Coin {

    private String sideUp;

    public Coin() {
        flip();
    }

    public void flip() {
        String s = "";
        Random rand = new Random();
        int n = rand.nextInt(2)+0;
        if(n == 0)
            this.sideUp = "Tails";
        else
            this.sideUp = "Heads";
    }

    public String getSideUp() {
        return sideUp;
    }
}
