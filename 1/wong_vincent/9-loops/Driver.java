import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	Loops a = new Loops();
	Loops b = new Loops();
       	Loops c = new Loops();
	
	System.out.println(a.fact(8));
	System.out.println(b.fact2(8));
	System.out.println(c.gcd(10,2));
    }
}
	
