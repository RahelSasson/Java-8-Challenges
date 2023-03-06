public class HeadsorTailsPlayer {
    private int points;
    private String guess;

    public HeadsorTailsPlayer() {
        this.points = 0;
        this.guess = "";
    }

    public void guess(String s ) {
        this.guess = s;
    }

    public void setPoints(Coin coin) {
        if(coin.getSideUp().equalsIgnoreCase(guess))
            points++;
        else
            points--;

    }

    public int getPoints() {
        return points;
    }

    public String getGuess() {
        return guess;
    }
}
