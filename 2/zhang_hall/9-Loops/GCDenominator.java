import java.io.*;
import java.util.*;

public class GCDenominator{

    public int GCD(int a, int b){
	int counter = b;
	if (a <= b){
	    return GCD(b,a);
	}
	while (true){
	    if (a % counter == 0 && b % counter == 0){
		    return counter;
		}
	    counter = counter - 1;
	}
    }
    
    public int GCD2(int a, int b){
	if (a <= b){
	    return GCD2(b,a);
	}
	if (a % b == 0){
	    return b;
	}
	else{
	    return GCD2(a, (a % b));
	}
    }

    public boolean isPrime(int n){
	if (n == 2){
	    return true;
	}
	if (n % 2 == 0){
	    return false;
	}
	int counter = 3;
	while (counter <= Math.sqrt(n)){
	    if (n % counter == 0){
		return false;
	    }
	    else{
		counter = counter + 2;
	    }
	}
	return true;
    }
}
