import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String [] args){
    Loops l = new Loops();
    Loops2 l2=new Loops2();
    System.out.println(l.fact(9));
    System.out.println(l.fact(4));
    System.out.println(l.fact2(9));
    System.out.println(l.fact2(4));
    System.out.println(l2.GCD(3571,3559));
    System.out.println(l2.GCD2(3571,3559));
    System.out.println(l2.isPrime(13));
}
}