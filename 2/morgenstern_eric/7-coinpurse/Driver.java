import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Coin c,c2,c3,c4,c5,c6,c7,c8,c9;
	c = new Coin();
	c2 = new Coin("quarter",.25);
	c3 = new Coin("Quarter", .25);
	c4 = new Coin("dime", .1);
	c5 = new Coin("Dime", .1);
	c6 = new Coin("nickel", .05);
	c7 = new Coin("Nickel", .05);
	c8 = new Coin("penny", .01);
	c9 = new Coin("Penny", .01);
	CoinPurse cp;
	cp = new CoinPurse(123, 0.00);
	System.out.println(c.getFace());
	System.out.println(c.getFlips());
	System.out.println(c.getHeads());
	System.out.println(c.getTails());
	System.out.println(c.getProb());
	c.flip();
	c.flip();
	c.flip();
	c.flip();
	c.flip();
	c.flip();
	System.out.println(c.getFace());
	System.out.println(c.getFlips());
	System.out.println(c.getHeads());
	System.out.println(c.getTails());
	System.out.println(c.getProb());
	c.reset();
       	System.out.println(c.getFace());
	System.out.println(c.getFlips());
	System.out.println(c.getHeads());
	System.out.println(c.getTails());
	System.out.println(c.getProb());
	c.changeProb(.25);
       	c.flip();
	c.flip();
	c.flip();
	c.flip();
	c.flip();
	c.flip();
       	System.out.println(c.getFace());
	System.out.println(c.getFlips());
	System.out.println(c.getHeads());
	System.out.println(c.getTails());
	System.out.println(c.getProb());
	System.out.println("NOW TO TEST COINPURSE");
	cp.addTo(c2);
	System.out.println(cp.amount);
	cp.removeFrom(c3);
	System.out.println(cp.amount);
	cp.addTo(c4);
	System.out.println(cp.amount);
	cp.removeFrom(c5);
	System.out.println(cp.amount);
	cp.addTo(c6);
	System.out.println(cp.amount);
	cp.removeFrom(c7);
	System.out.println(cp.amount);
	cp.addTo(c8);
	System.out.println(cp.amount);
	cp.removeFrom(c9);
	System.out.println(cp.amount);
    }
}
