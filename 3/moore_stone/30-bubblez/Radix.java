import java.io.*;
import java.util.*;

public class Radix {
    private int[] a;
    private int digits;
    private ArrayList[] buckets;

    public Radix() {
	a = new int[10];
	for (int i=0;i<10;i++) {
	    a[i]=(int)(Math.random()*10000);
	}
	digits = 4;
	buckets = new ArrayList[10];
	for (int i=0;i<10;i++) {
	    buckets[i] = new ArrayList<Integer> ();
	}
    }
    
    public Radix(int items, int digs) {
	a = new int[items];
	for (int i=0;i<items;i++) {
	    a[i]=(int)(Math.random()*1*Math.pow(10,digs));
	}
	digits = digs;
	buckets = new ArrayList[10];
	for (int i=0;i<10;i++) {
	    buckets[i] = new ArrayList<Integer> ();
	}
    }
    
    public int[] getA() {
	return a;
    }
    
    public String toString() {
	return Arrays.toString(a);
    }
    
    public void sort(int[] a) {
        for (int i=0;i<digits;i++) {
	    for (int j=0;j<10;j++) {
		buckets[j] = new ArrayList<Integer> ();
	    }
	    for (int j=0;j<a.length;j++) {                
		int index = (int) ((a[j] / Math.pow(10,i)) % 10);
		buckets[index].add((Integer)(a[j]));
	    }
	    int buk = 0;
	    int j = 0;
	    while (buk<10) {
		for (int k=0;k<buckets[buk].size();k++) {
		    a[j]=(Integer)buckets[buk].get(k);
		    j++;
		}
		buk++;
	    }
        }
    }

    public int[] bsort(int[] a){
	int compares = 0;
	int swaps = 0;
	int loops = a.length-1;
	boolean isOrdered = false;
	while (!isOrdered) {
	    isOrdered = true;
	    for (int i=0;i<loops;i++) {
		compares++;
		if (a[i] < a[i+1]) {
		    swaps++;
		    isOrdered = false;
		    int temp = a[i+1];
		    a[i+1] = a[i];
		    a[i] = temp;
		}
	    }
	}
	System.out.print("\t"+compares+"\t");
	System.out.print("\t"+swaps+"\t");
	return a;
    }
}

