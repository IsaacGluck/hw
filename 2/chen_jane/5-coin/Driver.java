import java.io.*;
import java.util.*;

public class Driver {

    public static void main (String[] args) {
	Coin c;
	c = new Coin();

	c.resetCount();
	c.setFace();
	c.addCount();
	System.out.println(c.getFace());
	System.out.println(c.getFlips());
    }

}
