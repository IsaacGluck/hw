import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){
	Bubble Justin = new Bubble();
	Bubble Maria = new Bubble(); 
	Bubble Harry = new Bubble();
	//System.out.println(Justin);
	Long one = System.currentTimeMillis();
	Justin.sort();
	Long two = System.currentTimeMillis();
	//System.out.println(Justin);
	System.out.println("using radix:");
	System.out.println(two - one);

	//System.out.println(Maria);
	one = System.currentTimeMillis();
	Arrays.sort(Maria.get());
	two = System.currentTimeMillis();
	//System.out.println(Maria);
	System.out.println("using built in sort:");
	System.out.println(two - one);

	/*The longer the inital array is the longer it takes to sort the array 
	  using either method. The longer the length of the elements of the 
	  inital array, the longer it takes to sort them using either method. 
	  The method we wrote though is the slowest of the two no matter what.
	*/

	one = System.currentTimeMillis();
	//System.out.println(Justin);
	Justin.bubbleSort();
	two = System.currentTimeMillis();
	//System.out.println(Justin);
	System.out.println("using bubble sort:");
	System.out.println(two - one);
	System.out.println("assignments:" + Justin.getAssign());
	System.out.println("comparisons:" + Justin.getComparisons());

	one = System.currentTimeMillis();
	//System.out.println(Maria);
	Maria.selectionSort();
	two = System.currentTimeMillis();
	//System.out.println(Maria);
	System.out.println("using selection sort:");
	System.out.println(two - one);
	System.out.println("assignments:" + Maria.getAssign());
	System.out.println("comparisons:" + Maria.getComparisons());

	one = System.currentTimeMillis();
	//System.out.println(Harry);
	Harry.insertionSort();
	two = System.currentTimeMillis();
	//System.out.println(Harry);
	System.out.println("using insertion sort:");
	System.out.println(two - one);
	System.out.println("assignments:" + Harry.getAssign());
	System.out.println("comparisons:" + Harry.getComparisons());

	

	

	
    }
}
	
