import java.util.*;
import java.io.*;


public class Factorial {
    public int fact(int n){
	if (n==1|| n == 0){
	    return 1;}
	else {
	    return n * fact(n-1);}

}

    public int fact2(int n){
	int returnval= 1;
	if ( n == 0){
	    return returnval;
	}
	else {
	    while (n >= 1){
		returnval = returnval * n;
		n = n-1;

	    }

	}
	return returnval;
    }


	    
    /*claire was my partner for the bottom */	    
		
public int gcd (int a, int b) {
	int i = 1;
	int answer = 1;
	if (a > b) {
	    i = b;
	    while (i > 0) {
		if ((a % i == 0) && (b % i == 0)) {
			answer = i;
			i = 0;
		    }
		else {
		    i = i - 1;
		}
	    }
	}
	else { gcd(b,a); }
	return answer;
    }
    
    public int gcd2 (int a, int b) {
	int r = 1;
	int gcd = 1;
	if (b == 0) {
	    gcd = a;
	    }
	else {
	    r = (a % b);
	    gcd = gcd2(b,r);
	}
	return gcd;
    }

    public boolean isPrime (int n) {
	int i = 2;
        while (i < n) {
	    if (n % i == 0) {
		return false;
	    }
	    else {
		i = i + 1;
	    }
	}
	return true;
    }
	    
	    
		





} 
