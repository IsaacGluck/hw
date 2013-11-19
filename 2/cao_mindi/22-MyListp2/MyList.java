import java.io.*;
import java.util.*;

public class myList {
    private int[] data;
    private int numItems;
    private int[] tmp;
    
    public myList() {
	data = new int[5];
	numItems=0;
    }

    public boolean isFull() {
	return numItems >= data.length;
    }

    public void grow() {
	    int[] tmpArray = new int[data.length+data.length/2];
	    for (int i=0;i<data.length;i++) 
		tmpArray[i]=data[i];
	    data = tmpArray;
    }

    public void add(int d) {
	if (isFull()){
	    grow();
	}
        data[numItems]=d;
        numItems = numItems + 1;
    }
    
    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }
	
    public void add(int pos, int d) {
	if (isFull()){
	    grow();
	    tmp = data;
	    for (int i = pos + 1; i < tmp.length; i ++){
		tmp[i] = data[i - 1];
	    }
	    tmp[pos] = d;
	    numItems ++;
	}
	else{
	    for (int i = pos + 1; i < tmp.length; i ++){
		tmp[i] = data[i - 1];
	    }
	    tmp[pos] = d;
	     numItems ++;
	}
    }
	
    public void remove(int pos) {
	tmp = data;
	for(int i = pos; i < data.length - 1; i ++){
	    tmp[i] = data[i + 1];
		}
	numItems --;
    }

	public int size() {
	    return numItems;
	}
	public int get(int pos) {
	    return data[pos];
	}
	public void set(int pos, int d) {
	    data[pos] = d;
	}
}
