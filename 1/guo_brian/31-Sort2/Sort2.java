import java.io.*;
import java.util.*;

public class Sort2 { 
    
    private ArrayList[] buckets = new ArrayList[10];
    private Random r;
    private double[]Test;
    private int[]Test2;
    
    public Sort2(int n) {
	Test = new double[n];
	Test2 = new int[n];
	Random r = new Random();
	for (int i = 0; i < n; i++) 
	    buckets[i] = new ArrayList();
	for (int i = 0; i < n; i++)
	    Test[i] = (Math.random() * 10);
	for (int k = 0; k < n; k++) 
	    Test2[k] = r.nextInt(100);
    }
    
    public void sort() {
	int n = 0;
	for (int x = 0; x < Test2.length; x++) {
	    if (Test2[x] > n)
		n = Test2[x];
	}
	int exponent = 0;
	while (n >= 10) {
	    n = (int) n / 10;
	    exponent = exponent + 1;
	}
	int m = 0;
	while (m < exponent) {
	    for (int i = 0; i < Test2.length; i++) {
		int placeholder = (int) ((Test2[i]/Math.pow(10,m)) % 10);
		buckets[placeholder].add(Test2[i]); 
	    }
	    int[] tempArray = new int[Test2.length];
	    int x = 0;
	    for (int j = 0; j< buckets.length; j++){
		for(int k = 0; k < buckets[j].size(); k++) {
		    tempArray[x] = (Integer)buckets[j].get(k);
		    x = x + 1;
		    }
	    }
	    Test2 = tempArray;
	    for (int i = 0; i < 10; i++) 
		buckets[i] = new ArrayList();
	    m = m + 1;
	}
    }

    public double[] getTest() {
	return Test;
    }
    
    public int[] getTest2() {
	return Test2;
    }

    public String toString() {
	return Arrays.toString(Test);
    }

    public void bubblesort() {
	int comparisons = 0;
	int swaps = 0;
	for (int n = 0; n<Test.length; n++ ) {
	    for (int x = 0; x < Test.length -1 ; x++ ) {
		comparisons = comparisons + 1;
		if (Test[x] > Test[x+1]) {
		    swaps = swaps + 1;
		    double temp = Test[x];
		    Test[x] = Test[x+1];
		    Test[x+1] = temp;
		}
	    }
	}
	System.out.println(comparisons);
	System.out.println(swaps);
    }
    
    public void selectionsort() {
	for (int i = 0; i < Test.length -1; i++) {
	    double smallest = Test[i];
	    int placeholder = i;
	    for (int n = i; n < Test.length; n++) {
		if (Test[n] < smallest){
		    smallest = Test[n];
		    placeholder = n;
		}
	    }
	    Test[placeholder] = Test[i];
	    Test[i] = smallest;
	}	
    }
    public void insertsort() {
    	int i = 0;
    	while (i < Test.length-1) {
	    if (i == -1){
		i = i+1;
	    }
    	    else if (Test[i] > Test[i+1]) {
      	        double temp = Test[i];
    	       	Test[i] = Test[i+1];
       		Test[i+1] = temp;
	       	i = i - 1;
	    }
	    else if (Test[i] <= Test[i+1]) {
       		i = i+1;
	    }
    	}
    }
}

	    
		  
    
