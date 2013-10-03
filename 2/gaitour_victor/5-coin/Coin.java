import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int outcomeHeads, outcomeTails, outcomeTotal;
    private double fairness=0.0;
    
    public void resetCount(){
	outcomeHeads=0;
	outcomeTails=0;
    }
    public String getFace(){
	return face;
    }
    public String coinFlip(){
	int r = (int )(Math.random() * 100 + 1);
	if (r > fairness* 100.0) face = "tails";
	else face = "heads";
	return face;
    }
}