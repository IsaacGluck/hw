import java.io.*;
import java.util.*;

public class myList {

    private int[] data;
    private int numItems;
    
    public myList()
    {
	data =new int[1];
	numItems=0;
    }
    
    public void add(int d) {

	if (numItems>=data.length) {
	    int[] tmpArray = new int[data.length+1];
	    for (int i=0;i<data.length;i++) 
		tmpArray[i]=data[i];
	    data = tmpArray;
	}
	data[numItems]=d;
	numItems=numItems+1;
    }

    public void insert(int pos, int d) {
	int[] A = new int[data.length + 1];
	for (int i = 0; i < pos; i ++) {
	    A[i] = data[i];
	}
	A [pos] = d;
	for (int i = pos + 1; i <A.length; i ++) {
	    A[i] = data[i - 1];
	}
	data = A;
	numItems = numItems + 1;
    }

    public String toString() {
	String s =Arrays.toString(data)+" --- " +numItems;
	return s;
    }
}
