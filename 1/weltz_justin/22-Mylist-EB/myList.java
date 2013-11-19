import java.io.*;
import java.util.*;
import java.io.*;
import java.util.*;
public class myList {
    
    private int[] data;
    private int numItems;
    
    public myList()
    {
	data =new int[10];
	numItems=0;
    }
    
    public boolean full() {
	return numItems>=data.length;
    }
    
    public void grow() {
	int[] tmpArray = new int[data.length+(data.length/2)];
	for (int i=0;i<data.length;i++) 
	    tmpArray[i]=data[i];
	data = tmpArray;
    }
    
    public void add(int d) {
	if (full()) {
	    grow();
	}
	data[numItems]=d;
	numItems=numItems+1;
    }
    public void insert(int pos, int d){
	add(0);
	if (pos < data.length){
	    int gone = data[pos];
	    data[pos] = d;
	    
	    for (int i = pos + 1; i < data.length; i++){
		int gone1 = data[i];
		data[i]= gone;
		gone = gone1;
	    }
	    numItems = numItems + 1;
	}
	else { System.out.println("Wrong input");}
    }
    public void remove(int pos){
	if (pos >= data.length)
	    System.out.println("Wrong input");
	else{
	    for (int i = pos; i + 1 < numItems; i++)
		data[i] = data[i + 1];
	}
	data[numItems - 1] = 0;
	numItems = numItems - 1;
    }
    public int size(){
	return numItems;
    }
    public int get(int pos){
	return data[pos];
    }
    public void set(int pos, int d){
	data[pos] = d;
    }
    public int find (int d){ 
	for (int i = 0; i < data.length; i++){
	    if (data[i] == d){
		return d;
	    }
	}
	return -1;
    }
    public void fremove(int d){
	boolean t = true;
	int i = 0;
	while ( i<data.length && t){
	    if (data[i] == d){
		remove(i);
		t = false;
	    }
	    i = i + 1;
	}
    }	
    
    public String toString() {
	String s =Arrays.toString(data)+" --- " +numItems;
	return s;
    }
}
