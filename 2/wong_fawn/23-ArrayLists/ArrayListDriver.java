import java.util.*;
import java.io.*;

public class ArrayListDriver {
    public static void main (String[] args) {
	ArrayList<String> a = new ArrayList<String>();
	ArrayList<String> b = new ArrayList<String>();
    long start, end, difference;
	int count = 10;

		/* RESULTS

	   Adding: 100000
	   Adding from end: 21
	   Adding at beginning: 2839
	   Removing: 100000
	   Removing from beginning: 2691
	   Removing from end: 1

	   Adding: 10000
	   Adding from end: 2
	   Adding at beginning: 49
	   Removing: 10000
	   Removing from beginning: 50
	   Removing from end: 3

	   Adding: 1000
	   Adding from end: 0
	   Adding at beginning: 1
	   Removing: 1000
	   Removing from beginning: 0
	   Removing from end: 0
		*/

	//System.out.println("Adding: " + count);

	//start = System.currentTimeMillis();
	for (int i = 0; i < count; i++) {
	    a.add(i + "");
	}
	//end = System.currentTimeMillis();
	//difference = end - start;
	//System.out.println("\nAdding from end: " + difference);

	/*start = System.currentTimeMillis();
	for (int i = 0; i <= count; i++) {
	    b.add(0, "x");
	}
	end = System.currentTimeMillis();
	difference = end - start;
	System.out.println("Adding at beginning: " + difference);
	*/

	System.out.println("\nReversing");
	ArrayList<String> c = new ArrayList<String>(a.size()); 	
	System.out.println(a);
	for (int i = 0; i < count; i++) {
		c.add(a.get(count - 1 - i));
	}
	a = c;
	System.out.println(a);

	/*System.out.println("\nRemoving: " + count);

	start = System.currentTimeMillis();
	for (int i = 0; i <= count; i++) {
	    a.remove(0);
	}
	end = System.currentTimeMillis();
	difference = end - start;
	System.out.println("\nRemoving from beginning: " + difference);

	start = System.currentTimeMillis();
	for (int i = 0; i <= count; i++) {
	    b.remove(b.size() - 1);
	}
	end = System.currentTimeMillis();
	difference = end - start;
	System.out.println("Removing from end: " + difference);
	*/



    }
}