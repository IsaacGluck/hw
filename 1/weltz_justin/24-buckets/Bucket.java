import java.util.*;
import java.io.*;
public class Bucket{
    private int len = 100000;
    private int[] buckets = new int[len];
    public Bucket() {
	Random r = new Random();
	for (int i = 0; i < len; i ++){
	    buckets[i] = r.nextInt(9000) + 1000;
	}
    }
    public void sort(){
	ArrayList[] water = new ArrayList[len];
	for (int n = 0; n < 4; n++){
	    for (int i = 0; i < len; i++)
		water[i] = new ArrayList();
	    for (int i = 0; i < buckets.length; i++){
		water[(buckets[i] / (int)Math.pow(10, n))% 10].add(buckets[i]);
	    }
	    int m = 0;
	    for (int z = 0; z < water.length; z++){
		if (water[z].size() != 0){
		    for (int i = 0; i < water[z].size(); i++){
			buckets[m] = (Integer)water[z].get(i);
			m = m + 1;
		    }
		}
	    }
	}
    }
    
    public String toString(){
	return Arrays.toString(buckets);
    }

    public int[] get(){
	return buckets;
    }
}
		
		    

	
	
	    
