import java.util.*;
import java.io.*;

public class myList {
    private int[] data;
    private int numItems;
    
    public myList() {
	data = new int[5];
	numItems=0;
    }

    public boolean isFull() {
	return numItems >= data.length;
    }

    public void grow() {
	    // "grow" the array by creating a new one and copying over
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
	}
	if(pos > (data.length - 1)){
	    System.out.println("Invalid position input");
       	}
	else{
	    for(int i = numItems; i >= pos; i --){
		data[i] = data[i - 1];
	    }
	    data[pos] = d;
	    numItems = numItems + 1;
	}
    }
	    
    public void remove(int pos) {
	if (pos >= data.length)
            System.out.println("Invalid position input");
        else{
            for (int i = pos; i + 1 < numItems; i++)
                data[i] = data[i + 1];
        }
        data[numItems - 1] = 0;
        numItems = numItems - 1;
    }
	

    public int find(int d){
	for(int i = 0; i < numItems; i ++){
	    if(data[i] == d){
		return d;
	    }
	    
	}
	return -1;
    }


    public int fremove(int d){
	for(int i = 0; i < numItems; i ++){
	    if(data[i] == d){
		remove(i);
		return -1;
	    }
	}
	return 1;
    }
		
    public int size() {
	return numItems;
    }

    public int get(int pos) { //assumes input is a valid position
	return data[pos];
    }


    public void set(int pos, int d) {
	if(pos >= data.length){
	    System.out.println("Invalid position input");
	}
	else{
	data[pos] = d;
	}
    }

}

