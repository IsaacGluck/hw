import java.io.*;
import java.util.*;

public class Turtle {

    public static void main(String[] args) {
    }

    private String Name;
    private int Age;
    private int Speed;	
    
	

    public Turtle(){
	Age = 0;
	Speed = 0;
	Name = "Stray";
    
    }

    public Turtle(String givenName, int givenAge, int givenSpeed){
	Age = givenAge;
	Name = givenName;
	Speed = givenSpeed;
    }

    public Turtle(String givenName){
	Name = givenName;
	Age = 0;
	Speed = 0;
    }


    public void speedUp(int n){
	Speed = Speed + n;
    }

    public void slowDown(int n){
	Speed = Speed - n;
    }

    public void getOlder(){
	Age = Age - 1;
    } 

    public String displayName(){
	return Name;
    }

    public int displayAge(){
	return Age;
    }
    
    public int displaySpeed(){
	return Speed;
    }

    



}

