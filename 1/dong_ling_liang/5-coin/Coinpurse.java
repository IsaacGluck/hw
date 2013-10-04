import java.io.*;
import java.util.*;

public class Coinpurse{

    private double amount;
    
    public Coinpurse(){
    	amount = 0;
    }
    
    public void addTo (Coin c) {
	amount = amount + c.getAmount();
    }
    
    public void removeFrom (Coin c) {
	amount = amount - c.getAmount();
    }
    public double purseValue(){
    	return amount;
    }
}
