import java.io.*;
import java.util.*;

public class Coin {
    //Instance Variables;
    private int flips, tails, heads;
    private double fairness;
    private String face;

    //Constructors;
    public Coin(){
	face = "heads";
	heads = 0;
	tails = 0;
	flips = 0;
	fairness = 0.5;

    }

    //Methods;
    public void resetFlips(){
	flips = 0;
    }

    public String getFace(){
	return face;
    }

    public int getFlips(){
	return flips;
    }

    public void FlipCoin(){
	if (Math.random() >= fairness){
	    face = "heads";
	    heads = heads + 1;
	}
	else {
	    face = "tails";
	    tails = tails + 1;
	}
	flips = flips + 1;
	    }

    public void RiggCoin(double n){
        if (Math.random() >= n){
	    face = "heads";
	    heads = heads + 1;
	}
	else {
	    face = "tails";
	    tails = tails + 1;
	}
	flips = flips + 1;
    }
}

    
