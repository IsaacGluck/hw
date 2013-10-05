import java.io.*;
import java.util.*;

public class CoinDriver {
    
    public static void main (String[] args) {
	Coin c1;
	c1 = new Coin();
	/*
	System.out.println(c1.flip());
	System.out.println(c1.getFlips());

	*/
	
	// the flip() and getFlips() methods work in Coin
	// the constructor with no parameters works

	Coin c2;
	c2 = new Coin("quarter", 0.25);
	/*
	System.out.println(c2.getValue());
	System.out.println(c2.flip());
	System.out.println(c2.flip());
	System.out.println(c2.flip());
	System.out.println(c2.flip());
	System.out.println(c2.flip());
	System.out.println(c2.flip());
	System.out.println(c2.flip());
	System.out.println(c2.getFlips());
	System.out.println(c2.getHeads());
	System.out.println(c2.getTails());
	*/
	
	// the getHeads(), getTails() methods, and the fairness in flip() work
	// the setValue() and constructor with parameters work

	CoinPurse cp1;
	cp1 = new CoinPurse();
	/*System.out.println(cp1.getAmount());
	cp1.addTo(c1);
	cp1.removeFrom(c2);
	System.out.println(cp1.getAmount());
	*/
	
	// addTo(coin), removeFrom(coin), and getAmount() methods work
	// from CoinPurse
	
    }
}

