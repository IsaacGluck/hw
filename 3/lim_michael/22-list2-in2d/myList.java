import java.io.*;
import java.util.*;

public class myList {
       private int[] data;
       private int numItems;

       public myList() {
          data = new int[5];
	  numItems = 0;
       }


    public boolean isFull() {
	return numItems >= data.length;
    }

    public void grow() {
	int[] tmpArray = new int[data.length+data.length/2];
	for (int i=0;i<data.length;i++) {
	    tmpArray[i]=data[i];
	}
	data = tmpArray;
    }

    public void add(int d) {
	if (isFull()) {
	    grow();
    }

	data[numItems] = d;
	numItems=numItems+1;
    }

    public void add(int pos, int d) {
	while(pos > data.length)
	    grow();
	for(int i = pos; i<data.length; i++){
	    
	}
    }

    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }

    public int get(int pos){
    }

    public void set(int pos, int d){
    }

    public int size() {
    }
}
