import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String [] args) {
	Coin c;
        c = new Coin("Penny", 1);
	c.flip();
	System.out.println(c.getFace());
	c.flip();
	System.out.println(c.getFace());
	c.flip();
	System.out.println(c.getFace());
	System.out.println("Percent of Heads is" + c.perctHead());
    }
}
