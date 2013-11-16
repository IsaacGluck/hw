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
    
    public void add(int d) {

	if (numItems>=data.length) {
	    System.out.println("Growing");
	    int[] tmpArray = new int[data.length+(data.length/2)];
	    for (int i=0;i<data.length;i++) 
		tmpArray[i]=data[i];
	    data = tmpArray;
	}

	
	// then add
	data[numItems]=d;
	numItems=numItems+1;
    }
    

	public void insert (int pos, int d){
		int[] temparray= new int[data.length+1];
		for (int i=0;i<pos;i++){
			temparray[i]=data[i];}
		temparray[pos]=d;
		for (int i=pos;i<data.length;i++){
			temparray[i+1]=data[i];	}
		data=temparray;
		numItems=numItems+1;
	}

	public int remove (int pos){
		int output=data[pos];
		for (int i=pos; i<data.length-1;i++){
			data[i]=data[i+1];
		}
		data[data.length-1]=0;
		numItems=numItems-1;
		return output;
	}






















    public String toString() {
	String s =Arrays.toString(data)+" --- " +numItems;
	return s;
    }
}
