import java.io.*;
import java.util.*;

public class Arraye {
   
    public int[] Revfill(int n) {
	int[] x = new int[n];
	for (int i=0; i<n; i++) {
	    x[i] = n-i;
	}

	return x;
    }

    public int[] makeRandom(int n, int min, int max) {
	int[] x = new int[n];
	Random r = new Random();
	for (int i=0; i<n; i++) {
	    x[i] = r.nextInt(max-min+1) + min;
	}

	return x;
    }

    public int sum13(int[] a) {
	int x = 0;
	
	for (int i=0; i<a.length; i++) {
	    if (a[i] != 13)
		x += a[i];
	}

	return x;
    }

    public boolean modThe(int[] a) {
	int even = 0;
	int odd = 0;
	int i=0;

	while (i < a.length) {
	    if (a[i] % 2 == 0) {
		even ++;
		odd = 0;
	    }
	    else {
		odd ++;
		even = 0;
	    }

	    if (odd == 3 || even == 3)
		return true;
	}
	
	return false;
    }
}
