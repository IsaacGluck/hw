import java.io.*;
import java.util.*;

public class Bubble{
    private int swaps;
    private int comparisons;

    public int[] sort(){
        for (int n=0;n<numDigit;n++){
            for (int i=0;i<intList.length;i++){
		int digit = 0;
                digit = (intList[i]/(int)Math.pow(10,n))%10;
                buckets[digit].add(intList[i]);
                
            }
            int intCounter = 0;
            for (int i=0;i<buckets.length;i++){
                for (int j=0;j<buckets[i].size();j++){
                    intList[intCounter] = (Integer)buckets[i].get(j);
                    intCounter++;
                }
            }
            
            for (int i=0;i<10;i++){
                buckets[i] = new ArrayList();
            }
        }
        return intList;
    }

    public void  bubbleSort(double[] array) {
	for(int i = 0; i < array.length(); i++) {
	    for(int j = 0; j < array.length(); j++) {
		if (array[j+1]<array[j]) {
		    double holder = 0;
		    holder = array[j];
		    array[j] = array[j+1];
		    array[j+1] = holder;
		    swaps = swaps + 1;
		    comparisons = comparisons + 1;
		}
	    }
	}
    }

    public void insertion (int[a]){
	int x = a[a.length()];
	int temp = 0;
	for (int i = a.length; i >= 0; i--){
	    for (int j = 0; j < a.length; j++){
		if (a[j] < x){
		    x = a[j]
			}
	    }
	}
    }

    public void selection (int[] a){
	int temp = a[0];
	int holder = 0;
	for (int j = 0; j < a.length; j++){
	    for (int i = 0; i < a.length; i++){
		if (a[i] < temp){
		    temp = a[i];
		}
	    }
	    holder = temp;
	    temp = a[j];
	    a[j] = holder;
	}
    }

}
