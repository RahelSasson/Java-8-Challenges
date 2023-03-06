//BS'D
/*
This game is meant for two or more players. In this game, the players take turns flipping a
coin. Before the coin is flipped, players should guess if the coin will land face up or face down.
If a player guesses correctly, then that player is awarded a point. If a player guesses incorrectly,
then that player will lose a point. The first player to score five points is the winner.
 */
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {

        HeadsorTailsPlayer player1 = new HeadsorTailsPlayer();
        HeadsorTailsPlayer player2 = new HeadsorTailsPlayer();
        Coin coin = new Coin();
        boolean winner = false;

        while(!winner) {
            Scanner s = new Scanner(System.in);

            System.out.println("Player 1 please enter your guess (Heads / Tails)" );
            String str = s.next();
            str = errorHandling(str);
            player1.guess(str);

            System.out.println("Player 2 please enter your guess (Heads / Tails)" );
            str = s.next();
            str = errorHandling(str);
            player2.guess(str);

            coin.flip();

            player1.setPoints(coin);
            player2.setPoints(coin);

            System.out.println("Player 1 guessed: " + player1.getGuess());
            System.out.println("Player 2 guessed: " + player2.getGuess());
            System.out.println("Coin Flip: " + coin.getSideUp());
            System.out.println("Player 1 Points: " + player1.getPoints() + " Player 2 Points: " + player2.getPoints());

            if(player1.getPoints() == 5) {
                System.out.println("Player 1 wins!");
                winner = true;
            }
            if(player2.getPoints() == 5) {
                System.out.println("Player 2 wins!");
                winner = true;
            }

        }
    }
    public static String errorHandling(String str) {
        Scanner s = new Scanner(System.in);
        while(!(str.equalsIgnoreCase("heads") || str.equalsIgnoreCase("tails"))) {
            System.out.println("Invalid input, try again (Heads / Tails) - press 'x' to quit");
            str = s.next();
            if(str.equalsIgnoreCase("x")) {
                System.exit(0);
            }
        }
        return str;
    }
}
