public class Player {

    private String playerName;
    private int points;
    private Die die;

    public Player(String playerName) {
        this.playerName = playerName;
        this.points = 50;
        this.die = new Die(6);
    }

    public void roll() {
        die.roll();
        if(points - die.getValue() == 1)
            points = 1;
        else if(points - die.getValue() < 1)
            points += die.getValue();
        else
            points -= die.getValue();
        return;
    }

    public int getPoints() {
        return points;
    }

    public String getPlayerName() {
        return playerName;
    }
}
