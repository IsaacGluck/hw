import java.io.*;
import java.util.*;
public class RadixSort{

    ArrayList[] buckets = new ArrayList[10];
    int placevalue = 0;
    int k = 1;

    public RadixSort(){
	for (int i = 0; i < buckets.length; i++){
	    buckets[i]=new ArrayList();
	}
    }

    public int[] Sort(int[] nums, int digits){   //need to put in digit of the highest number
	int[] temp=nums;
	for (int q = 0; q < digits; q ++){ 
	for (int i = 0; i < nums.length; i ++){
	    placevalue = (temp[i]/k) % 10;       //finds the digit at the ones/tens/hundreds/etc. place
	    for (int x = 0; x < buckets.length; x ++){
		if (placevalue == x)            //adds the number to the buckets based on placevalue
		    buckets[x].add((Integer)temp[i]);
	    }
	}
	for (int i = 0; i < nums.length; i ++){ //putting back semi organized #'s into temp array
	    int pos = 0;
	    while(buckets[pos].isEmpty()){      //can't remove from an arraylist if its empty
		pos = pos + 1;
	    }
	    temp[i]=(Integer)buckets[pos].remove(0);
	}
	k = k *10; //increase divisor from 1 to 10 to 100 to etc.
	}
	return temp;
    }
}



