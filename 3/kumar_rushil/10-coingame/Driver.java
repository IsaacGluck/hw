import java.util.*;
import java.io.*;
public class Driver{
    public static void main (String [] args) {
	CoinGame game1 = new CoinGame();
	game1.startGame();
	game1.play(10);
	game1.preciseDoubles();
	System.out.println("After 10 rounds...");
	System.out.println("The pot has $" + game1.getPotbalance());
	if (game1.getWinner() != "tie"){
	    System.out.print("The winner is " + game1.getWinner());
	    System.out.println(" with $" + game1.getWinnerBalance());
	} else {
	    System.out.print("The game is a tie and both players have $" + game1.getWinnerBalance());
	}
    }
}
